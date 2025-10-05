WITH tem AS (
    SELECT *,COUNT(*) OVER(PARTITION BY employee_id) AS c
    FROM Employee
)
SELECT 
    employee_id,
    department_id
FROM
    tem
WHERE primary_flag = 'Y' OR c = 1;