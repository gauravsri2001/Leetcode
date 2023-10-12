# Write your MySQL query statement below
Select e.name, b.bonus from Employee e 
Left Join Bonus b ON e.empID = b.empID
Where bonus<1000 OR bonus IS NULL;