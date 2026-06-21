SELECT e.name,b.bonus 
FROM Employee as e
LEFT JOIN Bonus as b 
ON e.empId=b.empId
where b.bonus<1000 OR b.bonus IS NULL;
-- KYUKI HMKO CHAHIYE TOH SARE EMPLOYEES BUT USME CONDITION --LGADI ESLYE LEFT JOIN 

