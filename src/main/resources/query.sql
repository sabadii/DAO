SELECT product_name
FROM ORDERS
JOIN CUSTOMERS on ORDERS.customer_id = CUSTOMERS.id
WHERE lower(CUSTOMERS.name) = lower(:customerName);