SELECT c.name AS Customers
FROM customers c
/*LEFT JOIN orders o
ON c.id=o.customerId
WHERE o.id IS NULL;*/
WHERE NOT EXISTS(
    SELECT 1
    FROM orders o
    WHERE c.id=o.customerid
);
