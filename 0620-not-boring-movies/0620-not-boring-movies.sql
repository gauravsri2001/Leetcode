# Write your MySQL query statement below
Select id, movie, description, rating from Cinema
Where MOD(id,2) !=0 AND description!= "boring" order by rating DESC;