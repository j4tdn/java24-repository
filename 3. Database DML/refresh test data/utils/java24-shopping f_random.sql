
-- SELECT floor(rand() * (8+1));

SET GLOBAL log_bin_trust_function_creators = 1;

DROP FUNCTION IF EXISTS f_random;

DELIMITER $$

CREATE FUNCTION f_random(from_incl INT, end_incl INT)
RETURNS INT
BEGIN
	RETURN from_incl + floor(rand() * (end_incl - from_incl + 1));
END $$