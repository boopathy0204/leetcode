# Write your MySQL query statement below
WITH free AS(
    SELECT 
        user_id,
        activity_date,
        SUM(CASE WHEN activity_type = 'free_trial' THEN  activity_duration END) AS f,
        COUNT(activity_type) AS C
    FROM
        UserActivity
    GROUP BY user_id,activity_type
    HAVING activity_type = 'free_trial'
),
paid AS(
    SELECT 
        user_id,
        activity_date,
        SUM(CASE WHEN activity_type = 'paid' THEN  activity_duration END) AS p,
        COUNT(activity_type) AS C1
    FROM
        UserActivity
    GROUP BY user_id,activity_type
    HAVING activity_type = 'paid'
)
SELECT
     free.user_id,
    ROUND(f/c,2)AS trial_avg_duration,
    ROUND(p/c1,2) AS paid_avg_duration
FROM
    free JOIN paid
    ON free.user_id = paid.user_id
WHERE p != 0;