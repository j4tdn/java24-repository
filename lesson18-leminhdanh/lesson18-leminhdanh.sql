CREATE SCHEMA student_management;
USE student_management;

CREATE TABLE T01_CLASS (
    C01_CLASS_ID INT PRIMARY KEY AUTO_INCREMENT,
    C01_CLASS_NAME VARCHAR(50) NOT NULL,
    C01_TEACHER VARCHAR(100) NOT NULL
);

CREATE TABLE T02_STUDENT (
    C02_STUDENT_ID INT PRIMARY KEY AUTO_INCREMENT,
    C02_STUDENT_NAME VARCHAR(100) NOT NULL,
    C02_GENDER BIT(1) NOT NULL,
    C02_CLASS_ID INT,
    CONSTRAINT FK_T02_t01 FOREIGN KEY (C02_CLASS_ID) REFERENCES T01_CLASS(C01_CLASS_ID)
);

CREATE TABLE T03_RESULT (
    C03_STUDENT_ID INT,
    C03_SUBJECT VARCHAR(50),
    C03_SCORE DECIMAL(4,2),
    PRIMARY KEY (C03_STUDENT_ID, C03_SUBJECT),
    CONSTRAINT FK_T03_T02 FOREIGN KEY (C03_STUDENT_ID) REFERENCES T02_STUDENT(C02_STUDENT_ID)

);

INSERT INTO T01_CLASS (C01_CLASS_ID, C01_CLASS_NAME, C01_TEACHER) VALUES
(1, '12A', 'Ho Cong Trung'),
(2, '12B', 'Dang Tu Anh'),
(3, '12C', 'Nguyen Van Tam');

INSERT INTO T02_STUDENT 
(C02_STUDENT_ID, C02_STUDENT_NAME, C02_GENDER, C02_CLASS_ID) 
VALUES
(1, 'Dinh Thi Ngoc', 0, 2),
(2, 'Nguyen Thanh Hung', 1, 1),
(3, 'Tran Mai Hoa', 0, 2),
(4, 'Doan Quang Vinh', 1, 1),
(5, 'Cao Anh Dao', 0, 3),
(6, 'Tran Kim Tuyen', 1, 3);

INSERT INTO T03_RESULT 
(C03_STUDENT_ID, C03_SUBJECT, C03_SCORE) 
VALUES
(1, 'Math', 8),
(2, 'Literature', 7),
(3, 'History', 9.5),
(4, 'Math', 6.8),
(5, 'Literature', 4.9),
(6, 'History', 8.2),
(1, 'Literature', 9.8),
(2, 'History', 7.2),
(3, 'Math', 8.8);

-- 1. What is primary key of Result table.
-- The primary key of the T03_RESULT table is the composite key: (C03_STUDENT_ID, C03_SUBJECT)

-- 1. List name, gender and teacher name of all students.
SELECT C02_STUDENT_NAME, C02_GENDER, C01_TEACHER
FROM t02_student t2
JOIN t01_class t1 
    ON t2.C02_CLASS_ID = t1.C01_CLASS_ID;
-- 2. List teacher name and number of all student in class 12C.
SELECT 
    t1.C01_TEACHER,
    COUNT(t2.C02_STUDENT_ID) total_students
FROM T01_CLASS t1
JOIN T02_STUDENT t2 
    ON t1.C01_CLASS_ID = t2.C02_CLASS_ID
WHERE t1.C01_CLASS_NAME = '12C'
GROUP BY t1.C01_TEACHER;

-- 3. List the class name and number of the students who have good at Math (score>=8) and good at Literature (score>=8).
SELECT 
    t1.C01_CLASS_NAME,
    COUNT(DISTINCT t2.C02_STUDENT_ID) AS total_students
FROM T01_CLASS t1
JOIN T02_STUDENT t2 
    ON t1.C01_CLASS_ID = t2.C02_CLASS_ID
JOIN T03_RESULT r1 
    ON t2.C02_STUDENT_ID = r1.C03_STUDENT_ID
JOIN T03_RESULT r2 
    ON t2.C02_STUDENT_ID = r2.C03_STUDENT_ID
WHERE r1.C03_SUBJECT = 'Math'
    AND r1.C03_SCORE >= 8
    AND r2.C03_SUBJECT = 'Literature'
    AND r2.C03_SCORE >= 8
GROUP BY t1.C01_CLASS_NAME;
