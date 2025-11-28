
DROP PROCEDURE IF EXISTS p_insert_into_employee;

DELIMITER $$

CREATE PROCEDURE p_insert_into_employee()
BEGIN
	DECLARE i INT DEFAULT 1;
    
    WHILE  i <= 10 DO
		INSERT INTO t16_employee(
			C16_EMPLOYEE_ID, C16_EMPLOYEE_NAME, C16_EMPLOYEE_EMAIL, 
			C16_EMPLOYEE_ADDRESS, C16_EMPLOYEE_PHONE, C16_EMPLOYEE_PASSWORD, 
			C16_GMAIL_TOKEN, C16_DEPARTMENT_ID) VALUES
            (
            i, concat(' Nhân viên ', i),
            concat('nv', i, '@gmail.com'),
			concat('Địa chỉ ', i),
            '123456789',
            '$2a$12$PziC4Kq02NMhqB3aExbM2ujRbPkG/2aZYuP6ApbrpuYD9O/N5UB32',
            concat('nv', i, IF(i mod 2 = 0, 'auto', 'def')),
            1
            ); 
		SET i = i + 1;
    END WHILE;
END $$