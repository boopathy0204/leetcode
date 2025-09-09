# Write your MySQL query statement below
SELECT
    stock_name,
    sell-buy AS capital_gain_loss
FROM(
    SELECT
        stock_name,
        SUM(CASE WHEN operation = 'Buy' THEN price ELSE 0 END) AS buy,
        SUM(CASE WHEN operation = 'Sell' THEN price ELSE 0 END) AS sell
    FROM
        Stocks
    GROUP BY stock_name
) AS s