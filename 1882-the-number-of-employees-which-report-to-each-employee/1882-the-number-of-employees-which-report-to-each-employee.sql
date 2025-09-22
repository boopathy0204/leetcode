# Write your MySQL query statement below
SELECT 
    e.employee_id,
    e.name,
    COUNT(*) AS reports_count,
    ROUND(SUM(e1.age)/COUNT(*),0) AS average_age
FROM Employees e JOIN Employees e1
    ON e.employee_id = e1.reports_to
GROUP BY e.employee_id ORDER BY e.employee_id
