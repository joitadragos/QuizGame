-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 14, 2019 at 11:34 AM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quizgame`
--

-- --------------------------------------------------------

--
-- Table structure for table `intrebari`
--

DROP TABLE IF EXISTS `intrebari`;
CREATE TABLE IF NOT EXISTS `intrebari` (
  `intrebare_id` int(10) NOT NULL AUTO_INCREMENT,
  `intrebare` varchar(150) COLLATE utf8mb4_romanian_ci NOT NULL,
  `categorie` varchar(10) COLLATE utf8mb4_romanian_ci NOT NULL,
  `dificultate` int(4) NOT NULL,
  PRIMARY KEY (`intrebare_id`)
) ENGINE=MyISAM AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_romanian_ci;

--
-- Dumping data for table `intrebari`
--

INSERT INTO `intrebari` (`intrebare_id`, `intrebare`, `categorie`, `dificultate`) VALUES
(1, 'Cel mai mare rau din Africa este?', 'Geografie', 1),
(2, 'Ce rau traverseaza Parisul, capitala Frantei?', 'Geografie', 1),
(3, 'Cate emirate fac parte din Emiratele Arabe Unite?', 'Geografie', 1),
(4, 'Care este capitala Bulgariei?', 'Geografie', 1),
(5, 'Care este raul principal care traverseaza orasul Hamburg?', 'Geografie', 1),
(6, 'intrebare\r\nLinia imaginara care desparte tarile din Europa de Vest de cele din europa de Est dupa al doilea Razboi Mondial era cunoscuta drept?', 'Geografie', 1),
(7, 'Ce capitala europeana s-a numit Christiana?', 'Geografie', 1),
(8, 'In functie de suprafata care este cel mai mic ocean din lume?', 'Geografie', 1),
(9, 'Care din urmatoarele variante este un continent?', 'Geografie', 1),
(10, 'Care este cel mai intins continent de pe pamant?', 'Geografie', 1),
(11, 'Care este a doua cea mai populata tara din Europa(Populatie:82.210.000)?', 'Geografie', 2),
(12, 'Care este cea mai mica tara din lume ca suprafata?', 'Geografie', 2),
(13, 'Fluviul Mississippi se varsa in:', 'Geografie', 2),
(14, 'Ce este La Palma?', 'Geografie', 2),
(15, 'Care este cel mai aglomerat aeroport?', 'Geografie', 2),
(16, 'Care este capitala Australiei', 'Geografie', 2),
(17, 'In ce comitat este Castelul Leeds', 'Geografie', 2),
(18, 'Care este capitala Turciei?', 'Geografie', 2),
(19, 'Care este cel mai lung rau din lume?', 'Geografie', 2),
(20, 'Care este capitala Braziliei', 'Geografie ', 2),
(21, 'In ce an a aparut filmul Singur Acasa?', 'Film', 1),
(22, 'Filmul \"Fight Club\" a aparut in anul:', 'Film', 1),
(23, 'In filmul \"Stapanul Inelelor\" personajul Sméagol este?', 'Film', 1),
(24, 'Unde se desfasoara actiunea din serialul Hackerville?', 'Film', 1),
(25, 'In filmul DEADPOOL rolul lui Deadpool este jucat de:', 'Film', 1),
(26, 'Ce rol joaca Leonardo DiCaprio in filmul The Wolf of Wall Street?', 'Film', 1),
(27, 'In filmul Venom rolul lui Venom este jucat de?', 'Film', 1),
(28, 'Care este prima regula din Fight Club?', 'Film', 1),
(29, 'Ultimul film din seria Spider-Man se numeste:', 'Film', 1),
(30, 'Cine este personajul principal din fimul The Matrix?', 'Film', 1),
(31, 'In ce an a aparut filmul The Matrix?', 'Film', 2),
(32, 'Cine a facut coloana sonora pentru serialul Hackerville?', 'Film', 2),
(33, 'Cine joaca rolul lui Ilie Moromete in filmul Morometii 2?', 'Film', 2),
(34, 'In ce an a aparut filmul \"Cel mai iubit dintre pamanteni\"?', 'Film', 2),
(35, 'Pe ce data a aparut primul episod al serialului Game of Thrones?', 'Film', 2),
(36, 'Prima persoana care moare in serialul Game of Thrones se numeste?', 'Film', 2),
(37, 'Din cate filme este formata seria The Lord of the Rings?', 'Film', 2),
(38, 'In ce serial apare cea mai mare scena de lupta?', 'Film', 2),
(39, 'Din cate filme este alcatuita seria Batman?', 'Film', 2),
(40, 'Pentru ce film a castigat Leonardo DiCaprio oscarul?', 'Film', 2),
(41, 'Ce sport a jucat Ilie nastase?', 'Sport', 1),
(42, 'Ce nationalitate are Ronaldo?', 'Sport', 1),
(43, 'Ce jucatoare a fost nr 1 mondial la tenis in 2018?', 'Sport', 1),
(44, 'Ce echipa a castigat campionatul Romaniei in sezonul 2017-2018?', 'Sport', 1),
(45, 'Cum a fost supranumit Ilie Balaci?', 'Sport ', 1),
(46, 'Pentru ce sport este cunoscut Horia Tecau?', 'Sport', 1),
(47, 'Pentru ce club a activat pentru prima data Banel Nicolita?', 'Sport ', 1),
(48, 'Ce jucatoare a fost desemnata cea mai buna handbalista a lumii in 2017?', 'Sport ', 1),
(49, 'Cine a infiintat echipa de fotbal FC Viitorul Constanta?', 'Sport ', 1),
(50, 'Ce roman are un record mondial in Skanderbeg?', 'Sport', 1),
(51, 'In ce an a castigat Cupa Campionilor echipa Steaua Bucuresti?', 'Sport', 2),
(52, 'Anul in care Romania a participat prima data la Campionatul Mondial de fotbal?', 'Sport', 2),
(53, 'Cate titluri a castigat Ilie Nastase?', 'Sport', 2),
(54, 'Pentru cate echipe a jucat Lionel Messi?', 'Sport ', 2),
(55, 'Ultima echipa pentru care a jucat Gheorghe Hagi', 'Sport ', 2),
(56, 'Ce este Campionatul National de Viteza in Coasta?', 'Sport ', 2),
(57, 'Pentru ce este cunoscut Leonard Doroftei?', 'Sport', 2),
(58, 'Cine este cel mai de succes marcator din istoria fotbalului?', 'Sport ', 2),
(59, 'In ce an s-a nascut Neymar?', 'Sport ', 2),
(60, 'Care din urmatorii nu este jucator de baschet?', 'Sport ', 2);

-- --------------------------------------------------------

--
-- Table structure for table `quizgame`
--

DROP TABLE IF EXISTS `quizgame`;
CREATE TABLE IF NOT EXISTS `quizgame` (
  `Username` varchar(20) COLLATE utf8mb4_romanian_ci NOT NULL,
  `Password` varchar(30) COLLATE utf8mb4_romanian_ci NOT NULL,
  `Nume` varchar(30) COLLATE utf8mb4_romanian_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_romanian_ci;

--
-- Dumping data for table `quizgame`
--

INSERT INTO `quizgame` (`Username`, `Password`, `Nume`) VALUES
('Mata', 'faracratima', 'Mama LuDragos');

-- --------------------------------------------------------

--
-- Table structure for table `raspunsuri`
--

DROP TABLE IF EXISTS `raspunsuri`;
CREATE TABLE IF NOT EXISTS `raspunsuri` (
  `raspuns_id` int(10) NOT NULL AUTO_INCREMENT,
  `raspuns` varchar(50) COLLATE utf8mb4_romanian_ci NOT NULL,
  `corect` tinyint(1) NOT NULL,
  `QFK` int(10) NOT NULL,
  UNIQUE KEY `raspuns_id` (`raspuns_id`)
) ENGINE=MyISAM AUTO_INCREMENT=241 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_romanian_ci;

--
-- Dumping data for table `raspunsuri`
--

INSERT INTO `raspunsuri` (`raspuns_id`, `raspuns`, `corect`, `QFK`) VALUES
(1, 'Juskel', 0, 1),
(2, 'Nile', 1, 1),
(3, 'Orange', 0, 1),
(4, 'Dunarea', 0, 1),
(5, 'Moldou', 0, 2),
(6, 'Neva', 1, 2),
(7, 'Sena', 0, 2),
(8, 'Volga', 0, 2),
(9, 'Cinci', 0, 3),
(10, 'Sapte', 1, 3),
(11, 'Opt', 0, 3),
(12, 'Sase', 0, 3),
(13, 'Skopje', 0, 4),
(14, 'Varna', 0, 4),
(15, 'Sofia', 1, 4),
(16, 'Belgrad', 0, 4),
(17, 'Elba', 1, 5),
(18, 'Volga', 0, 5),
(19, 'Dunarea', 0, 5),
(20, 'Rin', 0, 5),
(21, 'Cortina de fier', 1, 6),
(22, 'Marele Zid Chinezesc', 0, 6),
(23, 'Muntii Ural', 0, 6),
(24, 'Zidul Berlinului', 0, 6),
(25, 'Oslo', 1, 7),
(26, 'Copenhaga', 0, 7),
(27, 'Amsterdam', 0, 7),
(28, 'Moscova', 0, 7),
(29, 'Oceanul Arctic', 1, 8),
(30, 'Oceanul Nord Atlantic', 0, 8),
(31, 'Oceanul Caraibelor', 0, 8),
(32, 'Oceanul Indian', 0, 8),
(33, 'Austria', 0, 9),
(34, 'Australia', 1, 9),
(35, 'Belarus', 0, 9),
(36, 'Belgia', 0, 9),
(37, 'Africa', 0, 10),
(38, 'Aerica de Sud', 0, 10),
(39, 'Asia', 1, 10),
(40, 'Europa', 0, 10),
(41, 'Franta', 0, 11),
(42, 'Rusia', 0, 11),
(43, 'Grecia', 0, 11),
(44, 'Germania', 1, 11),
(45, 'Malta', 0, 12),
(46, 'Andora', 0, 12),
(47, 'Vatican', 1, 12),
(48, 'Spania', 0, 12),
(49, 'Oceanul Atlantic', 0, 13),
(50, 'Golful Mexic', 1, 13),
(51, 'Potomac', 0, 13),
(52, 'Cascada Niagara', 0, 13),
(53, 'Un oras din Italia', 0, 14),
(54, 'O insula din arhipelagul Canare', 1, 14),
(55, 'Capitala  Majorcai', 0, 14),
(56, 'O provincie spaniola', 0, 14),
(57, 'London Heathrow', 0, 15),
(58, 'Beijing Capital International', 0, 15),
(59, 'Hartsfiel-Jackson Atlanta International', 1, 15),
(60, 'Dubai International', 0, 15),
(61, 'Sydney', 0, 16),
(62, 'Melbourne', 0, 16),
(63, 'Canberra', 1, 16),
(64, 'Brisbane', 0, 16),
(65, 'Shropshire', 0, 17),
(66, 'Berskshire', 0, 17),
(67, 'Yorkshire', 0, 17),
(68, 'Kent', 1, 17),
(69, 'Antalya', 0, 18),
(70, 'Istambul', 0, 18),
(71, 'Bodrum', 0, 18),
(72, 'Ankara', 1, 18),
(73, 'Amazon', 0, 19),
(74, 'Nile', 1, 19),
(75, 'Dunarea', 0, 19),
(76, 'Mississippi', 0, 19),
(77, 'Salvador', 0, 20),
(78, 'Sao Paolo', 0, 20),
(79, 'Rio de Janeiro', 0, 20),
(80, 'Brasilia', 1, 20),
(81, '1999', 0, 21),
(82, '1990', 1, 21),
(83, '2005', 0, 21),
(84, '2014', 0, 21),
(85, '1980', 0, 22),
(86, '1999', 1, 22),
(87, '2011', 0, 22),
(88, '1994', 0, 22),
(89, 'Orc', 0, 23),
(90, 'Demon', 0, 23),
(91, 'Gollum', 1, 23),
(92, 'Om', 0, 23),
(93, 'Timisoara', 1, 24),
(94, 'New York', 0, 24),
(95, 'Bucuresti', 0, 24),
(96, 'Berlin', 0, 24),
(97, 'Tom Hardy', 0, 25),
(98, 'Al Pacino', 0, 25),
(99, 'Leonardo DiCaprio', 0, 25),
(100, 'Ryan Reynolds', 1, 25),
(101, 'Donnie Azoff', 0, 26),
(102, 'Brad', 0, 26),
(103, 'Jordan Befford', 1, 26),
(104, 'Mark Hanna', 0, 26),
(105, 'Ryan Reynolds', 0, 27),
(106, 'Tom Hardy', 1, 27),
(107, 'Malcom C.Murray', 0, 27),
(108, 'Robert Downey Jr.', 0, 27),
(109, 'Castigatorul ia tot', 0, 28),
(110, 'Spui tuturor despre Fight Club', 0, 28),
(111, 'Plangi acasa', 0, 28),
(112, 'Nu vorbesti despre Fight Club', 1, 28),
(113, 'Homecoming', 1, 29),
(114, 'Spider-Man 3', 0, 29),
(115, 'The Amazing Spider-Man', 0, 29),
(116, 'Spider-Man 4', 0, 29),
(117, 'Trinity', 0, 30),
(118, 'Agent Smith', 0, 30),
(119, 'Neo', 1, 30),
(120, 'Morpheus', 0, 30),
(121, '2000', 0, 31),
(122, '2001', 0, 31),
(123, '1999', 1, 31),
(124, '2002', 0, 31),
(125, 'Eminem', 0, 32),
(126, 'Dr.Dre', 0, 32),
(127, 'Silent Strike', 0, 32),
(128, 'Maroon 5', 0, 32),
(129, 'Victor Rebengiuc', 0, 33),
(130, 'Horatiu Malaele', 1, 33),
(131, 'Amza Pelea', 0, 33),
(132, 'Gheorghe DInica', 0, 33),
(133, '1994', 0, 34),
(134, '1998', 0, 34),
(135, '1990', 0, 34),
(136, '1993', 1, 34),
(137, '20 Mai 2011', 0, 35),
(138, '13 Feb 2011', 0, 35),
(139, '17 Apr 2011', 1, 35),
(140, '31 Ian 2012', 0, 35),
(141, 'Will', 1, 36),
(142, 'John Arryn', 0, 36),
(143, 'Viserys Targaryen', 0, 36),
(144, 'Benjen Stark', 0, 36),
(145, '4', 0, 37),
(146, '5', 0, 37),
(147, '6', 1, 37),
(148, '7', 0, 37),
(149, 'Band of Brothers', 0, 38),
(150, 'Game of Thrones', 1, 38),
(151, 'True Detective', 0, 38),
(152, 'The Walking Dead', 0, 38),
(153, '9', 1, 39),
(154, '10', 0, 39),
(155, '11', 0, 39),
(156, '12', 0, 39),
(157, 'The Wolf of Wall Street', 0, 40),
(158, 'Django Unchained', 0, 40),
(159, 'The Revenant', 0, 40),
(160, 'Titanic', 0, 40),
(161, 'Fotbal', 0, 41),
(162, 'Tenis', 1, 41),
(163, 'Nu a facut sport de performanta', 0, 41),
(164, 'Biliard', 0, 41),
(165, 'Portughez', 0, 42),
(166, 'Brazilian', 1, 42),
(167, 'Roman', 0, 42),
(168, 'Italian', 0, 42),
(169, 'Karolina Pliskova', 0, 43),
(170, 'Naomi Osaka', 0, 43),
(171, 'Simona Halep', 1, 43),
(172, 'Angelique Kerber', 0, 43),
(173, 'FCSB', 0, 44),
(174, 'Dinamo', 0, 44),
(175, 'CSU', 0, 44),
(176, 'CFR Cluj', 1, 44),
(177, 'Briliantul', 0, 45),
(178, 'Minunea blonda', 1, 45),
(179, 'Regele Balaci', 0, 45),
(180, 'Fiara', 0, 45),
(181, 'tenis de masa', 0, 46),
(182, 'fotbal', 0, 46),
(183, 'volei', 0, 46),
(184, 'tenis de camp', 1, 46),
(185, 'Dacia Unirea Braila', 1, 47),
(186, 'CS Faurei', 0, 47),
(187, 'Saint-Etienne', 0, 47),
(188, 'Steaua Bucuresti', 0, 47),
(189, 'Cristina Neagu', 1, 48),
(190, 'Nora Mork', 0, 48),
(191, 'Nycke Groot', 0, 48),
(192, 'Isabell Gullden', 0, 48),
(193, 'George Becali', 0, 49),
(194, 'Ioan Niculae', 0, 49),
(195, 'Gheorghe Hagi', 1, 49),
(196, 'Gruia Stoica', 0, 49),
(197, 'Radu Valahu', 0, 50),
(198, 'Sabin Badulescu', 0, 50),
(199, 'Devon Larrat', 0, 50),
(200, 'Ion Oncescu', 1, 50),
(201, '1986', 1, 51),
(202, '1987', 0, 51),
(203, '1985', 0, 51),
(204, '1988', 0, 51),
(205, '1920', 0, 52),
(206, '1930', 1, 52),
(207, '1934', 0, 52),
(208, '1940', 0, 52),
(209, '50', 0, 53),
(210, '40', 0, 53),
(211, '72', 0, 53),
(212, '58', 1, 53),
(213, '1', 1, 54),
(214, '2', 0, 54),
(215, '3', 0, 54),
(216, 'niciuna', 0, 54),
(217, 'Steaua Bucuresti', 0, 55),
(218, 'FC Viitorul Constanta', 0, 55),
(219, 'Galatasaray', 1, 55),
(220, 'Real Madrid', 0, 55),
(221, 'Maraton', 0, 56),
(222, 'Raliu', 0, 56),
(223, 'Pescuit Viteza', 0, 56),
(224, 'Ramura a automobilismului sportiv', 1, 56),
(225, 'Restaurantul sau', 0, 57),
(226, 'fost pugilist roman', 1, 57),
(227, 'fotbalist', 0, 57),
(228, 'maratonist', 0, 57),
(229, 'Cristiano Ronaldo', 0, 58),
(230, 'Ilie Balaci', 0, 58),
(231, 'Pele', 1, 58),
(232, 'Maradona', 0, 58),
(233, '1992', 1, 59),
(234, '1999', 0, 59),
(235, '1989', 0, 59),
(236, '1990', 0, 59),
(237, 'LeBron James', 0, 60),
(238, 'Michael Jordan ', 0, 60),
(239, 'Stephen Curry', 0, 60),
(240, 'Kevin Hart', 1, 60);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
