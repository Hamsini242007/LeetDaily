SELECT x,y,z,
IF (x+y>z AND y+z>x AND x+z>y, 'Yes','No') AS triangle
-- CASE 
-- WHEN x+y>z AND y+z>x AND x+z>y THEN 'Yes' ELSE 'No' 
-- END AS triangle
FROM triangle;
# instead of above conditions i can use this in WHEN
/*CASE 
 WHEN (x + y + z) - GREATEST(x, y, z) > GREATEST(x, y, z) THEN 'Yes'
 ELSE 'No'
END AS triangle */