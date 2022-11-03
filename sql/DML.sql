use `bilabonnoment3`;

/*her har jeg hardcoded data til min database her i DML(data manipulation language)*/
insert into biler (mærke, pris, model, årgang, brændstof)
values ('mercedes', 12, 'e220', 2015,'diesel')
, ('bmw', 10, 'm5', 2017, 'benzin'), ('audi', 8, 'a6', 2018, 'diesel');

insert into Lejeaftaler(kundenavn, kundeTlf, kundemail, kundeAdresse, bilId, startDato, slutDato, afhentLokation, afleveringsLokation)
values ('jens', 12345678, 'jens', 'jensvej 1', 1, '140499', '150499', 'jensvej 1', 'jensvej 1');

insert into Afsluttedeaftaler(afslutId, kundenavn, kundeTlf, kundemail, kundeAdresse, bilId, startDato, slutDato, afhentLokation, afleveringsLokation)
values (101,'jens',888888,'jens@hotmail.dk','jensvej',2,140499,190422,'jensgade','jensgade');

