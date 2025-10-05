# Write your MySQL query statement below
select p.product_name,su as unit 
from(
    select o.product_id ,sum(unit) as su
     from Orders o where o.order_date>= '2020-02-01' and o.order_date<='2020-02-29' group by product_id having sum(unit)>=100
)as orderss  inner join Products p on Orderss.product_id = p.product_id;
