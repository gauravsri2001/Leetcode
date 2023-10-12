# Write your MySQL query statement below
Select p.project_id, Round(AVG(e.experience_years),2) as average_years from Project p
Left Join Employee e ON p.employee_id = e.employee_id
Group by p.project_id;