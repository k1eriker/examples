CREATE DATABASE if not exists `spring_jdbc_db` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_german1_ci */;
use spring_jdbc_db;
CREATE TABLE Person(ID int not null auto_increment,
    FIRSTNAME VARCHAR(20) NOT NULL,
    LASTNAME VARCHAR(20) NOT NULL,
    PRIMARY KEY (ID)); 	