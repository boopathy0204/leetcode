WITH tem AS(
    SELECT * 
    FROM
        Students CROSS JOIN Subjects
)
SELECT 
    tem.student_id,
    tem.student_name,
    tem.subject_name,
    SUM(CASE WHEN e.Subject_name IS NOT NULL THEN 1
        ELSE 0 END) AS attended_exams
FROM
    tem LEFT JOIN Examinations e
    ON tem.student_id = e.student_id AND tem.subject_name = e.subject_name
    GROUP BY tem.student_id,tem.student_name,tem.subject_name
    ORDER BY tem.student_id,tem.Subject_name ASC;