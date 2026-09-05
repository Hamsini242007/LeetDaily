SELECT a.name
FROM customer a
LEFT JOIN customer b
ON a.id=b.id
WHERE IFNULL(a.referee_id,0) !=2;
