drop schema `bilabonnoment3`;/*sletter skema vi sletter og opretter for at holde skema opdateret*/
create schema `bilabonnoment3`;/*opretter skema*/
/*DDL(Data definition language) her skal vi først definere dataen*/
USE `bilabonnoment3`;/*bruger en bestemt database*/

create table `biler`(/*Opretter table*/
    `bilId`int not null auto_increment,/*indsætter attributer, id bliver auto generet*/
    `mærke`varchar(45) not null,
    `pris`int not null,
    `model`varchar(45) not null,
    `årgang`int not null,
    `brændstof`varchar(45) not null,
    primary key (`bilId`)/*definere primary_key*/

);

create table `Lejeaftaler`(
    `lejeId`int not null auto_increment,
    `kundenavn`varchar(45) not null,
    `kundeTlf`int not null,
    `kundemail`varchar(45) not null,
    `kundeAdresse`varchar(45) not null,
    `bilId`int not null,
    `startDato`int not null,
    `slutDato`int not null,
    `afhentLokation`varchar(45) not null,
    `afleveringsLokation`varchar(45) not null,
     primary key (`lejeId`),
     foreign key (bilId)REFERENCES biler(`bilId`));/* her laver jeg en foreignkey
                                                                              */
create table `Afsluttedeaftaler`(
    `afslutId`int not null auto_increment,
    `kundenavn`varchar(45) not null,
    `kundeTlf`int not null,
    `kundemail`varchar(45) not null,
    `kundeAdresse`varchar(45) not null,
    `bilId`int not null,
    `startDato`int not null,
    `slutDato`int not null,
    `afhentLokation`varchar(45) not null,
    `afleveringsLokation`varchar(45) not null,
    primary key (`afslutId`),
    foreign key (bilId)REFERENCES biler(`bilId`));

create table `Skader`(
    `skadeId`int not null auto_increment,
    `skadeBeskrivelse`varchar(45) not null,
    `skadePris`int not null,
    `bilId`int not null,
    primary key (`skadeId`),
    foreign key (bilId)REFERENCES biler(`bilId`));






