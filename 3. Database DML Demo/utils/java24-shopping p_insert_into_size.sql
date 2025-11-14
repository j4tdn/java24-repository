
drop procedure if exists p_insert_into_size;
delimiter $$
create procedure p_insert_into_size()
begin
	declare i int default 1;
    declare is_female bit(1);
    declare size_name varchar(50);
    
	while i <= 10 do
		set is_female = i <= 5;
        set size_name = elt(if (is_female, i, i-5),'S','M','L','XL', 'XXL');
		insert into t02_size(c02_size_id, c02_size_name, c02_gender, c02_size_desc) values
        (i, size_name, not is_female, concat("Size '", size_name, "' cho", if(is_female, 'Nữ', 'Nam')));
		set i = i + 1;
    end while;


end $$
