# Write your MySQL query statement below
SELECT id, movie,description,rating 
FROM( 
    SELECT 
        id, movie,description,rating 
    FROM cinema 
    WHERE id%2 != 0 AND description != 'boring'
)AS s 
ORDER BY rating DESC ;