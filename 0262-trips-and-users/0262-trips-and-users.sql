WITH tem AS(
    SELECT * 
    FROM 
    trips t LEFT JOIN users u
    ON t.client_id = u.users_id
),
tem1 AS (
    SELECT
        users_id, 
        banned
    FROM users
)
SELECT 
    request_at AS Day,
    ROUND(COUNT(CASE WHEN status != 'completed' THEN 1 end)/COUNT(request_at),2) AS             'Cancellation Rate'
FROM
    tem LEFT JOIN tem1
    ON tem.driver_id = tem1.users_id
    WHERE tem.banned ='No' and tem1.banned = 'No'
    GROUP BY request_at
    HAVING request_at BETWEEN  '2013-10-01' AND '2013-10-03'
 
