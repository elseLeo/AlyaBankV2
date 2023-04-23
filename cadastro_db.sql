show databases

use alyabank

show tables

select * from contaCorrente

drop table contaCorrente

create table contaCorrente (
id int (50) not null AUTO_INCREMENT primary key,
numConta char (64),
agencia char (64),
saldo double)
