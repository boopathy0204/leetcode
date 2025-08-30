# Write your MySQL query statement below
SELECT 
    Department,
    Employee,
    salary
FROM(
    SELECT
        e.name AS Employee,
        e.salary,
        e.departmentId,
        d.name AS Department ,
        DENSE_RANK() OVER(PARTITION BY d.name ORDER BY salary DESC) AS v
    FROM
        Employee e LEFT JOIN Department d
        ON e.departmentID = d.id
    
)AS s
WHERE v = 1 ;