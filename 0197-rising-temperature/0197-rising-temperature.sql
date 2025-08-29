# Write your MySQL query statement below
select id
from(
    select id,temperature,lag(temperature) over(order by recordDate asc) as ss,
    recordDate AS d ,
    lag(recordDate) OVER(ORDER BY recordDate asc) AS d1
    from
        weather 
) as s where temperature > ss AND DATEDIFF(d,d1) = 1;