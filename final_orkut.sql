-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2020 at 08:04 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `final_orkut`
--

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `comment_id` int(11) NOT NULL,
  `post_id` int(11) DEFAULT NULL,
  `comment_content` varchar(100) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `username` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `comments_likes`
--

CREATE TABLE `comments_likes` (
  `comments_likes_id` int(11) NOT NULL,
  `comment_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `username` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `editinfo`
--

CREATE TABLE `editinfo` (
  `name` varchar(20) DEFAULT NULL,
  `dob` varchar(10) DEFAULT NULL,
  `language` varchar(15) DEFAULT NULL,
  `school` varchar(25) DEFAULT NULL,
  `mobile_no` int(14) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `about` varchar(50) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `interests` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `username` varchar(20) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `editinfo`
--

INSERT INTO `editinfo` (`name`, `dob`, `language`, `school`, `mobile_no`, `gender`, `about`, `location`, `interests`, `status`, `username`) VALUES
('Akansha tyagi', '01-01-1970', 'ENGLISH', 'T R M ', 70804050, 'FEMALE', 'INTELLIGENT GIRL', 'MURADNAGAR', 'STUDYING', 'COMMITED', 'aashi'),
('ADITYA KAPOOR', '5/7/99', 'HINDI', 'GALGOTIA', 50607080, 'MALE', 'STUDENT', 'DELHI', 'STUDY', '...', 'adityakapoor'),
('dctfvgybhu', '34567', 'cvgybhunj', 'vgbhnji', 2445678, 'FEMALE', 'ecrtvbynu', 'asdfvgbn', 'vtbhnjm', 'fvgbhnj', 'chetna'),
('dips', '03/05/1998', 'ENGLISH', 'GALGOTIAS UNIVERSITY', 40507010, 'FEMALE', 'STUDENT', 'DELHI', 'ASAFDFG', '', 'deep'),
('AVNEESH KUMAR', '8/9/99', 'ENGLISH', 'GALGOTIAS UNIVERSITY', 809070, 'MALE', 'PROFESSOR', 'NOIDA', 'DXGCH', 'FTFGHVJ', 'KUMARAVNEESH'),
('PRIYAAA', '5/6/1998', 'ENGLISH , HINDI', 'GALGOTIAS UNIVERSITY', 600950704, 'FEMALE', 'STUDENT', 'BIHAR', 'WRITING', '....', 'priyakumari'),
('Rohit Kumar Viswas', '01/01/2020', 'hindi, englsh, ', 'abc', 9876545, 'MALE', 'ver', 'haldwai', 'singing', 'commited', 'ROHIT');

-- --------------------------------------------------------

--
-- Table structure for table `friend`
--

CREATE TABLE `friend` (
  `friend_id` int(11) NOT NULL,
  `friend_one` varchar(30) DEFAULT NULL,
  `friend_two` varchar(30) DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `friend`
--

INSERT INTO `friend` (`friend_id`, `friend_one`, `friend_two`, `status`) VALUES
(1, 'aashi', 'deep', 1),
(2, 'aryanchaudhary', 'nandu', 1),
(3, 'PAMMU', 'raam', 0),
(4, 'deep', 'ROHIT', 0),
(5, 'PAMMU', 'deep', 1),
(6, 'deep', 'nandu', 1);

-- --------------------------------------------------------

--
-- Table structure for table `message`
--

CREATE TABLE `message` (
  `sn` int(11) NOT NULL,
  `f_1` varchar(20) DEFAULT NULL,
  `f_2` varchar(20) DEFAULT NULL,
  `message` varchar(500) DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `message`
--

INSERT INTO `message` (`sn`, `f_1`, `f_2`, `message`, `status`) VALUES
(15, 'deep', 'adityakapoor', 'mota bhai', NULL),
(16, 'deep', 'adityakapoor', 'motu', NULL),
(17, 'deep', 'nandu', 'hii', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `page_liked`
--

CREATE TABLE `page_liked` (
  `page_liked_id` int(11) NOT NULL,
  `page_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `username` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `photos`
--

CREATE TABLE `photos` (
  `photo_id` int(11) NOT NULL,
  `photo_name` varchar(50) DEFAULT NULL,
  `photo_path` varchar(100) DEFAULT NULL,
  `post_id` int(11) DEFAULT NULL,
  `username` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `photos`
--

INSERT INTO `photos` (`photo_id`, `photo_name`, `photo_path`, `post_id`, `username`) VALUES
(2, 'girl.png', 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\girl.png', NULL, 'deep'),
(3, 'boy_harry_profile.png', 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\boy_harry_profile.png', NULL, 'aashi'),
(4, 'boy_pic.png', 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\boy_pic.png', NULL, 'PAMMU'),
(5, 'boyy.jpg', 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\boyy.jpg', NULL, 'ROHIT'),
(6, 'girl_profile.png', 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\girl_profile.png', NULL, 'priyakumari'),
(7, 'boy_profile.png', 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\boy_profile.png', NULL, 'KUMARAVNEESH');

-- --------------------------------------------------------

--
-- Table structure for table `photos_likes`
--

CREATE TABLE `photos_likes` (
  `photos_likes_id` int(11) NOT NULL,
  `post_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `username` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `posts`
--

CREATE TABLE `posts` (
  `post_id` int(11) NOT NULL,
  `post_path` varchar(500) DEFAULT NULL,
  `post_date` varchar(20) DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `photo_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `posts`
--

INSERT INTO `posts` (`post_id`, `post_path`, `post_date`, `username`, `photo_name`) VALUES
(1, 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\girl_pic.png', NULL, 'deep', 'girl_pic.png'),
(2, 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\boy_profile.png', NULL, 'ROHIT', 'boy_profile.png'),
(3, 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\boy_profile.png', NULL, 'PAMMU', 'boy_profile.png'),
(4, 'C:\\Users\\shivam\\Downloads\\shikha(documents)\\miniorkut\\friends--v4.png', NULL, 'KUMARAVNEESH', 'friends--v4.png');

-- --------------------------------------------------------

--
-- Table structure for table `share`
--

CREATE TABLE `share` (
  `share_id` int(11) NOT NULL,
  `post_id` int(11) DEFAULT NULL,
  `username` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `name` varchar(20) DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `email_id` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `confirm_password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`name`, `username`, `dob`, `email_id`, `password`, `confirm_password`) VALUES
('Akanksha tyagi', 'aashi', '03-10-2020', 'aashityagi@gmail.com', '123456789', '123456789'),
('ADITYA', 'adityakapoor', '5/5/99', 'adityakapoor@gmail.com', '11111', '11111'),
('ARYAN', 'aryanchaudhary', '01-01-1970', 'aryan@gmail.com', '00000', '00000'),
('CHETANYA', 'chetna', '5/6/97', 'chetanaya@gmail.com', '33333', '33333'),
('CHIRAG SINGH', 'chiragsingh', '4/6/1997', 'chiragsingh@gmail.com', 'chirag', 'chirag'),
('Deepshikha', 'deep', '03-10-2020', 'deep@gmail.com', '12345', '12345'),
('AVNEESH KUMAR', 'KUMARAVNEESH', '8/9/1976', 'avneeshkumar@gmail.com', '11111', '11111'),
('NANDITA SHARMA', 'nandu', '4/8/1997', 'nanditasharma@gmail.com', 'sam', 'sam'),
('PAWAN MEHRA', 'PAMMU', '4/8/1998', 'pawan@gmail.com', '00000', '00000'),
('PRIYA KUMARI', 'priyakumari', '4/6/1999', 'priyakumari@gmail.com', '22222', '22222'),
('rama', 'raam', '01-01-1970', 'raam@gmail.com', '11111', '11111'),
('ROHIT UPRETI', 'ROHIT', '25/12/1999', 'rohitupreti@gmail.com', 'mansi', 'mansi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`comment_id`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `comments_likes`
--
ALTER TABLE `comments_likes`
  ADD PRIMARY KEY (`comments_likes_id`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `editinfo`
--
ALTER TABLE `editinfo`
  ADD UNIQUE KEY `username_2` (`username`),
  ADD UNIQUE KEY `mobile_no` (`mobile_no`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `friend`
--
ALTER TABLE `friend`
  ADD PRIMARY KEY (`friend_id`);

--
-- Indexes for table `message`
--
ALTER TABLE `message`
  ADD PRIMARY KEY (`sn`);

--
-- Indexes for table `page_liked`
--
ALTER TABLE `page_liked`
  ADD PRIMARY KEY (`page_liked_id`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `photos`
--
ALTER TABLE `photos`
  ADD PRIMARY KEY (`photo_id`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `photos_likes`
--
ALTER TABLE `photos_likes`
  ADD PRIMARY KEY (`photos_likes_id`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`post_id`),
  ADD UNIQUE KEY `post_date` (`post_date`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `share`
--
ALTER TABLE `share`
  ADD PRIMARY KEY (`share_id`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `comment_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `comments_likes`
--
ALTER TABLE `comments_likes`
  MODIFY `comments_likes_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `friend`
--
ALTER TABLE `friend`
  MODIFY `friend_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `message`
--
ALTER TABLE `message`
  MODIFY `sn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `page_liked`
--
ALTER TABLE `page_liked`
  MODIFY `page_liked_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `photos`
--
ALTER TABLE `photos`
  MODIFY `photo_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `photos_likes`
--
ALTER TABLE `photos_likes`
  MODIFY `photos_likes_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `posts`
--
ALTER TABLE `posts`
  MODIFY `post_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `share`
--
ALTER TABLE `share`
  MODIFY `share_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
