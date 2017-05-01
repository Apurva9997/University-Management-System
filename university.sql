-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2017 at 07:35 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university`
--

-- --------------------------------------------------------

--
-- Table structure for table `hosteller`
--

CREATE TABLE `hosteller` (
  `type1` varchar(5) DEFAULT NULL,
  `type2` varchar(10) DEFAULT NULL,
  `reg_no` varchar(10) NOT NULL,
  `block` varchar(10) DEFAULT NULL,
  `academic_year` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hosteller`
--

INSERT INTO `hosteller` (`type1`, `type2`, `reg_no`, `block`, `academic_year`) VALUES
('AC', 'Four Bed', '15BIT0273', 'k-429', '2018');

-- --------------------------------------------------------

--
-- Table structure for table `leav`
--

CREATE TABLE `leav` (
  `reg_no` varchar(20) NOT NULL,
  `Aa` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `_from` varchar(15) NOT NULL,
  `_to` varchar(15) NOT NULL,
  `place_address` varchar(100) DEFAULT NULL,
  `reason` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `leav`
--

INSERT INTO `leav` (`reg_no`, `Aa`, `type`, `_from`, `_to`, `place_address`, `reason`) VALUES
('15BIT0209', 'Proctor', 'Emergency', '12/01/2015', '14/01/2015', 'summer vacation', 'Meerut'),
('15BIT0273', 'Proctor', 'Home Town', '21-01-2013', '22-01-2013', 'outing', 'chennai');

-- --------------------------------------------------------

--
-- Table structure for table `library`
--

CREATE TABLE `library` (
  `reg_no` varchar(20) DEFAULT NULL,
  `bookissue` varchar(50) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL,
  `fine` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mess2`
--

CREATE TABLE `mess2` (
  `reg_no` varchar(20) NOT NULL,
  `block` varchar(20) DEFAULT NULL,
  `academic_year` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mess2`
--

INSERT INTO `mess2` (`reg_no`, `block`, `academic_year`, `type`) VALUES
('15BIT0209', 'P', '2015', 'North'),
('15BIT0273', 'K', '2017', 'Special Mess');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `name` varchar(100) DEFAULT NULL,
  `contact` varchar(15) DEFAULT NULL,
  `branch` varchar(30) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `nationality` varchar(30) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  `student_reg` varchar(10) NOT NULL,
  `father_name` varchar(80) DEFAULT NULL,
  `father_qualification` varchar(80) DEFAULT NULL,
  `father_contact` varchar(15) DEFAULT NULL,
  `mother_name` varchar(80) DEFAULT NULL,
  `mother_qualification` varchar(80) DEFAULT NULL,
  `mother_contact` varchar(15) DEFAULT NULL,
  `school` varchar(60) DEFAULT NULL,
  `board_name` varchar(30) DEFAULT NULL,
  `intermediate_score` varchar(15) DEFAULT NULL,
  `year_of_passing` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`name`, `contact`, `branch`, `dob`, `nationality`, `gender`, `email`, `address`, `student_reg`, `father_name`, `father_qualification`, `father_contact`, `mother_name`, `mother_qualification`, `mother_contact`, `school`, `board_name`, `intermediate_score`, `year_of_passing`) VALUES
('Apurva Garg', '9997913115', 'IT', '31-Aug-1997', 'INDIAN', NULL, 'apurva.garg2015@vit.ac.in', 'F-3,J-6,Shastrinagar,Meerut', '15BIT0273', 'Sudhir Garg', 'LLB,LLM', '9412618841', 'Geeta Garg', 'BSc', '8563214785', 'Translam Academy Int', 'CBSE', '94.8%', '2014');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UserName` varchar(50) NOT NULL,
  `user_Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserName`, `user_Password`) VALUES
('apoorv', '54321'),
('rahul', '54321');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hosteller`
--
ALTER TABLE `hosteller`
  ADD PRIMARY KEY (`reg_no`);

--
-- Indexes for table `leav`
--
ALTER TABLE `leav`
  ADD PRIMARY KEY (`reg_no`);

--
-- Indexes for table `mess2`
--
ALTER TABLE `mess2`
  ADD PRIMARY KEY (`reg_no`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_reg`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserName`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
