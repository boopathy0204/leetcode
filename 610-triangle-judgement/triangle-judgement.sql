# Write your MySQL query statement below
SELECT 
    x,y,z,
    CASE  
        WHEN    
            X+Y > Z AND
            Y+Z >X AND
            X+Z > Y OR
            X=Y=Z 
        THEN 'Yes'
        ELSE
            'No'
        END AS triangle
FROM
    Triangle
