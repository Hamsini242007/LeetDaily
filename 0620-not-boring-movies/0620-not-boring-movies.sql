SELECT * 
FROM cinema
-- WHERE id%2=1
WHERE MOD(id,2)=1 
AND description NOT LIKE 'boring'
-- AND description <> 'boring'
-- AND description != 'boring'
ORDER BY rating DESC;