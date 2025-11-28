
-- Đề bài: Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan đến nhân viên,
-- phòng ban và dự án, chi tiết được mô tả như sau:
-- Công ty được tổ chức thành các phòng ban chức năng. Mỗi phòng ban sẽ có một tên duy nhất, một
-- mã số duy nhất và các nhân viên, trong đó có một nhân viên là người quản lý phòng ban đó.
-- Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi
-- là trưởng phòng. Ta ghi nhận lại ngày nhận chức của trưởng phòng.
-- Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
-- kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
-- Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.
-- Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
-- lương, giới tính, ngày sinh, ngày vào công ty
-- Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
-- Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. Mỗi
-- nhân viên có thể có một người quản lý giám sát trực tiếp, người đó cũng là một nhân viên, nhân
-- viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.

-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
CREATE TABLE T1_DEPARTMENT (
	C1_DEP_ID varchar(10) primary KEY,
    C1_DEP_NAME varchar(50) NOT NULL,
    C1_MANAGER_ID varchar(10)
);
CREATE table T2_MANAGER(
	C2_MANAGER_ID varchar(10) primary KEY,
    C2_MANAGER_NAME varchar(50) NOT NULL,
    C2_INAUGURATION_DAY datetime NOT NULL,
	C2_EMPLOYEE_ID varchar(10),
	constraint T2_T3 foreign key (C2_EMPLOYEE_ID) references T3_EMPLOYEE(C3_EMPLOYEE_ID)

);

ALTER TABLE T1_DEPARTMENT
ADD CONSTRAINT FK_T2_T1 
FOREIGN KEY (C1_MANAGER_ID) REFERENCES T2_MANAGER(C2_MANAGER_ID);
CREATE TABLE T3_EMPLOYEE(
	C3_EMPLOYEE_ID varchar(10) PRIMARY KEY,
    C3_EMPLOYYEE_NAME varchar(50) NOT NULL,
    C3_ADDRESS TEXT,
    C3_SALARY DECIMAL(15,2),
    C3_GENDER CHAR(1) CHECK (C3_GENDER IN ('M' , 'F')),
    C3_BIRTHDAY DATE,
    C3_JOINDAY DATE,
    C3_DEP_ID varchar(10),
    constraint FK_T3_T1 foreign key (C3_DEP_ID) references T1_DEPARTMENT(C1_DEP_ID)
	
);
ALTER TABLE T3_EMPLOYEE
ADD C3_MANAGER_ID VARCHAR(10);

CREATE TABLE T4_PROJECT (
	C4_PROJECT_ID varchar(10) PRIMARY KEY,
    C4_PR0JECT_NAME VARCHAR(255),
    C4_MANAGER_ID varchar(10), 
    C4_START_DATE DATE NOT NULL,
    C4_END_DATE DATE NOT NULL,
	C4_INCOME FLOAT NOT NULL,
    CONSTRAINT FK_T4_T2 FOREIGN KEY(C4_MANAGER_ID) REFERENCES T2_MANAGER(C2_MANAGER_ID)
);

