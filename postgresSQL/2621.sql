select p.name from products p
inner join providers pr on p.id_providers = pr.id
where pr.name like 'P%' and p.amount between 10 and 20