# Write your MySQL query statement below
WITH tem AS (
    SELECT 
        employee_id,
        name,
        manager_id
    FROM
        Employees
    WHERE salary <30000
)
SELECT 
    employee_id
FROM
    tem
WHERE manager_id NOT IN(SELECT employee_id FROM Employees)
    ORDER BY employee_id ASC;
