INSERT INTO T01_DEPARTMENT (C01_DEPARTMENT_NAME)
VALUES
('Administration'),
('Software'),
('Accounting'),
('Sales'),
('Customer Service');

INSERT INTO T02_EMPLOYEE (
    C02_EMPLOYEE_NAME, C02_ADDRESS, C02_SALARY, C02_GENDER,
    C02_DATE_OF_BIRTH, C02_DATE_HIRED, C02_DEPARTMENT_ID, C02_SUPERVISOR_ID
)
VALUES
('Nguyen Van Long',  'Da Nang',    21000000, 1, '1998-04-12', '2021-02-01', 2, NULL),
('Tran Thi Mai',     'Hue',        17000000, 0, '1999-09-27', '2022-07-15', 2, 1),
('Pham Dinh Khoa',   'Quang Ngai', 15500000, 1, '1995-03-18', '2020-11-10', 1, NULL),
('Le Hoang Vy',      'Ha Noi',     16000000, 0, '2001-10-22', '2023-03-05', 1, 3),
('Vo Minh Tu',       'Sai Gon',    12000000, 1, '1992-12-01', '2019-05-20', 4, NULL),
('Dang Kim Yen',     'Da Nang',    15500000, 0, '2000-07-09', '2023-10-12', 5, 5);


INSERT INTO T03_PROJECT (
    C03_PROJECT_NAME, C03_START_DATE, C03_END_DATE, C03_REVENUE, C03_PROJECT_MANAGER_ID
)
VALUES
('Nâng cấp hệ thống CRM',        '2024-02-01', '2025-01-30', 18000000000, 3),
('Nền tảng Thương mại điện tử',  '2023-05-10', '2024-12-30', 45000000000, 1),
('Di chuyển dữ liệu hệ thống',    '2022-11-01', '2024-03-15', 12000000000, 5),
('Hệ thống Chatbot AI',           '2024-01-15', '2024-11-20', 35000000000, 2),
('Tự động hóa Marketing',         '2023-09-01', '2025-02-28', 27000000000, 1);

INSERT INTO T04_EMPLOYEE_PROJECT (C04_PROJECT_ID, C04_EMPLOYEE_ID, C04_WORK_HOURS)
VALUES
(1, 1, 100.50),
(1, 2,  95.00),
(2, 3, 150.25),
(2, 4,  88.75),
(3, 5, 120.00),
(3, 6,  65.25),
(4, 1, 110.00),
(4, 3,  92.50),
(5, 4,  72.00),
(5, 6,  80.00);

INSERT INTO T05_DEPARTMENT_MANAGER (C05_DEPARTMENT_ID, C05_EMPLOYEE_ID, C05_START_DATE)
VALUES
(1, 3, '2021-11-10'),
(2, 1, '2021-02-01'),
(3, 5, '2020-05-20'),
(4, 5, '2022-01-15'),
(5, 6, '2023-10-12');
