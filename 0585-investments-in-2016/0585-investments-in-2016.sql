# Write your MySQL query statement below
WITH tem AS (
    SELECT tiv_2015, tiv_2016
FROM Insurance
WHERE (lat, lon) IN (
    SELECT lat, lon
    FROM Insurance
    GROUP BY lat, lon
    HAVING COUNT(*) = 1
)
)
SELECT 
    round(SUM(tiv_2016),2)AS tiv_2016
FROM(
    SELECT 
        SUM(tiv_2016)AS tiv_2016
    FROM
        tem
    GROUP BY tiv_2015
    HAVING COUNT(tiv_2015) > 1
    ) AS S