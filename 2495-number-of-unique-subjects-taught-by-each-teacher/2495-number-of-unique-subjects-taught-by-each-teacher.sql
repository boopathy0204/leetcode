# Write your MySQL query statement below
SELECT
    teacher_id,
    COUNT(subject_id) AS cnt
FROM(
    SELECT *
    FROM
        Teacher
    GROUP BY teacher_id,subject_id
) AS s
GROUP BY teacher_id