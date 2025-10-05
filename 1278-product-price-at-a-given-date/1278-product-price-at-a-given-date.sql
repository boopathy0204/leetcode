WITH tem AS (
    SELECT 
        *,COUNT(*) OVER (PARTITION BY product_id ORDER BY change_date DESC) AS count
    FROM Products 
    WHERE change_date <= '2019-08-16'
)
SELECT 
    DISTINCT p.product_id,
    IFNULL(tem.new_price,10) AS price
FROM Products p LEFT JOIN tem
    ON p.product_id = tem.product_id
WHERE COUNT = 1 OR count IS NULL
    