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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-25  8:48:16
