CREATE DATABASE IF NOT EXISTS lesson16_HuuThang CHAR SET utf8mb4;
USE lesson16_HuuThang;

-- Phần A : Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên

CREATE TABLE IF NOT EXISTS DEPARTMENT(
	DEPARTMENT_ID INT PRIMARY KEY,
    DEPARTMENT_NAME VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS EMPLOYEE(
	EMPLOYEE_ID INT PRIMARY KEY NOT NULL,
    EMPLOYEE_NAME VARCHAR(100) NOT NULL,
    EMPLOYEE_ADDRESS VARCHAR(255),
    EMPLOYEE_SALARY DECIMAL(10, 2),
    EMPLOYEE_GENDER CHAR(1) CHECK (EMPLOYEE_GENDER IN ('M', 'F')),
	EMPLOYEE_BIRTHDATE DATE,
    EMPLOYEE_HIREDATE DATE,
    EMPLOYEE_DPMID INT,
	CONSTRAINT FK_DEPARTMENT_EMPLOYEE FOREIGN KEY (EMPLOYEE_DPMID) REFERENCES DEPARTMENT(DEPARTMENT_ID)
);

CREATE TABLE IF NOT EXISTS MANAGER (
    MANAGER_ID INT PRIMARY KEY NOT NULL,
    MANAGER_EMPID INT NOT NULL UNIQUE,
    MANAGER_STARTDATE DATE NOT NULL,
	CONSTRAINT FK_DEPARTMENT_MANAGER FOREIGN KEY (MANAGER_ID) REFERENCES DEPARTMENT(DEPARTMENT_ID),
	CONSTRAINT FK_EMPLOOYEE_MANAGER FOREIGN KEY (MANAGER_EMPID) REFERENCES EMPLOYEE(EMPLOYEE_ID)
);

CREATE TABLE IF NOT EXISTS PROJECT (
	PRJ_ID INT PRIMARY KEY NOT NULL,
    PRJ_NAME VARCHAR(100) UNIQUE NOT NULL,
    PRJ_START DATE NOT NULL,
    PRJ_END DATE,
    PRJ_PROFIT DECIMAL(15, 2),
    PRJ_MANAGERID INT NOT NULL, 
    CONSTRAINT FK_EMPLOYEE_PROJECT FOREIGN KEY (PRJ_MANAGERID) REFERENCES EMPLOYEE(EMPLOYEE_ID)
);

CREATE TABLE IF NOT EXISTS WORKS_ON (
	EMPLOYEE_ID INT NOT NULL,
    PRJ_ID INT NOT NULL,
    HOURS DECIMAL(4, 2) NOT NULL CHECK (HOURS >= 0),
    PRIMARY KEY (EMPLOYEE_ID, PRJ_ID),
    CONSTRAINT FK_EMPLOYEE_WORKSON FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID),
    CONSTRAINT FK_PROJECT_WORKSON FOREIGN KEY (PRJ_ID) REFERENCES PROJECT(PRJ_ID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- phần này e dùng tools
INSERT INTO DEPARTMENT (DEPARTMENT_ID, DEPARTMENT_NAME) VALUES
(1, 'Research'),
(2, 'Sales'),
(3, 'Administration'),
(4, 'IT'),
(5, 'Marketing');

INSERT INTO EMPLOYEE (EMPLOYEE_ID, EMPLOYEE_NAME, EMPLOYEE_ADDRESS, EMPLOYEE_SALARY, EMPLOYEE_GENDER, EMPLOYEE_BIRTHDATE, EMPLOYEE_HIREDATE, EMPLOYEE_DPMID) VALUES
(100, 'Nguyễn Văn An', 'Hà Nội', 80000.00, 'M', '1980-01-15', '2005-06-01', 3), -- Trưởng phòng Admin
(101, 'Trần Thị Bình', 'Hải Phòng', 50000.00, 'F', '1985-03-20', '2010-08-10', 1),
(102, 'Lê Văn Cường', 'Đà Nẵng', 45000.00, 'M', '1990-11-05', '2015-05-20', 2),
(103, 'Phạm Thu Hà', 'TP.HCM', 55000.00, 'F', '1992-07-25', '2018-01-15', 1),
(104, 'Hoàng Đình Đức', 'Cần Thơ', 60000.00, 'M', '1988-04-12', '2012-10-01', 4),
(105, 'Bùi Thanh Xuân', 'Vinh', 40000.00, 'F', '1995-09-30', '2019-03-22', 5);

INSERT INTO MANAGER (MANAGER_ID, MANAGER_EMPID, MANAGER_STARTDATE) VALUES
(3, 100, '2018-07-01'), -- An quản lý Admin
(1, 101, '2019-01-10'), -- Bình quản lý Research
(2, 102, '2020-03-15'), -- Cường quản lý Sales
(4, 104, '2015-11-01'), -- Đức quản lý IT
(5, 105, '2022-04-20'); -- Xuân quản lý Marketing

INSERT INTO PROJECT (PRJ_ID, PRJ_NAME, PRJ_START, PRJ_END, PRJ_PROFIT, PRJ_MANAGERID) VALUES
(1, 'New Website V2', '2025-01-01', NULL, 5000000.00, 104), -- Đang tiến hành
(2, 'Market Analysis 2025', '2024-10-01', '2024-11-15', 1200000.00, 101), -- Đã hoàn thành
(3, 'Sales Training Program', '2025-02-15', NULL, 800000.00, 102), -- Đang tiến hành
(4, 'Product X Development', '2024-03-01', '2025-05-30', 900000.00, 103), -- Đã hoàn thành
(5, 'Q4 Branding Campaign', '2025-09-01', NULL, 3000000.00, 105); -- Đang tiến hành

INSERT INTO WORKS_ON (EMPLOYEE_ID, PRJ_ID, HOURS) VALUES
(101, 2, 12.50), -- Bình tham gia DA 2
(103, 2, 80.00),  -- Hà tham gia DA 2
(104, 1, 25.75), -- Đức tham gia DA 1
(102, 3, 40.00),  -- Cường tham gia DA 3
(103, 4, 30.00), -- Hà tham gia DA 4
(100, 1, 10.00);  -- An (CEO) tham gia hỗ trợ DA 1 (Thêm dòng thứ 6 để đủ 5 dòng trở lên)

-- Error Code: 1264. Out of range value for column 'HOURS' at row 1

-- Phần C. Thực hiện truy vấn

-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT *
  FROM project
  WHERE YEAR(PRJ_START) = 2025
        AND PRJ_PROFIT > 1000000;
        
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT
    D.DEPARTMENT_NAME AS TenPhongBan,
    D.DEPARTMENT_ID AS MaPhongBan,
    COUNT(E.EMPLOYEE_ID) AS SoLuongNhanVien
  FROM DEPARTMENT D, EMPLOYEE E
 WHERE D.DEPARTMENT_ID = E.EMPLOYEE_DPMID
GROUP BY D.DEPARTMENT_ID, D.DEPARTMENT_NAME
HAVING COUNT(E.EMPLOYEE_ID) > 10000
ORDER BY SoLuongNhanVien DESC;
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án






