-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2020 at 07:08 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `car`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `a_name` char(30) DEFAULT NULL,
  `a_email` varchar(30) NOT NULL,
  `a_Address` varchar(30) DEFAULT NULL,
  `a_phone` varchar(15) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `age` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `adminotherinfo`
--

CREATE TABLE `adminotherinfo` (
  `a_email` varchar(30) DEFAULT NULL,
  `gender` char(30) DEFAULT NULL,
  `nationality` char(30) DEFAULT NULL,
  `occupation` char(30) DEFAULT NULL,
  `socialURL` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `buy_cust_car`
--

CREATE TABLE `buy_cust_car` (
  `c_email` varchar(30) DEFAULT NULL,
  `plate_no` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `plate_no` varchar(30) NOT NULL,
  `Brand` char(30) DEFAULT NULL,
  `Model` varchar(30) DEFAULT NULL,
  `Owner` char(30) DEFAULT NULL,
  `price` int(15) DEFAULT NULL,
  `CarImage` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `c_name` char(30) DEFAULT NULL,
  `c_email` varchar(30) NOT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `age` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `custotherinfo`
--

CREATE TABLE `custotherinfo` (
  `c_email` varchar(30) DEFAULT NULL,
  `gender` char(30) DEFAULT NULL,
  `nationality` char(30) DEFAULT NULL,
  `occupation` char(30) DEFAULT NULL,
  `socialURL` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `orderservice`
--

CREATE TABLE `orderservice` (
  `c_email` varchar(30) DEFAULT NULL,
  `voucher` varchar(30) DEFAULT NULL,
  `totalCost` int(15) DEFAULT NULL,
  `quantityAsk` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `own`
--

CREATE TABLE `own` (
  `c_email` varchar(30) DEFAULT NULL,
  `plate_no` varchar(30) DEFAULT NULL,
  `c_name` char(30) DEFAULT NULL,
  `Model` varchar(30) DEFAULT NULL,
  `brand` char(30) DEFAULT NULL,
  `CarImage` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `processbuyrequest`
--

CREATE TABLE `processbuyrequest` (
  `c_email` varchar(30) DEFAULT NULL,
  `a_email` varchar(30) DEFAULT NULL,
  `updateOwner` char(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `processnewadminrequest`
--

CREATE TABLE `processnewadminrequest` (
  `c_email` varchar(30) DEFAULT NULL,
  `a_email` varchar(30) DEFAULT NULL,
  `tracking_no` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `processsellrequest`
--

CREATE TABLE `processsellrequest` (
  `c_email` varchar(30) DEFAULT NULL,
  `a_email` varchar(30) DEFAULT NULL,
  `updatePrice` int(15) DEFAULT NULL,
  `plate_no` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `processservicerequest`
--

CREATE TABLE `processservicerequest` (
  `a_email` varchar(30) DEFAULT NULL,
  `voucher` varchar(30) DEFAULT NULL,
  `price` int(15) DEFAULT NULL,
  `quantity` int(10) DEFAULT NULL,
  `totalPrice` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sell_cust_car`
--

CREATE TABLE `sell_cust_car` (
  `c_email` varchar(30) DEFAULT NULL,
  `plate_no` varchar(30) DEFAULT NULL,
  `updated_price` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `serve_repair`
--

CREATE TABLE `serve_repair` (
  `service_name` varchar(30) DEFAULT NULL,
  `quantiity` int(10) DEFAULT NULL,
  `price` int(15) DEFAULT NULL,
  `voucher` varchar(30) NOT NULL,
  `ServiceImage` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`a_email`);

--
-- Indexes for table `adminotherinfo`
--
ALTER TABLE `adminotherinfo`
  ADD KEY `a_email` (`a_email`);

--
-- Indexes for table `buy_cust_car`
--
ALTER TABLE `buy_cust_car`
  ADD KEY `c_email` (`c_email`),
  ADD KEY `plate_no` (`plate_no`);

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`plate_no`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`c_email`);

--
-- Indexes for table `custotherinfo`
--
ALTER TABLE `custotherinfo`
  ADD KEY `c_email` (`c_email`);

--
-- Indexes for table `orderservice`
--
ALTER TABLE `orderservice`
  ADD KEY `c_email` (`c_email`),
  ADD KEY `voucher` (`voucher`);

--
-- Indexes for table `own`
--
ALTER TABLE `own`
  ADD KEY `c_email` (`c_email`),
  ADD KEY `plate_no` (`plate_no`);

--
-- Indexes for table `processbuyrequest`
--
ALTER TABLE `processbuyrequest`
  ADD KEY `c_email` (`c_email`),
  ADD KEY `a_email` (`a_email`);

--
-- Indexes for table `processnewadminrequest`
--
ALTER TABLE `processnewadminrequest`
  ADD KEY `c_email` (`c_email`),
  ADD KEY `a_email` (`a_email`);

--
-- Indexes for table `processsellrequest`
--
ALTER TABLE `processsellrequest`
  ADD KEY `c_email` (`c_email`),
  ADD KEY `a_email` (`a_email`),
  ADD KEY `plate_no` (`plate_no`);

--
-- Indexes for table `processservicerequest`
--
ALTER TABLE `processservicerequest`
  ADD KEY `a_email` (`a_email`),
  ADD KEY `voucher` (`voucher`);

--
-- Indexes for table `sell_cust_car`
--
ALTER TABLE `sell_cust_car`
  ADD KEY `c_email` (`c_email`),
  ADD KEY `plate_no` (`plate_no`);

--
-- Indexes for table `serve_repair`
--
ALTER TABLE `serve_repair`
  ADD PRIMARY KEY (`voucher`),
  ADD UNIQUE KEY `ServiceImage` (`ServiceImage`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `adminotherinfo`
--
ALTER TABLE `adminotherinfo`
  ADD CONSTRAINT `adminotherinfo_ibfk_1` FOREIGN KEY (`a_email`) REFERENCES `admin` (`a_email`);

--
-- Constraints for table `buy_cust_car`
--
ALTER TABLE `buy_cust_car`
  ADD CONSTRAINT `buy_cust_car_ibfk_1` FOREIGN KEY (`c_email`) REFERENCES `customer` (`c_email`),
  ADD CONSTRAINT `buy_cust_car_ibfk_2` FOREIGN KEY (`plate_no`) REFERENCES `car` (`plate_no`);

--
-- Constraints for table `custotherinfo`
--
ALTER TABLE `custotherinfo`
  ADD CONSTRAINT `custotherinfo_ibfk_1` FOREIGN KEY (`c_email`) REFERENCES `customer` (`c_email`);

--
-- Constraints for table `orderservice`
--
ALTER TABLE `orderservice`
  ADD CONSTRAINT `orderservice_ibfk_1` FOREIGN KEY (`c_email`) REFERENCES `customer` (`c_email`),
  ADD CONSTRAINT `orderservice_ibfk_2` FOREIGN KEY (`voucher`) REFERENCES `serve_repair` (`voucher`);

--
-- Constraints for table `own`
--
ALTER TABLE `own`
  ADD CONSTRAINT `own_ibfk_1` FOREIGN KEY (`c_email`) REFERENCES `customer` (`c_email`),
  ADD CONSTRAINT `own_ibfk_2` FOREIGN KEY (`plate_no`) REFERENCES `car` (`plate_no`);

--
-- Constraints for table `processbuyrequest`
--
ALTER TABLE `processbuyrequest`
  ADD CONSTRAINT `processbuyrequest_ibfk_1` FOREIGN KEY (`c_email`) REFERENCES `customer` (`c_email`),
  ADD CONSTRAINT `processbuyrequest_ibfk_2` FOREIGN KEY (`a_email`) REFERENCES `admin` (`a_email`);

--
-- Constraints for table `processnewadminrequest`
--
ALTER TABLE `processnewadminrequest`
  ADD CONSTRAINT `processnewadminrequest_ibfk_1` FOREIGN KEY (`c_email`) REFERENCES `customer` (`c_email`),
  ADD CONSTRAINT `processnewadminrequest_ibfk_2` FOREIGN KEY (`a_email`) REFERENCES `admin` (`a_email`);

--
-- Constraints for table `processsellrequest`
--
ALTER TABLE `processsellrequest`
  ADD CONSTRAINT `processsellrequest_ibfk_1` FOREIGN KEY (`c_email`) REFERENCES `customer` (`c_email`),
  ADD CONSTRAINT `processsellrequest_ibfk_2` FOREIGN KEY (`a_email`) REFERENCES `admin` (`a_email`),
  ADD CONSTRAINT `processsellrequest_ibfk_3` FOREIGN KEY (`plate_no`) REFERENCES `car` (`plate_no`);

--
-- Constraints for table `processservicerequest`
--
ALTER TABLE `processservicerequest`
  ADD CONSTRAINT `processservicerequest_ibfk_1` FOREIGN KEY (`a_email`) REFERENCES `admin` (`a_email`),
  ADD CONSTRAINT `processservicerequest_ibfk_2` FOREIGN KEY (`voucher`) REFERENCES `serve_repair` (`voucher`);

--
-- Constraints for table `sell_cust_car`
--
ALTER TABLE `sell_cust_car`
  ADD CONSTRAINT `sell_cust_car_ibfk_1` FOREIGN KEY (`c_email`) REFERENCES `customer` (`c_email`),
  ADD CONSTRAINT `sell_cust_car_ibfk_2` FOREIGN KEY (`plate_no`) REFERENCES `car` (`plate_no`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
