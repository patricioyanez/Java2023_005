CREATE TABLE Marca
(
    id          int             primary key auto_increment,
    nombre      varchar(100)    not null,
    habilitado  boolean         not null,
    unique(nombre)
);
CREATE TABLE Cargo
(
    id          int             primary key auto_increment,
    nombre      varchar(100)    not null,
    habilitado  boolean         not null,
    unique(nombre)
);
insert into marca values (null, 'Toyota', 1);
insert into marca values (null, 'Nissan', 1);
insert into marca values (null, 'Hyundai', 1);
insert into marca values (null, 'Fiat', 1);
insert into marca values (null, 'Peugeot', 1);

select * from marca;

-- Tarea 18: Crear una tabla Cargo con las 
-- columnas id, nombre, habilitado
-- agregar unas 5 filas