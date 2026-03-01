CREATE TABLE Class(
	id INT PRIMARY KEY,
    name VARCHAR(10),
    teacher VARCHAR(100)
);

CREATE TABLE Student(
	id INT PRIMARY KEY,
    name VARCHAR(100),
    gender VARCHAR(10),
    class_id INT,
    
    FOREIGN KEY (class_id) REFERENCES Class(id)
);

CREATE TABLE Result (
    student_id INT,
    subject VARCHAR(50),
    score DECIMAL(3,1),

    PRIMARY KEY (student_id, subject),
    FOREIGN KEY (student_id) REFERENCES Student(id)
);

INSERT INTO Class (id, name, teacher) VALUES
(1, '12A', 'Ho Cong Trung'),
(2, '12B', 'Dang Tu Anh'),
(3, '12C', 'Nguyen Van Tam');

INSERT INTO Student (id, name, gender, class_id) VALUES
(1, 'Dinh Thi Ngoc', 'Female', 2),
(2, 'Nguyen Thanh Hung', 'Male', 1),
(3, 'Tran Mai Hoa', 'Female', 2),
(4, 'Doan Quang Vinh', 'Male', 1),
(5, 'Cao Anh Dao', 'Female', 3),
(6, 'Tran Kim Tuyen', 'Male', 3);

INSERT INTO Result (student_id, subject, score) VALUES
(1, 'Math', 8),
(2, 'Literature', 7),
(3, 'History', 9.5),
(4, 'Math', 6.8),
(5, 'Literature', 4.9),
(6, 'History', 8.2),
(1, 'Literature', 9.8),
(2, 'Math', 7.2),
(3, 'Literature', 8.8);

-- Questions
--	1. PRIMARY KEY (student_id, subject)

-- 2. 
SELECT st.name, st.gender, c.teacher FROM student st
	JOIN class c ON st.class_id = c.id;
    
-- 3.
SELECT c.teacher, COUNT(st.id) as total_students from Class c
	JOIN Student st
    WHERE c.name = '12C'
    GROUP BY c.teacher;

--  4. 
SELECT c.name AS class_name, COUNT(DISTINCT st.id) AS total_students
	FROM Student st
	JOIN Class c ON st.class_id = c.id
	JOIN Result r_math ON st.id = r_math.student_id
    AND r_math.subject = 'Math'
    AND r_math.score >= 8
	JOIN Result r_lit ON st.id = r_lit.student_id
    AND r_lit.subject = 'Literature'
    AND r_lit.score >= 8
	GROUP BY c.name;
 