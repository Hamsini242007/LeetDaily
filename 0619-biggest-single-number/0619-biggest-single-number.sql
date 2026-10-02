SELECT MAX(num) as num
FROM (
    SELECT *
    FROM mynumbers
    GROUP BY num
    HAVING COUNT(*)=1
) AS mytable;
