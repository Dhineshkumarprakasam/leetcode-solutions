SELECT name as Customers
FROM (
    SELECT c.name,o.customerId FROM customers c
    LEFT JOIN orders o ON c.id=o.customerId
) AS temptable WHERE customerid IS NULL;