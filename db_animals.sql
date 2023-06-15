CREATE DATABASE IF NOT EXISTS animals;

USE animals;

CREATE TABLE `animals`.`cats` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NULL,
  `birth` VARCHAR(20) NULL,
  `commands` TEXT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `animals`.`dogs` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NULL,
  `birth` VARCHAR(20) NULL,
  `commands` TEXT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `animals`.`hamsters` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NULL,
  `birth` VARCHAR(20) NULL,
  `commands` TEXT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `animals`.`horses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NULL,
  `birth` VARCHAR(20) NULL,
  `commands` TEXT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `animals`.`donkeys` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NULL,
  `birth` VARCHAR(20) NULL,
  `commands` TEXT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `animals`.`camels` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NULL,
  `birth` VARCHAR(20) NULL,
  `commands` TEXT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `animals`.`counter` (
  `counter` INT NOT NULL);
  
CREATE TABLE `animals`.`connection_test` (
  `flag` BOOL NOT NULL);
 
-- Инициализировать переменную counter в таблице counter 
INSERT INTO counter
VALUES (0);

-- Инициализировать переменную flag в таблице connection_test
INSERT INTO connection_test
VALUES (true);