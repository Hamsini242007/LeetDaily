-- SELECT customer_number
-- FROM orders
-- GROUP BY customer_number
-- ORDER BY COUNT(order_number) DESC
-- LIMIT 1;

WITH RankedOrders AS (
    SELECT 
        customer_number,
        DENSE_RANK() OVER (ORDER BY COUNT(order_number) DESC) AS rnk
    FROM Orders
    GROUP BY customer_number
)
SELECT customer_number
FROM RankedOrders
WHERE rnk = 1;