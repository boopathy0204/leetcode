SELECT 
    ROUND(SUM(tiv_2016),2) AS tiv_2016
FROM(
    SELECT
        SUM(tiv_2016) AS tiv_2016,
        val
    FROM(
        SELECT 
            COUNT(tiv_2015) OVER(PARTITION BY tiv_2015) AS val,
            tiv_2015,
            tiv_2016,
            lat,
            lon
        FROM
            Insurance
    ) AS s
GROUP BY lat ,lon
HAVING COUNT(tiv_2015) = 1
) AS SS
WHERE val > 1
