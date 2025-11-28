create database company_management;
-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
create table t01_employee(
c01_employee_id int primary key auto_increment,
c01_name varchar(50) not null,
c01_address varchar(50) not null,
c01_salary decimal(10,2) not null,
c01_gender bit not null,
c01_birth date not null,
c01_day_onboard date not null,
c01_supervisor_id int,
c01_department_id int not null,
c01_employee_code int not null unique,
constraint fk_employee_supervisor FOREIGN key (c01_supervisor_id) references t01_employee(c01_employee_id)
);
create table t02_department(
c02_department_id int primary key auto_increment,
c02_deparment_name varchar(50) not null,
c02_department_code int not null unique
);
create table t03_project(
c03_project_id int primary key auto_increment,
c03_project_name varchar(50) not null,
c03_project_code int not null unique,
c03_employee_id int not null,
c03_project_income decimal(10,2) not null,
constraint fk_employee_project foreign key (c03_employee_id) references t01_employee(c01_employee_id)
);

create table t04_project_detail(
c04_project_detail_id int primary key auto_increment,
c04_project_id int not null,
c04_employee_id int not null,
c04_hours float(10,1),
constraint fk_project_detail_employee foreign key (c04_employee_id) references t01_employee(c01_employee_id),
constraint fk_project_detail_project foreign key (c04_project_id) references t03_project(c03_project_id)
);
create table t05_department_manager(
c05_department_manager_id int primary key auto_increment,
c05_department_id int not null,
c05_employee_id int not null,
c05_start_day date not null,
constraint fk_department_manager_department foreign key (c05_department_id) references t02_department(c02_department_id),
constraint fk_department_manager_employee foreign key (c05_employee_id) references t01_employee(c01_employee_id)
);
-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
INSERT INTO t02_department (c02_department_name, c02_department_code) VALUES
("Pháp lý", 100),
('Developer', 101),
('Marketing', 102),
('Laundry', 105),
('Nhân sự', 103);

INSERT INTO t01_employee (c01_name, c01_address, c01_salary, c01_gender, c01_birth, c01_day_onboard, c01_supervisor_id, c01_department_id, c01_employee_code) VALUES
('Trần Anh Vũ', 'Huế', 150000.00, 1, '2003-05-15', '2025-01-01', NULL, 1, 1000), 
('Lê Minh Danh', 'Núi Thành', 95000.00, 1, '2003-11-20', '2012-06-10', 1, 2, 1001), 
('Nguyễn Phúc Huy', 'Đà Nẵng', 55000.00, 1, '2003-03-01', '2018-09-01', 2, 2, 1002), 
('Nguyễn Thanh Tùng', 'Hà Nội', 80000.00, 1, '1988-07-25', '2012-03-01', 1, 3, 1003), 
('Đỗ Thùy Trang', 'TP.HCM', 48000.00, 0, '1995-01-10', '2020-05-20', 4, 3, 1004),
('Hoàng Thị Hạnh', 'TP.HCM', 75000.00, 0, '1982-12-05', '2008-08-08', 1, 4, 1005),
('Vũ Thanh Vân', 'Hải Phòng', 60000.00, 0, '1990-08-18', '2022-01-01', 2, 2, 1006), 
('Ngô Thanh Hà', 'Cần Thơ', 52000.00, 0, '1998-02-28', '2023-11-01', 6, 4, 1007);

INSERT INTO t03_project (c03_project_name, c03_project_code, c03_day_start, c03_day_end, c03_project_income, c03_employee_id) VALUES
('Phát triển Ứng dụng TodoList', 201, '2025-01-01', '2025-06-30', 500000.00, 2), 
('Chiến dịch Quảng cáo Coolgate', 202, '2025-03-01', '2025-05-31', 150000.00, 4), 
('Nâng cấp Hệ thống ERP', 203, '2025-07-01', NULL, 800000.00, 1),
('Tuyển dụng 2026', 204, '2025-10-01', '2025-12-31', 50000.00, 6),
('Thiết kế website C', 205, '2025-09-01', '2026-02-28', 350000.00, 3);

INSERT INTO t04_project_detail (c04_project_id, c04_employee_id, c04_hours) VALUES
(1, 2, 200.5),  
(1, 3, 450.0),  
(1, 7, 300.0),  
(2, 4, 100.0),  
(2, 5, 250.5),  
(3, 2, 80.0),   
(3, 3, 150.0),  
(3, 7, 120.0),  
(4, 6, 90.0),   
(4, 8, 110.0),  
(5, 3, 50.0);   

INSERT INTO t05_department_manager (c05_department_id, c05_employee_id, c05_start_day) VALUES
(1, 1, '2005-01-01'), 
(2, 2, '2015-01-01'), 
(3, 4, '2018-05-15'), 
(4, 6, '2010-01-01'),
(2, 7, '2025-11-28');

select * from t01_employee;
select * from t02_department;
select * from t03_project;
select * from t04_project_detail;
select * from t05_department_manager;
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
select * from t03_project where YEAR(c03_day_start) >= '2025' and c03_project_income > 100000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
select t01.c01_employee_id, t01.c01_name, t04.c04_project_id,t04.c04_hours from t04_project_detail t04
join t01_employee t01 on t01.c01_employee_id = t04.c04_employee_id
where t04.c04_hours > 100;
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
select a.c01_name , a.c01_salary , a.c01_supervisor_id  
from t01_employee a
join t01_employee b 
on a.c01_supervisor_id = b.c01_employee_id
where a.c01_salary >= b.c01_salary;
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
select t01.c01_department_id as department, count(*) as total_employee from t01_employee t01
join t02_department t02 on t02.c02_department_id = t01.c01_department_id 
group by t01.c01_department_id having total_employee > 2;

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
select c01_name, c01_day_onboard, timestampdiff(YEAR, c01_day_onboard, curdate()) as YearWorks from t01_employee
where timestampdiff(YEAR, c01_day_onboard, curdate()) > 10;
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
select * from t05_department_manager;
select * from t03_project;

select * from t01_employee t01 
join t05_department_manager t05 on t05.c05_employee_id = t01.c01_employee_id
join t03_project t03 on t03.c03_employee_id = t03.c03_employee_id

order by t01.c01_name;


