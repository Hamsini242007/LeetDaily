-- SELECT MAX(num) as num
-- FROM (
--     SELECT *
--     FROM mynumbers
--     GROUP BY num
--     HAVING COUNT(*)=1
-- ) AS mytable;
SELECT (
    SELECT num 
    FROM mynumbers 
    GROUP BY num 
    HAVING COUNT(*) = 1 
    ORDER BY num DESC 
    LIMIT 1
) AS num;