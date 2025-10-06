# Write your MySQL query statement below
WITH tem AS(
SELECT 
    requester_id
FROM RequestAccepted
UNION ALL
SELECT accepter_id AS requester_id
FROM RequestAccepted 
),
tem1 AS(
    SELECT 
    requester_id,
    COUNT(requester_id) AS c
    FROM 
        tem
    GROUP BY requester_id
)
SELECT
    requester_id AS id,
    c AS num
FROM tem1
WHERE c = (SELECT MAX(c) FROM tem1);