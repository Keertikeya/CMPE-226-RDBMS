-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2015 at 01:20 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cmpe226team4`
--
CREATE DATABASE IF NOT EXISTS `cmpe226team4` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `cmpe226team4`;

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `batavg`()
begin
create view ba as
select name, playsfor, batavg
from player
order by batavg desc
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `bowlingavg`()
begin
create view boa as
select name, playsfor, bowlavg
from player
order by bowlavg
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `econrate`()
begin
create view er as
select name, playsfor, bowlecon
from player
order by bowlecon
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `highindi`()
begin
create view hi as
select name, playsfor, bathigh
from player
order by bathigh desc
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `maidenovers`()
begin
create view mo as
select name, playsfor, maidens
from player
order by maidens
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostwickets`()
begin
create view mw as
select name, playsfor, wkts
from player
order by wkts
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostwinpteams`()
begin
create view mwpt as
select name, winp
from team
order by winp
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostwinsteams`()
begin
create view mwt as
select name, matcheswon
from team
order by matcheswon
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `strrate`()
begin
create view sr as
select name, playsfor, batstrrate
from player
order by batstrrate
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `toptotalruns`()
begin
create view ttr as
select name, playsfor, runs
from player
order by runs desc
limit 10;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `updatePlayerBat`()
begin
update player
set batavg = runs/innings, batstrrate = runs/balls;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `updatePlayerBowl`()
begin
update player
set bowlavg = runsgiven/wkts, bowlecon = runsgiven/overs;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `winpteam`()
begin
update team
set winp=matcheswon/matchesplayed;
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `coaches`
--

