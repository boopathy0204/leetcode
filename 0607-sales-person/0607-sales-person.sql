# Write your MySQL query statement below
SELECT
    s.name
FROM(
    SELECT
        s.sales_id,
        s.name,
       MAX(CASE WHEN c.name = 'RED' THEN 1 ELSE 0 END) AS val 
    FROM
        SalesPerson s LEFT JOIN Orders o
        ON S.sales_id = o.sales_id
        LEFT JOIN Company c
        ON c.com_id = o.com_id
        GROUP BY s.sales_id, s.name
    
) AS  s 
WHERE   val !=1;