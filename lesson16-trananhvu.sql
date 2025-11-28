-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
--
CREATE TABLE department (
	department_id INT PRIMARY KEY AUTO_INCREMENT,
    department_code VARCHAR(100) NOT NULL UNIQUE,
	name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE employee (
	employee_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_code VARCHAR(100) NOT NULL UNIQUE,
    full_name VARCHAR(100) NOT NULL,
    address TEXT,
    salary DECIMAL(10,2) NOT NULL,
    gender VARCHAR(20),
    day_of_birth DATE,
    join_date DATE,
    department_id INT NOT NULL,
    manager_id INT,
    
    CONSTRAINT fk_employee_department FOREIGN KEY (department_id) REFERENCES department(department_id),
    CONSTRAINT fk_employee_manager FOREIGN KEY (manager_id) REFERENCES employee(employee_id)
);

CREATE TABLE department_manager(
	department_manager_id INT PRIMARY KEY AUTO_INCREMENT,
    department_id INT NOT NULL,
    employee_id INT NOT NULL, 
    start_date DATE NOT NULL,
    UNIQUE(department_id, start_date),
    
    CONSTRAINT fk_dep_manager_dep FOREIGN KEY (department_id) REFERENCES department(department_id),
	CONSTRAINT fk_dep_manager_emp FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

CREATE TABLE project(
	project_id INT PRIMARY KEY AUTO_INCREMENT,
    project_code VARCHAR(100) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    revenue DECIMAL(10,2) NOT NULL,
    project_manager_id INT,
    
    CONSTRAINT fk_project_employee FOREIGN KEY (project_manager_id) REFERENCES employee(employee_id) ON DELETE SET NULL
);

CREATE TABLE project_assignment (
	project_id INT NOT NULL,
    employee_id INT NOT NULL,
    hours_work DECIMAL(5,2) NOT NULL,
    
    PRIMARY KEY (project_id, employee_id),
    CONSTRAINT fk_prj_assignment_prj FOREIGN KEY (project_id) REFERENCES project(project_id),
    CONSTRAINT fk_prj_assignment_employee FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

CREATE TABLE project_assignment_log(
	log_id INT PRIMARY KEY AUTO_INCREMENT,
    project_id INT NOT NULL,
    employee_id INT NOT NULL,
    old_hours_work DECIMAL(5,2) DEFAULT NULL,
    new_hours_work DECIMAL(5,2) NOT NULL,
    action_type ENUM('INSERT', 'UPDATE') NOT NULL,
    action_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    
    CONSTRAINT fk_log_project FOREIGN KEY (project_id) REFERENCES project(project_id),
    CONSTRAINT fk_log_employee FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

--
-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
--
INSERT INTO department (department_code, name)
VALUES
('D001', 'HR'),
('D002', 'DEV'),
('D003', 'Finance'),
('D004', 'Marketing'),
('D005', 'IT Support');


INSERT INTO employee (
    employee_code, full_name, address, salary, gender,
    day_of_birth, join_date, department_id, manager_id
)
VALUES
('E001', 'Tran Anh Vu', 'Da Nang', 2000.00, 'Male', '2003-02-27', '2020-01-10', 2, NULL),
('E002', 'Nguyen Phuc Huy', 'Hue', 1500.00, 'Female', '2003-01-05', '2021-04-15', 2, 1),
('E003', 'Le Minh Danh', 'Quang Nam', 1400.00, 'Male', '2000-07-11', '2022-06-01', 1, NULL),
('E004', 'Danh Phuc A', 'Ha noi', 1300.00, 'Female', '1997-12-05', '2023-01-03', 1, 3),
('E005', 'Huy Minh T', 'Sai Gon', 1600.00, 'Male', '1990-03-18', '2019-08-20', 4, NULL),
('E006', 'Phuc ANh D', 'Da Nang', 1250.00, 'Female', '1998-11-22', '2023-09-10', 5, 5);

INSERT INTO department_manager (department_id, employee_id, start_date)
VALUES
(1, 3, '2022-06-01'),
(2, 1, '2020-01-10'),
(3, 5, '2021-03-15'),
(5, 6, '2023-09-10');

INSERT INTO project (
    project_code, name, start_date, end_date, revenue, project_manager_id
)
VALUES
('P001', 'Web co bac', '2024-01-01', '2025-06-01', 5000, 1),
('P002', 'Mobile App', '2024-03-10', '2026-12-30', 12000, 2),
('P003', 'Facebook', '2023-09-01', '2024-12-31', 3000, 5),
('P004', 'Instagram', '2022-02-15', '2025-08-15', 45000, 3),
('P005', 'Tiktok', '2024-05-01', '2024-11-01', 65000, 1);

INSERT INTO project_assignment (project_id, employee_id, hours_work)
VALUES
(6, 1, 120.50),
(6, 2, 95.00),
(7, 2, 150.25),
(7, 4, 80.75),
(8, 5, 60.00),
(9, 3, 90.00),
(10, 1, 110.00),
(5, 4, 70.50);


INSERT INTO project_assignment (project_id, employee_id, hours_work)
VALUES
(6, 1, 120.50),
(6, 2, 95.00),
(7, 2, 150.25),
(7, 4, 80.75),
(8, 5, 60.00), 
(8, 6, 70.50),
(9, 3, 90.00),
(9, 4, 85.25),
(10, 1, 110.00),
(10, 5, 95.50);
--
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *2024* có số tiền thu được trên *4000* $
SELECT * FROM project 
		WHERE YEAR(start_date) <= 2024 AND YEAR(end_date) >=2024
        AND revenue > 4000;
        
-- 2. Liệt kê các nhân viên đã tham gia hơn 90 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT e.employee_id, e.full_name, pa.hours_work FROM employee e
		JOIN project_assignment pa ON e.employee_id = pa.employee_id
        HAVING pa.hours_work > 90;
	
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT e.employee_id, 
		e.full_name AS employee_name, 
		e.salary AS employee_salary, 
		m.employee_id AS manager_id, 
		m.full_name AS manager_name, 
		m.salary AS manager_salary 
		FROM employee e 
		JOIN employee m ON e.manager_id = m.employee_id
		WHERE e.salary >= m.salary; 
        

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *2*
SELECT d.name, COUNT(e.employee_id) AS total_employee FROM department d
		JOIN employee e ON d.department_id = e.department_id
		GROUP BY d.department_id, d.name
        HAVING COUNT(e.employee_id) >= 2;
        

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn 3 năm
SELECT * FROM employee
		WHERE TIMESTAMPDIFF(YEAR, join_date, CURDATE()) > 3;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT e.employee_id,
		e.full_name,
		dm.department_id,
		p.project_id,
		p.name AS project_name
		FROM employee e
		JOIN department_manager dm ON e.employee_id = dm.employee_id
        JOIN project p ON e.employee_id = p.project_manager_id;
        
        
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT e.employee_id, e.full_name, GROUP_CONCAT(p.name SEPARATOR ', ') AS project_names, p.project_manager_id, COUNT(p.project_manager_id) AS total_pm FROM employee e
		JOIN project p ON e.employee_id = p.project_manager_id
        GROUP BY p.project_manager_id
        HAVING COUNT(p.project_manager_id) > 1;
        
        
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật

DELIMITER $$
CREATE TRIGGER trigger_project_assignment_insert
AFTER INSERT ON project_assignment
FOR EACH ROW
BEGIN 
	INSERT INTO project_assignment_log(project_id, employee_id, old_hours_work, new_hours_work, action_type)
    VALUES (NEW.project_id, NEW.employee_id, NULL, NEW.hours_work, 'INSERT');
END$$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER trigger_project_assignment_update
AFTER UPDATE ON project_assignment
FOR EACH ROW
BEGIN
    IF OLD.hours_work <> NEW.hours_work THEN
        INSERT INTO project_assignment_log(project_id, employee_id, old_hours_work, new_hours_work, action_type)
        VALUES (NEW.project_id, NEW.employee_id, OLD.hours_work, NEW.hours_work, 'UPDATE');
    END IF;
END$$
DELIMITER ;

-- drop
DROP TRIGGER IF EXISTS trigger_project_assignment_insert;
DROP TRIGGER IF EXISTS trigger_project_assignment_update;

-- test
INSERT INTO project_assignment (project_id, employee_id, hours_work) VALUES
(10,2,95.50);

UPDATE project_assignment
SET hours_work = 130.00
WHERE project_id = 7 AND employee_id = 4;

SELECT * FROM project_assignment_log ORDER BY log_id;
