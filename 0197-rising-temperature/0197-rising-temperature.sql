SELECT a.id AS Id
FROM weather a
JOIN weather b
ON DATEDIFF(a.recordDate, b.recordDate)=1
WHERE a.temperature>b.temperature;
