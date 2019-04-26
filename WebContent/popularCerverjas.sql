create database cervejariadb;

create table Cerveja 
(
rotulo varchar(100),
nota double (4,2),
cervejaria varchar(50),
preco double,
tamanho double,
pais varchar(2),
familia varchar(100),
estilo varchar(100),
teor double,
ibu int,
coloracao varchar(50),
temperatura double,
comentarios varchar(255)
);

--Popular
insert into Cerveja (rotulo, nota, cervejaria, preco, tamanho, pais, familia, estilo, teor, ibu, coloracao)
values
('Praya', 8, 'Praya', 12.9, 600, 'BR', 'premium', 'witbier', 5.3, 10, 'dourado');

insert into Cerveja (rotulo, nota, cervejaria, preco, tamanho, pais, familia, estilo, teor, ibu, coloracao, temperatura)
values
('Becks', 7, 'Beck & CO', 4.9, 275, 'DE ', 'lager', 'american lager', 5, 21, 'amarelo', 4 );