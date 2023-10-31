CREATE TABLE Marca
(
    id          int             primary key auto_increment,
    nombre      varchar(100)    not null,
    habilitado  boolean         not null,
    unique(nombre)
);


insert into marca values (null, 'Toyota', 1);
insert into marca values (null, 'Nissan', 1);

select * from marca;

-- Tarea: Crear una tabla Cargo con las 
-- columnas id, nombre, habilitado
-- agregar unas 5 filas