CREATE TABLE IF NOT EXISTS `coaches` (
  `CoachName` varchar(50) NOT NULL DEFAULT '',
  `TeamName` varchar(25) NOT NULL DEFAULT '',
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `payment` int(8) DEFAULT NULL,
  `paymentdate` date DEFAULT NULL,
  PRIMARY KEY (`CoachName`,`TeamName`),
  KEY `TeamName` (`TeamName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coaches`
--

INSERT INTO `coaches` (`CoachName`, `TeamName`, `StartDate`, `EndDate`, `payment`, `paymentdate`) VALUES
('Bill', 'Australia', '2015-12-01', '2016-12-01', 1550, '2015-12-03'),
('Billy', 'England', '2015-02-14', '2015-11-14', 1000, '2015-12-03'),
('Charlie', 'south africa', '2013-02-05', '2015-02-05', 100, '2015-12-03'),
('Larry', 'India', '2014-09-01', '2015-09-01', 2500, '2015-12-03');

-- --------------------------------------------------------

--
-- Table structure for table `commentatesfor`
--

CREATE TABLE IF NOT EXISTS `commentatesfor` (
  `CommentatorName` varchar(50) NOT NULL DEFAULT '',
  `MatchID` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`CommentatorName`,`MatchID`),
  KEY `MatchID` (`MatchID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `match`
--

CREATE TABLE IF NOT EXISTS `match` (
  `MatchId` int(11) NOT NULL AUTO_INCREMENT,
  `Date` varchar(15) DEFAULT '01-01-2001',
  `Type` varchar(8) NOT NULL,
  `MoM` varchar(50) NOT NULL,
  `MoMTeam` varchar(25) NOT NULL,
  `Result` varchar(50) NOT NULL,
  `Venue` varchar(40) NOT NULL,
  PRIMARY KEY (`MatchId`),
  KEY `Venue` (`Venue`),
  KEY `MoM` (`MoM`),
  KEY `MoMTeam` (`MoMTeam`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `officials`
--

CREATE TABLE IF NOT EXISTS `officials` (
  `Name` varchar(40) NOT NULL,
  `Sex` varchar(10) NOT NULL,
  `Age` int(2) DEFAULT '15',
  `Nationality` varchar(25) NOT NULL,
  `Role` varchar(20) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE IF NOT EXISTS `player` (
  `Name` varchar(50) NOT NULL,
  `Wkts` int(11) DEFAULT '0',
  `Role` varchar(30) NOT NULL DEFAULT '0',
  `Age` int(2) DEFAULT '15',
  `Balls` int(5) DEFAULT '0',
  `BatAvg` decimal(6,3) DEFAULT '0.000',
  `BatStrRate` decimal(6,3) DEFAULT '0.000',
  `Maidens` int(11) DEFAULT '0',
  `RunsGiven` int(11) DEFAULT '0',
  `Overs` int(11) DEFAULT '0',
  `6s` int(11) DEFAULT '0',
  `4s` int(11) DEFAULT '0',
  `BatHigh` int(3) DEFAULT '0',
  `BowlAvg` decimal(6,3) DEFAULT '0.000',
  `bowlecon` decimal(6,3) DEFAULT '0.000',
  `MoM` int(3) DEFAULT '0',
  `Runs` int(11) DEFAULT '0',
  `Innings` int(11) DEFAULT '0',
  `MatchesPlayed` int(11) DEFAULT '0',
  `PlaysFor` varchar(25) NOT NULL,
  PRIMARY KEY (`Name`,`PlaysFor`),
  KEY `PlaysFor` (`PlaysFor`),
  KEY `Name` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `player`
--

INSERT INTO `player` (`Name`, `Wkts`, `Role`, `Age`, `Balls`, `BatAvg`, `BatStrRate`, `Maidens`, `RunsGiven`, `Overs`, `6s`, `4s`, `BatHigh`, `BowlAvg`, `bowlecon`, `MoM`, `Runs`, `Innings`, `MatchesPlayed`, `PlaysFor`) VALUES
('AB de Villiers', 0, 'Wicket Keeper/Captain', 31, 8379, '0.000', '0.000', 0, 0, 0, 181, 743, 162, '0.000', '0.000', 0, 8403, 187, 195, 'south africa'),
('Amit Fernandes', 0, 'Captain', 25, 1000, '0.000', '0.000', 0, 0, 0, 99, 5000, 188, '0.000', '0.000', 0, 20000, 189, 200, 'India'),
('Hashim Amla', 0, 'Opening Batsman', 32, 6723, '0.000', '0.000', 0, 0, 0, 38, 603, 159, '0.000', '0.000', 0, 6008, 123, 126, 'south africa'),
('Joseph Root', 12, 'Middle Order Batsman', 34, 2661, '0.000', '0.000', 4, 814, 141, 19, 174, 121, '0.000', '0.000', 0, 2221, 59, 63, 'England'),
('Kevin Pietersen', 7, 'Middle Order Batsman', 35, 5128, '0.000', '0.000', 1, 370, 67, 77, 427, 130, '0.000', '0.000', 0, 4440, 125, 136, 'England'),
('Mitchell Starc', 90, 'Opening Bowler', 25, 193, '0.000', '0.000', 16, 1769, 364, 1, 14, 52, '0.000', '0.000', 0, 46, 19, 46, 'Australia'),
('MS Dhoni', 0, 'Captain', 34, 9912, '0.000', '0.000', 0, 0, 0, 188, 687, 188, '0.000', '0.000', 0, 8832, 236, 270, 'India'),
('Sachin Tendulkar', 154, 'Opening Batsman', 42, 21367, '0.000', '0.000', 19, 6850, 1342, 195, 2016, 200, '0.000', '0.000', 0, 18426, 452, 463, 'India'),
('Shane Warne', 293, 'Leg Spinner', 46, 1413, '0.000', '0.000', 107, 7541, 1773, 1, 60, 55, '0.000', '0.000', 0, 1018, 107, 194, 'Australia'),
('Virat Kohli', 4, 'Middle Order Batsman', 27, 0, '0.000', '0.000', 0, 616, 95, 68, 641, 183, '0.000', '0.000', 0, 6831, 158, 166, 'India');

--
-- Triggers `player`
--
DROP TRIGGER IF EXISTS `innumsix`;
DELIMITER //
CREATE TRIGGER `innumsix` BEFORE INSERT ON `player`
 FOR EACH ROW SET @num = @num + NEW.`6s`
//
DELIMITER ;
DROP TRIGGER IF EXISTS `upnumsix`;
DELIMITER //
CREATE TRIGGER `upnumsix` BEFORE UPDATE ON `player`
 FOR EACH ROW SET @num = @num + NEW.`6s`
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `plays`
--

CREATE TABLE IF NOT EXISTS `plays` (
  `MatchID` int(11) NOT NULL DEFAULT '0',
  `T1Name` varchar(25) NOT NULL,
  `T2Name` varchar(25) NOT NULL,
  `T2Overs` decimal(3,1) NOT NULL DEFAULT '0.0',
  `T1Overs` decimal(3,1) NOT NULL DEFAULT '0.0',
  `T1Score` int(2) NOT NULL DEFAULT '0',
  `T2Score` int(2) NOT NULL,
  `T1Wkts` int(2) NOT NULL DEFAULT '0',
  `T2Wkts` int(2) NOT NULL DEFAULT '0',
  `T1Extras` int(2) NOT NULL DEFAULT '0',
  `T2Extras` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`MatchID`,`T1Name`,`T2Name`),
  KEY `T1Name` (`T1Name`),
  KEY `T2Name` (`T2Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `safeuser`
--

CREATE TABLE IF NOT EXISTS `safeuser` (
  `username` varchar(25) DEFAULT NULL,
  `encpwd` varchar(50) DEFAULT NULL,
  `type` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `safeuser`
--

INSERT INTO `safeuser` (`username`, `encpwd`, `type`) VALUES
('administrator', '€ê–&M\Zí‘sy]ç½?_G', 'admin'),
('user', '€¾ôÎžyê¹Qhñ49Ø@', 'user'),
('sarthak', '€aöFƒjU‹', 'admin'),
('izhar', '€S2¯cÊË', 'admin'),
('keertikeya', '€ËX''2¨U', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `team`
--

CREATE TABLE IF NOT EXISTS `team` (
  `Name` varchar(25) NOT NULL,
  `Location` varchar(25) NOT NULL,
  `MatchesPlayed` int(5) DEFAULT '0',
  `MatchesWon` int(5) DEFAULT '0',
  `MatchesLost` int(5) DEFAULT '0',
  `MatchesDrawn` int(5) DEFAULT '0',
  `winp` decimal(5,2) DEFAULT '0.00',
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `team`
--

INSERT INTO `team` (`Name`, `Location`, `MatchesPlayed`, `MatchesWon`, `MatchesLost`, `MatchesDrawn`, `winp`) VALUES
('Australia', 'Australia', 1678, 1011, 588, 79, '60.25'),
('England', 'England', 1700, 867, 675, 158, '51.00'),
('India', 'Mumbai', 967, 589, 317, 61, '60.91'),
('south africa', 'south africa', 1000, 760, 210, 30, '76.00');

--
-- Triggers `team`
--
DROP TRIGGER IF EXISTS `teamwinp`;
DELIMITER //
CREATE TRIGGER `teamwinp` BEFORE INSERT ON `team`
 FOR EACH ROW set new.winp = new.matcheswon/new.matchesplayed * 100
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `teamselectorfor`
--

CREATE TABLE IF NOT EXISTS `teamselectorfor` (
  `SelectorName` varchar(50) NOT NULL DEFAULT '',
  `TeamName` varchar(25) NOT NULL DEFAULT '',
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  PRIMARY KEY (`SelectorName`,`TeamName`),
  KEY `TeamName` (`TeamName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teamsupport`
--

CREATE TABLE IF NOT EXISTS `teamsupport` (
  `Name` varchar(40) NOT NULL,
  `Sex` varchar(2) NOT NULL,
  `DoB` int(2) DEFAULT '15',
  `Nationality` varchar(25) NOT NULL,
  `Role` varchar(20) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teamsupport`
--

INSERT INTO `teamsupport` (`Name`, `Sex`, `DoB`, `Nationality`, `Role`) VALUES
('Bill', 'M', 68, 'South African', 'Coach'),
('Billy', 'M', 44, 'German', 'Coach'),
('Charlie', 'M', 54, 'Irish', 'Coach'),
('George', 'M', 56, 'English', 'Team Selector'),
('Larry', 'M', 45, 'English', 'Coach'),
('Peter', 'M', 56, 'Australian', 'Team Selector'),
('Shinde', 'M', 48, 'Indian', 'Team Selector');

-- --------------------------------------------------------

--
-- Stand-in structure for view `topbatsmen`
--
CREATE TABLE IF NOT EXISTS `topbatsmen` (
`name` varchar(50)
,`playsfor` varchar(25)
,`runs` int(11)
);
-- --------------------------------------------------------

--
-- Stand-in structure for view `topteams`
--
CREATE TABLE IF NOT EXISTS `topteams` (
`name` varchar(25)
,`winp` decimal(5,2)
);
-- --------------------------------------------------------

--
-- Table structure for table `umpiresfor`
--

CREATE TABLE IF NOT EXISTS `umpiresfor` (
  `UmpireName` varchar(50) DEFAULT NULL,
  `MatchID` int(11) NOT NULL,
  KEY `UmpireName` (`UmpireName`),
  KEY `MatchID` (`MatchID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Role` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Username`, `Password`, `Role`) VALUES
('admin', 'pwd', 'admin'),
('user', 'pwd1', 'user'),
('new', 'ppp', 'user'),
('old', 'test', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `venue`
--

CREATE TABLE IF NOT EXISTS `venue` (
  `Name` varchar(40) NOT NULL,
  `City` varchar(20) NOT NULL,
  `Country` varchar(25) NOT NULL,
  `Capacity` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Name`,`City`,`Country`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `venue`
--

INSERT INTO `venue` (`Name`, `City`, `Country`, `Capacity`) VALUES
('Lords', 'London', 'England', 500000),
('SJSU', 'San Jose', 'USA', 1000000);

-- --------------------------------------------------------

--
-- Structure for view `topbatsmen`
--
DROP TABLE IF EXISTS `topbatsmen`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `topbatsmen` AS select `player`.`Name` AS `name`,`player`.`PlaysFor` AS `playsfor`,`player`.`Runs` AS `runs` from `player` order by `player`.`Runs` desc limit 5;

-- --------------------------------------------------------

--
-- Structure for view `topteams`
--
DROP TABLE IF EXISTS `topteams`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `topteams` AS select `team`.`Name` AS `name`,`team`.`winp` AS `winp` from `team` order by `team`.`winp` desc limit 5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `coaches`
--
ALTER TABLE `coaches`
  ADD CONSTRAINT `coaches_ibfk_1` FOREIGN KEY (`CoachName`) REFERENCES `teamsupport` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `coaches_ibfk_2` FOREIGN KEY (`TeamName`) REFERENCES `team` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `commentatesfor`
--
ALTER TABLE `commentatesfor`
  ADD CONSTRAINT `commentatesfor_ibfk_1` FOREIGN KEY (`CommentatorName`) REFERENCES `officials` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `commentatesfor_ibfk_2` FOREIGN KEY (`MatchID`) REFERENCES `match` (`MatchId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `match`
--
ALTER TABLE `match`
  ADD CONSTRAINT `match_ibfk_1` FOREIGN KEY (`Venue`) REFERENCES `venue` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `match_ibfk_2` FOREIGN KEY (`MoM`) REFERENCES `player` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `match_ibfk_3` FOREIGN KEY (`MoMTeam`) REFERENCES `player` (`PlaysFor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `player`
--
ALTER TABLE `player`
  ADD CONSTRAINT `player_ibfk_1` FOREIGN KEY (`PlaysFor`) REFERENCES `team` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `plays`
--
ALTER TABLE `plays`
  ADD CONSTRAINT `plays_ibfk_1` FOREIGN KEY (`MatchID`) REFERENCES `match` (`MatchId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `plays_ibfk_2` FOREIGN KEY (`T1Name`) REFERENCES `team` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `plays_ibfk_3` FOREIGN KEY (`T2Name`) REFERENCES `team` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `teamselectorfor`
--
ALTER TABLE `teamselectorfor`
  ADD CONSTRAINT `teamselectorfor_ibfk_1` FOREIGN KEY (`SelectorName`) REFERENCES `teamsupport` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `teamselectorfor_ibfk_2` FOREIGN KEY (`TeamName`) REFERENCES `team` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `umpiresfor`
--
ALTER TABLE `umpiresfor`
  ADD CONSTRAINT `umpiresfor_ibfk_1` FOREIGN KEY (`UmpireName`) REFERENCES `officials` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `umpiresfor_ibfk_2` FOREIGN KEY (`MatchID`) REFERENCES `match` (`MatchId`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
