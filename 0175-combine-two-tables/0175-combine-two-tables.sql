#SELECT p.firstName, p.lastName, a.city, a.state 
#FROM Person p 
#LEFT JOIN Address a
#ON p.personId = a.personId;
#LEFT JOIN Address a USING (personId)
SELECT 
    p.firstName, 
    p.lastName, 
    (SELECT city FROM Address a WHERE a.personId = p.personId) AS city,
    (SELECT state FROM Address a WHERE a.personId = p.personId) AS state
FROM Person p;