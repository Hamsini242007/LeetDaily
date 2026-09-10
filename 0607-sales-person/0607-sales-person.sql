-- SELECT s.name
-- FROM salesperson s
-- WHERE sales_id NOT IN (
--     SELECT o.sales_id
--     FROM orders o
--     JOIN company c ON o.com_id=c.com_id
--     WHERE c.name='RED'
-- );
SELECT s.name
FROM salesperson s
WHERE NOT EXISTS(
    SELECT 1
    FROM orders o
    JOIN company c ON o.com_id=c.com_id
    WHERE o.sales_id=s.sales_id AND c.name='RED'
);