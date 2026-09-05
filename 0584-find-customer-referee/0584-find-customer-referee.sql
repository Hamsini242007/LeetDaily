SELECT name
FROM customer
#WHERE IFNULL(a.referee_id,0) !=2;
WHERE (referee_id!=2) OR (referee_id IS NULL);
