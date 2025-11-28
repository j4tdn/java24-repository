-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
DROP DATABASE IF EXISTS lesson16_company_management;
CREATE DATABASE IF NOT EXISTS lesson16_company_management CHAR SET utf8mb4;
USE lesson16_company_management;


CREATE TABLE DEPARTMENT
(
	DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(255) NOT NULL,
    ManagerID INT,
    FOREIGN KEY (ManagerID) REFERENCES Employees(EmployeeID)
);

CREATE TABLE EMPLOYEE
(
	EmployeeID INT PRIMARY KEY,
    FullName VARCHAR(255) NOT NULL,
    Address VARCHAR(255),
    Salary INT,
    Gender VARCHAR(10),
    DateOfBirth DATE,
    HireDate DATE,
    DepartmentID INT,
    ManagerID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY (ManagerID) REFERENCES Employee(EmployeeID)
);

CREATE TABLE PROJECT (
    ProjectID INT PRIMARY KEY,
    ProjectName VARCHAR(255) NOT NULL,
    StartDate DATE,
    EndDate DATE,
    Revenue INT,
    ProjectManagerID INT,
    FOREIGN KEY (ProjectManagerID) REFERENCES Employee(EmployeeID)
);

CREATE TABLE PROJECTPARTICIPATION (
    EmployeeID INT,
    ProjectID INT,
    WorkingHours INT,
    ParticipationTime DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (EmployeeID, ProjectID),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (ProjectID) REFERENCES Project(ProjectID)
);

CREATE TABLE WORKINGHOURSLOG (
    EmployeeID INT,
    ProjectID INT,
    OldHours INT,
    NewHours INT,
    UpdateTime DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (EmployeeID, ProjectID, UpdateTime),
    FOREIGN KEY (EmployeeID, ProjectID)
        REFERENCES ProjectParticipation(EmployeeID, ProjectID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
INSERT INTO DEPARTMENT (DepartmentID, DepartmentName, DepartmentHeadID) VALUES
(1, 'Department A', 101),
(2, 'Department B', 102),
(3, 'Department C', 103),
(4, 'Department D', 104),
(5, 'Department E', 105);


INSERT INTO EMPLOYEE (EmployeeID, FullName, Address, Salary, Gender, DateOfBirth, HireDate, DepartmentID, ManagerID)
VALUES
(101, 'Tran Phuoc Khoa',      '379 Tran Cao Van Street', 5000000, 'Female', '2004-05-26', '2010-01-01', 1, NULL),
(102, 'Ngo Nhat Minh',         '6 Ngo Quyen Street',      6000000, 'Female', '2004-05-05', '2012-01-01', 2, 101),
(103, 'Nguyen Hong Ngoc',      '9 Dien Bien Phu Street',  7000000, 'Female', '2004-12-10', '2015-01-01', 1, 101),
(104, 'Nguyen Thi Anh Dao',    '1 Bach Dang Street',      5500000, 'Female', '2004-07-20', '2014-01-01', 3, 102),
(105, 'Nguyen Thi Thu Trang',  '2 Ho Quy Ly Street',      8000000, 'Female', '2004-09-15', '2018-01-01', 4, NULL);

INSERT INTO PROJECT (ProjectID, ProjectName, StartDate, EndDate, Revenue, ProjectManagerID) VALUES
(201, 'Project A', '2025-01-01', '2026-06-30', 10000000, 101),
(202, 'Project B', '2025-02-01', '2026-08-31', 15000000, 102),
(203, 'Project C', '2025-03-01', '2026-09-30', 12000000, 103),
(204, 'Project D', '2025-04-01', '2026-10-31', 18000000, 105),
(205, 'Project E', '2025-05-01', '2026-11-30', 9000000, 104);

INSERT INTO PROJECTPARTICIPATION (EmployeeID, ProjectID, WorkingHours) VALUES
(101, 201, 50),
(102, 201, 40),
(103, 202, 60),
(104, 203, 45),
(105, 204, 55);

INSERT INTO WORKINGHOURSLOG (EmployeeID, ProjectID, OldHours, NewHours) VALUES
(101, 201, 50, 55),
(102, 201, 40, 45),
(103, 202, 60, 65),
(104, 203, 45, 50),
(105, 204, 55, 60);

-- Phần C. Thực hiện truy vấn
-- 1
DELIMITER $$
CREATE PROCEDURE ListProjectsByYearAndRevenue(
    IN targetYear INT,
    IN minRevenue INT
)
BEGIN
    SELECT *
    FROM Project
    WHERE YEAR(StartDate) = targetYear
      AND Revenue > minRevenue * 1000000;
END $$
DELIMITER ;

CALL ListProjectsByYearAndRevenue(2025, 10);

-- 2
DELIMITER $$
CREATE PROCEDURE ListEmployeesWithTotalHours(IN minHours INT)
BEGIN
    SELECT E.*, PP.ProjectID, PP.WorkingHours
    FROM Employee E
    JOIN ProjectParticipation PP 
        ON E.EmployeeID = PP.EmployeeID
    WHERE PP.WorkingHours > minHours;
END $$
DELIMITER ;

CALL ListEmployeesWithTotalHours(50);

-- 3
SELECT E.*
FROM Employee E
JOIN Employee M ON E.ManagerID = M.EmployeeID
WHERE E.Salary >= M.Salary;