# Write your MySQL query statement below
SELECT 
    Department,
    Employee,
    Salary
FROM(
    SELECT 
        e.name AS Employee,
        salary,
        d.name AS Department,
        DENSE_RANK() OVER(PARTITION BY d.name ORDER BY salary DESC) AS v
    FROM
        Employee e JOIN Department d
        ON e.departmentId = d.id
) AS s 
WHERE V < 4 ;