# Write your MySQL query statement below
WITH tem AS(SELECT
    person_name,
    SUM(weight) OVER(ORDER BY turn ASC) AS Total_weight
FROM
    Queue
)
SELECT 
    CASE WHEN Total_weight <=1000 AND LEAD(Total_weight)OVER() >1000 THEN person_name 
        WHEN Total_weight <=1000 AND LEAD(Total_weight)OVER() IS NULL THEN person_name
    ELSE 'ZZ'
     END AS person_name
FROM
    tem
ORDER BY person_name ASC LIMIT 1;