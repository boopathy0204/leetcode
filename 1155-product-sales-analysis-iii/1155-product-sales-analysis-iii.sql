# Write your MySQL query statement below
select  s.product_id,
    s.year as first_year,
    s.quantity,
    s.price 
from sales s
join(
    select product_id,min(year) as years
    from sales 
    group by product_id
)  as ss on s.product_id = ss.product_id and s.year = ss.years;