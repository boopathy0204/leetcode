# Write your MySQL query statement below
WITH tem AS (
    SELECT
        COUNT(*) AS C
    FROM Seat
)
SELECT 
    CASE 
        WHEN id % 2 = 0 THEN id -1
        WHEN id % 2 <> 0 AND id <> (SELECT c FROM tem) THEN id + 1
        ELSE id
    END AS id,
    student
FROM Seat
    ORDER BY id ASC;