CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT 
        salary
    FROM(
        SELECT 
            DENSE_RANK() OVER(ORDER BY salary DESC) AS s,salary
        FROM
            Employee
    ) as ss
    WHERE s = N LIMIT 1
  );
END