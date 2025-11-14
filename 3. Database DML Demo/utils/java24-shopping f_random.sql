-- select rand() * floor(N+1);
set global log_bin_trust_function_creators = 1;
drop function if exists f_random;
delimiter $$
create function f_random(from_incl int, end_incl int)
returns int
begin
	return from_incl + floor(rand() * ((end_incl-from_incl) + 1));
end $$