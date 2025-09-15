SELECT  
    c.customer_id
FROM
    Customer c,Product
GROUP BY
    customer_id
HAVING
    COUNT(DISTINCT c.product_key)=COUNT(DISTINCT Product.product_key);