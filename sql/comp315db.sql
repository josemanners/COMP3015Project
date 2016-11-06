#
# create the database
#
CREATE SCHEMA IF NOT EXISTS `comp3015db`;
USE `comp3015db`;

DROP TABLE IF EXISTS `comp3015db`.`Ad`;
CREATE TABLE IF NOT EXISTS `comp3015db`.`Ad` (
	ID INT auto_increment primary key,
	Title VARCHAR(50) NOT NULL,
	Descr VARCHAR(500),
    Type TINYINT(1), # 0 = rent, 1 = sale
    ProductTypeID INT,
    Image LONGBLOB,
    Phone VARCHAR(12),
    Email VARCHAR(255),
    OwnerID INT,
    Price NUMERIC(15,2)
);

DROP TABLE IF EXISTS `comp3015db`.`ProductType`;
CREATE TABLE IF NOT EXISTS `comp3015db`.`ProductType` (
	ID INT auto_increment primary key,
	Descr VARCHAR(10)   # casa, auto
);

DROP TABLE IF EXISTS `comp3015db`.`User`;
CREATE TABLE IF NOT EXISTS `comp3015db`.`User` (
	ID INT auto_increment primary key,
	FirstName VARCHAR(20) NOT NULL,
	MiddleName VARCHAR(20),
	PaternalSurName VARCHAR(20) NOT NULL,
	MaternalSurName VARCHAR(20),
    BirthDate DATE NOT NULL,
    UserName VARCHAR(15) NOT NULL,
    Password VARCHAR(40) NOT NULL   # 40 in case we want to use encryption
);

ALTER TABLE `comp3015db`.`Ad` ADD CONSTRAINT `Ad_OwnerID_FK`
	FOREIGN KEY (OwnerID)
    REFERENCES `comp3015db`.`User` (ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION;

ALTER TABLE `comp3015db`.`Ad` ADD CONSTRAINT `Ad_ProductType_FK`
	FOREIGN KEY (ProductTypeID)
    REFERENCES `comp3015db`.`ProductType` (ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION;
    
INSERT INTO `comp3015db`.`ProductType` (Descr) VALUES ("Casa");
INSERT INTO `comp3015db`.`ProductType` (Descr) VALUES ("Auto");

INSERT INTO `comp3015db`.`User`
(`FirstName`,
`MiddleName`,
`PaternalSurName`,
`MaternalSurName`,
`BirthDate`,
`UserName`,
`Password`)
VALUES
("Juan",
"Miguel",
"Del Pueblo",
"Rodriguez",
'1980-04-25',
"juandelpue",
"interaguadilla");

INSERT INTO `comp3015db`.`Ad`
(`Title`,
`Descr`,
`Type`,
`ProductTypeID`,
`Image`,
`Phone`,
`Email`,
`OwnerID`,
`Price`)
VALUES
("Urb. Enramada, Rio Hondo",
"4 Cuartos, 2 1/2 baños. En retoques finales. Doble portón eléctrico, incluye seguridad y Landscaping en frontyard, unidades A/C en sala y cuartos, ventanas de seguridad y calentador solar. Frente a área deportiva,cancha de baloncesto y pista de joguear.",
0,
1,
LOAD_FILE('2_large.jpg'),
"787-555-1212",
"juandelpueblo@coqui.net",
1,
1300.00);


