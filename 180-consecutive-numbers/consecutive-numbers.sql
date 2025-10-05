# Write your MySQL query statement below
select num as ConsecutiveNums from (
    select num,lag(num) over (order by id) as nums ,lead(num) over (order by id) as nn
    from Logs) as n  where  num = nums and num = nn group by num;
;