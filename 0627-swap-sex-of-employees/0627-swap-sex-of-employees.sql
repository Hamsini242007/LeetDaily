UPDATE Salary
SET sex=IF(sex='m','f','m');
-- SET sex= CASE
-- WHEN sex='f' THEN 'm'
-- WHEN sex='m' THEN 'f'
-- END;
-- -- WHERE sex IN ('m', 'f');