CREATE TABLE T5_PROJECT_JOIN(
	C5_EMPLOYEE_ID varchar(10),
    C5_PROJECT_ID varchar(10),
    C5_WORK_HOURS INT NOT NULL,
    PRIMARY KEY (C5_EMPLOYEE_ID, C5_PROJECT_ID),
    CONSTRAINT FK_T5_T3 FOREIGN KEY(C5_EMPLOYEE_ID) REFERENCES T3_EMPLOYEE(C3_EMPLOYEE_ID),
	CONSTRAINT FK_T5_T4 FOREIGN KEY(C5_PROJECT_ID) REFERENCES T4_PROJECT(C4_PROJECT_ID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
-- --
INSERT INTO T1_DEPARTMENT
(C1_DEP_ID, C1_DEP_NAME, C1_MANAGER_ID)
VALUES
('D01', 'Human Resources', 'M01'),
('D02', 'Finance', 'M02'),
('D03', 'IT Department', 'M03'),
('D04', 'Marketing', 'M04'),
('D05', 'Sales', 'M05');



INSERT INTO T2_MANAGER
(C2_MANAGER_ID, C2_MANAGER_NAME, C2_INAUGURATION_DAY, C2_EMPLOYEE_ID)
VALUES
('M01', 'John Manager', '2020-01-01', 'E01'),
('M02', 'Emily Manager', '2020-02-01', 'E02'),
('M03', 'David Manager', '2020-03-01', 'E03'),
('M04', 'Sophia Manager', '2020-04-01', 'E04'),
('M05', 'Chris Manager', '2020-05-01', 'E05');


INSERT INTO T3_EMPLOYEE  
(C3_EMPLOYEE_ID, C3_EMPLOYYEE_NAME, C3_ADDRESS, C3_SALARY, C3_GENDER, C3_BIRTHDAY, C3_JOINDAY, C3_DEP_ID)
VALUES
('E01', 'John Doe', 'Hanoi', 15000000, 'M', '1990-02-10', '2023-01-02', NULL),
('E02', 'Emily Davis', 'HCMC', 16000000, 'F', '1992-07-15', '2023-02-10', NULL),
('E03', 'David Lee', 'Da Nang', 20000000, 'M', '1988-05-20', '2023-03-01', NULL),
('E04', 'Sophia Tran', 'Hue', 18000000, 'F', '1995-11-05', '2023-04-12', NULL),
('E05', 'Chris Nguyen', 'Hai Phong', 22000000, 'M', '1987-09-09', '2023-05-03', NULL);


INSERT INTO T4_PROJECT
(C4_PROJECT_ID, C4_PR0JECT_NAME, C4_MANAGER_ID, C4_START_DATE, C4_END_DATE, C4_INCOME)
VALUES
('P01', 'HR Transformation', 'M01', '2020-01-10', '2020-06-20', 300000000),
('P02', 'Financial Automation', 'M02', '2021-03-15', '2021-09-30', 450000000),
('P03', 'IT Infrastructure Upgrade', 'M03', '2022-05-01', '2022-12-15', 700000000),
('P04', 'Branding Campaign', 'M04', '2023-02-10', '2023-08-05', 280000000),
('P05', 'CRM Optimization', 'M05', '2024-04-01', '2024-11-30', 550000000);


INSERT INTO T5_PROJECT_JOIN
(C5_EMPLOYEE_ID, C5_PROJECT_ID, C5_WORK_HOURS)
VALUES
('E01', 'P02', 120),
('E02', 'P04', 140),
('E03', 'P01', 160),
('E04', 'P03', 100),
('E05', 'P05', 180);


-- --
DELETE FROM T5_PROJECT_JOIN;
DELETE FROM T4_PROJECT;

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm 2024 có số tiền thu được trên  triệu  350000 VND 
select * 
FROM T4_PROJECT
WHERE year(C4_START_DATE) = 2021  AND 
			C4_INCOME > 350000;
 
-- 2. Liệt kê các nhân viên đã tham gia hơn 120 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
 SELECT T3.C3_EMPLOYYEE_NAME, T5.C5_WORK_HOURS, T4.C4_PR0JECT_NAME
 FROM  T3_EMPLOYEE T3
JOIN T5_PROJECT_JOIN T5 ON T3.C3_EMPLOYEE_ID = T5.C5_EMPLOYEE_ID
JOIN T4_PROJECT T4 ON T5.C5_PROJECT_ID = T4.C4_PROJECT_ID
WHERE T5.C5_WORK_HOURS > 120;



-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT e.C3_EMPLOYEE_ID AS EMPLOYEE_ID,
       e.C3_EMPLOYYEE_NAME AS EMPLOYEE_NAME,
       e.C3_SALARY AS EMPLOYEE_SALARY,
       m.C3_EMPLOYEE_ID AS MANAGER_ID,
       m.C3_EMPLOYYEE_NAME AS MANAGER_NAME,
       m.C3_SALARY AS MANAGER_SALARY
FROM T3_EMPLOYEE e
LEFT JOIN T3_EMPLOYEE m
       ON e.C3_MANAGER_ID = m.C3_EMPLOYEE_ID
WHERE e.C3_SALARY >= m.C3_SALARY;
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn 0
SELECT T1.C1_DEP_NAME, 
		count(T3.C3_EMPLOYEE_ID) SUM_EMPLOYEES
FROM T1_DEPARTMENT T1
JOIN T3_EMPLOYEE T3 ON T1.C1_DEP_ID = T3.C3_DEP_ID
GROUP BY T1.C1_DEP_NAME
HAVING count(T3.C3_EMPLOYEE_ID) > 0;
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT C3_EMPLOYEE_ID,
       C3_EMPLOYYEE_NAME,
       (year(curdate()) - year(C3_JOINDAY)) AS SUMYEAR
FROM T3_EMPLOYEE
WHERE (year(curdate()) - year(C3_JOINDAY))  >= 2;
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT * 
FROM T3_EMPLOYEE
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
-- --
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật 