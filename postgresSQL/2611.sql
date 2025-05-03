select m.id, m.name from movies m
inner join genres gen on m.id_genres = gen.id
where lower(gen.description) = 'action'