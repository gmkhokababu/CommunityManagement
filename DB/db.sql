CREATE DATABASE  IF NOT EXISTS `community_service` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `community_service`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: community_service
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accounts` (
  `acc_id` int(11) NOT NULL AUTO_INCREMENT,
  `account_type` varchar(255) DEFAULT NULL,
  `acc_no` varchar(255) DEFAULT NULL,
  `account_name` varchar(255) DEFAULT NULL,
  `debit` double NOT NULL,
  `credit` double NOT NULL,
  `balance` double NOT NULL,
  PRIMARY KEY (`acc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (1,'owner','2134567890','DBBL',0,0,0),(2,'admin','100025635','MTB',0,175000,175000);
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `advertise_catagory`
--

DROP TABLE IF EXISTS `advertise_catagory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `advertise_catagory` (
  `catagory_id` int(11) NOT NULL AUTO_INCREMENT,
  `catagory_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`catagory_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advertise_catagory`
--

LOCK TABLES `advertise_catagory` WRITE;
/*!40000 ALTER TABLE `advertise_catagory` DISABLE KEYS */;
INSERT INTO `advertise_catagory` VALUES (1,'Bill Board'),(2,'Big Bill Board');
/*!40000 ALTER TABLE `advertise_catagory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `advertisement_property`
--

DROP TABLE IF EXISTS `advertisement_property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `advertisement_property` (
  `ad_property_id` int(11) NOT NULL AUTO_INCREMENT,
  `catagory` varchar(255) DEFAULT NULL,
  `property_name` varchar(255) DEFAULT NULL,
  `rent_per_month` double DEFAULT NULL,
  `service_charge` double DEFAULT NULL,
  PRIMARY KEY (`ad_property_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advertisement_property`
--

LOCK TABLES `advertisement_property` WRITE;
/*!40000 ALTER TABLE `advertisement_property` DISABLE KEYS */;
INSERT INTO `advertisement_property` VALUES (1,'Bill Board','Bill Board 1',15000,2500);
/*!40000 ALTER TABLE `advertisement_property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `advertisement_property_booking`
--

DROP TABLE IF EXISTS `advertisement_property_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `advertisement_property_booking` (
  `ad_property_booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `ad_property_id` int(11) NOT NULL,
  `booking_end` date DEFAULT NULL,
  `booking_start` date DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ad_property_booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advertisement_property_booking`
--

LOCK TABLES `advertisement_property_booking` WRITE;
/*!40000 ALTER TABLE `advertisement_property_booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertisement_property_booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `owner`
--

DROP TABLE IF EXISTS `owner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `owner` (
  `owner_id` int(11) NOT NULL AUTO_INCREMENT,
  `owner_name` varchar(255) DEFAULT NULL,
  `owner_phone_no` varchar(255) NOT NULL,
  `acc_no` varchar(255) NOT NULL,
  PRIMARY KEY (`owner_id`),
  UNIQUE KEY `UKsqd9j4hspw3spjfq9lv2dvrfp` (`acc_no`),
  UNIQUE KEY `UKot6lfurg3soahdix6wk3d2msy` (`owner_phone_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owner`
--

LOCK TABLES `owner` WRITE;
/*!40000 ALTER TABLE `owner` DISABLE KEYS */;
INSERT INTO `owner` VALUES (1,'Abu Hossain','01516718442','2134567890'),(1001,'Admin','01325698563','100025635');
/*!40000 ALTER TABLE `owner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `property` (
  `propertyid` int(11) NOT NULL AUTO_INCREMENT,
  `flat_no` varchar(255) DEFAULT NULL,
  `house_no` int(11) NOT NULL,
  `owner_id` int(11) NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`propertyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rent_service_property`
--

DROP TABLE IF EXISTS `rent_service_property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rent_service_property` (
  `service_propertyid` int(11) NOT NULL AUTO_INCREMENT,
  `property_name` varchar(255) DEFAULT NULL,
  `rent_pday` double NOT NULL,
  `servicecharge` double NOT NULL,
  `catagory` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`service_propertyid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rent_service_property`
--

LOCK TABLES `rent_service_property` WRITE;
/*!40000 ALTER TABLE `rent_service_property` DISABLE KEYS */;
INSERT INTO `rent_service_property` VALUES (1,'Park View Community',15000,2500,'Community center'),(2,'River view community',12500,2500,'Community center');
/*!40000 ALTER TABLE `rent_service_property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rent_service_property_booking`
--

DROP TABLE IF EXISTS `rent_service_property_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rent_service_property_booking` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `service_propertyid` int(11) NOT NULL,
  `booking_start` date DEFAULT NULL,
  `booking_end` date DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rent_service_property_booking`
--

LOCK TABLES `rent_service_property_booking` WRITE;
/*!40000 ALTER TABLE `rent_service_property_booking` DISABLE KEYS */;
INSERT INTO `rent_service_property_booking` VALUES (1,1,'2024-06-25','2024-06-26','Booked','Khokababu','013200000000'),(2,1,'2024-06-25','2024-06-27','Booked','Khokababu','01516718442'),(3,1,'2024-06-25','2024-06-27','Booked','Khokababu','01516718442'),(4,1,'2024-06-25','2024-06-27','Booked','Khokababu','01516718442'),(5,1,'2024-06-25','2024-06-27','Booked','Khokababu','01516718442'),(6,1,'2024-06-25','2024-06-27','Booked','Khokababu','01516718442'),(7,1,'2024-06-26','2024-06-27','Booked','Khokababu','01516718442'),(8,1,'2024-06-26','2024-06-28','Booked','Khokababu','01516718442'),(9,1,'2024-06-26','2024-06-28','Booked','Khokababu','01516718442');
/*!40000 ALTER TABLE `rent_service_property_booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rental_agreement`
--

DROP TABLE IF EXISTS `rental_agreement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rental_agreement` (
  `agreementid` int(11) NOT NULL AUTO_INCREMENT,
  `fixed_depo` double NOT NULL,
  `flatno` varchar(255) DEFAULT NULL,
  `house_no` int(11) NOT NULL,
  `rent_per_month` double NOT NULL,
  `service_bill` double NOT NULL,
  `utility_bill` double NOT NULL,
  PRIMARY KEY (`agreementid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rental_agreement`
--

LOCK TABLES `rental_agreement` WRITE;
/*!40000 ALTER TABLE `rental_agreement` DISABLE KEYS */;
/*!40000 ALTER TABLE `rental_agreement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rental_registration`
--

DROP TABLE IF EXISTS `rental_registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rental_registration` (
  `regid` int(11) NOT NULL AUTO_INCREMENT,
  `family_member` int(11) NOT NULL,
  `flat_no` varchar(255) DEFAULT NULL,
  `house_no` int(11) NOT NULL,
  `occupation` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `rent_date` date DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tenant_name` varchar(255) DEFAULT NULL,
  `terminate_date` date DEFAULT NULL,
  PRIMARY KEY (`regid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rental_registration`
--

LOCK TABLES `rental_registration` WRITE;
/*!40000 ALTER TABLE `rental_registration` DISABLE KEYS */;
/*!40000 ALTER TABLE `rental_registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_bill`
--

DROP TABLE IF EXISTS `service_bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_bill` (
  `service_bill_id` int(11) NOT NULL AUTO_INCREMENT,
  `ammount` double NOT NULL,
  `date` date DEFAULT NULL,
  `payer_id` int(11) NOT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  `request_id` int(11) NOT NULL,
  PRIMARY KEY (`service_bill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_bill`
--

LOCK TABLES `service_bill` WRITE;
/*!40000 ALTER TABLE `service_bill` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_booking`
--

DROP TABLE IF EXISTS `service_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_booking` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `boker_id` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_booking`
--

LOCK TABLES `service_booking` WRITE;
/*!40000 ALTER TABLE `service_booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_catagory`
--

DROP TABLE IF EXISTS `service_catagory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_catagory` (
  `catagory_id` int(11) NOT NULL AUTO_INCREMENT,
  `catagory_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`catagory_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_catagory`
--

LOCK TABLES `service_catagory` WRITE;
/*!40000 ALTER TABLE `service_catagory` DISABLE KEYS */;
INSERT INTO `service_catagory` VALUES (1,'Community Center'),(2,'Play Ground'),(3,NULL);
/*!40000 ALTER TABLE `service_catagory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_request`
--

DROP TABLE IF EXISTS `service_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_request` (
  `request_id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `flat_no` varchar(255) DEFAULT NULL,
  `house_no` int(11) NOT NULL,
  `requestdate` date DEFAULT NULL,
  `service_date` date DEFAULT NULL,
  `service_head` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`request_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_request`
--

LOCK TABLES `service_request` WRITE;
/*!40000 ALTER TABLE `service_request` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transection`
--

DROP TABLE IF EXISTS `transection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transection` (
  `transection_id` int(11) NOT NULL AUTO_INCREMENT,
  `acc_no` int(11) NOT NULL,
  `ammount` double NOT NULL,
  `date` date DEFAULT NULL,
  `payer_id` int(11) NOT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  `transection_status` varchar(255) DEFAULT NULL,
  `transection_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`transection_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transection`
--

LOCK TABLES `transection` WRITE;
/*!40000 ALTER TABLE `transection` DISABLE KEYS */;
INSERT INTO `transection` VALUES (1,0,47500,'2024-06-25',1001,'rent','Service Fee','Cash Deposit'),(2,100025635,47500,'2024-06-25',1001,'rent','Service Fee','Cash Deposit'),(3,100025635,47500,'2024-06-25',1001,'rent','Service Fee','Cash Deposit'),(4,100025635,47500,'2024-06-25',1001,'rent','Service Fee','Cash Deposit'),(5,100025635,47500,'2024-06-25',1001,'rent','Service Fee','Cash Deposit'),(6,0,47500,'2024-06-25',1001,'rent','Service Fee','Cash Deposit'),(7,100025635,47500,'2024-06-25',1001,'rent','Service Fee','Cash Deposit');
/*!40000 ALTER TABLE `transection` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-25 14:43:49
