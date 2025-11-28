-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT *
FROM t03_project
WHERE C03_START_DATE LIKE '2024%' AND C03_END_DATE LIKE '2024%' AND C03_REVENUE > 19000000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT C02_EMPLOYEE_NAME NAME, C04_WORK_HOURS WORK_HOURS
FROM t04_employee_project T4
JOIN t02_employee T2 ON T4.C04_EMPLOYEE_ID = T2.C02_EMPLOYEE_ID
WHERE C04_WORK_HOURS > 100;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT E.C02_EMPLOYEE_NAME EMPLOYEE, E.C02_SALARY SALARY, 
S.C02_EMPLOYEE_NAME SUPERVISOR, S.C02_SALARY SALARY
FROM t02_employee E
JOIN t02_employee S ON E.C02_SUPERVISOR_ID = S.C02_EMPLOYEE_ID
WHERE E.C02_SALARY > S.C02_SALARY;

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
WITH CTE_DEPARTMENT_AMOUNT AS (
SELECT C01_DEPARTMENT_NAME DEPARTMENT, COUNT(*) AMOUNT
FROM t02_employee
JOIN t01_department ON C01_DEPARTMENT_ID = C02_DEPARTMENT_ID
GROUP BY C02_DEPARTMENT_ID
) SELECT * 
FROM CTE_DEPARTMENT_AMOUNT
 WHERE AMOUNT > 1;

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT * 
FROM T02_EMPLOYEE
WHERE TIMESTAMPDIFF(YEAR, C02_DATE_HIRED, CURRENT_DATE()) > 4;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT DISTINCT *
FROM T02_EMPLOYEE T2
JOIN t03_project T3 ON T2.C02_EMPLOYEE_ID = T3.C03_PROJECT_MANAGER_ID
JOIN t05_department_manager T5 ON T5.C05_EMPLOYEE_ID = T3.C03_PROJECT_MANAGER_ID
WHERE T3.C03_PROJECT_MANAGER_ID = T5.C05_EMPLOYEE_ID;
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT T2.C02_EMPLOYEE_NAME ,COUNT(*) AMOUNT
FROM t03_project T3
JOIN t02_employee T2 ON T2.C02_EMPLOYEE_ID = T3.C03_PROJECT_MANAGER_ID
GROUP BY C03_PROJECT_MANAGER_ID HAVING AMOUNT > 1;
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật