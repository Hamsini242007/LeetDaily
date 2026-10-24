-- SELECT DISTINCT p.product_id,p.product_name
-- FROM sales s
-- JOIN product p ON p.product_id=s.product_id
-- GROUP BY s.product_id
-- HAVING MIN(sale_date)>='2019-01-01' AND MAX(sale_date)<='2019-03-31';

SELECT product_id,product_name
FROM product 
WHERE product_id NOT IN(
    SELECT product_id
    FROM sales
    WHERE sale_date NOT BETWEEN '2019-01-01' AND '2019-03-31'
)
AND product_id IN(
    SELECT product_id
    FROM sales
    -- WHERE sale_date BETWEEN '2019-01-01' AND '2019-03-31'
);
