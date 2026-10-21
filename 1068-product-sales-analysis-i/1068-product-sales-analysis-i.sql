SELECT s.year, s.price,p.product_name
FROM sales s
JOIN product p
ON p.product_id=s.product_id;
