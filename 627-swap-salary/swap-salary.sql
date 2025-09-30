# Write your MySQL query statement below
update Salary 
Set sex=case 
    when sex = 'm' then 'f' 
    when sex= 'f' then 'm' 
end;