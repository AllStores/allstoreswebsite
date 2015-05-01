create schema allstores;
GRANT ALL ON allstores.* TO allstores@localhost IDENTIFIED BY 'allstores';


SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `allstores`
--

-- --------------------------------------------------------

--
-- Table structure for table `stores_metadata`
--

CREATE TABLE IF NOT EXISTS allstores.stores_metadata (
  `merchant_id` int(10) NOT NULL AUTO_INCREMENT,
  `merchant_name` varchar(200) NOT NULL,
  `items_category` varchar(100) NOT NULL,
  `main_items` varchar(100) NOT NULL,
  `keywords` varchar(1000) NOT NULL,
  `store_address` varchar(1000) NOT NULL,
  `website_url` varchar(1000) NOT NULL,
  PRIMARY KEY (`merchant_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=30 ;


INSERT INTO allstores.stores_metadata (`merchant_id`, `merchant_name`, `items_category`, `main_items`, `keywords`, `store_address`, `website_url`) VALUES
(1, 'philip', 'abc', 'abc', 'abc', '560047', 'philip.com'),
(2, 'abraham', 'clothes', 't-shirts', 't-shirts', '560041', 'abraham.com'),
(3, 'Bruno', 'dogs food', 'dogs food', 'dogs food', '234567', 'Bruno.com'),
(4, 'Bob', 'Leather', 'leather', 'purse,belts', '560040', 'Bob.com'),
(5, 'Caroll', 'Beauty Products', 'lipstick', 'nail polish', '560011', 'Caroll.com'),
(6, 'Clark', 'Sports', 'bat', 'bat', '560012', 'Clark.com'),
(7, 'David', 'ship', 'ship', 'nets', '560013', 'David.com'),
(8, 'Darko', 'contractor', 'contractor', 'contractor', '560014', 'Darko.com'),
(9, 'Emily', 'women shoes', 'women shoes', 'shoes', '560015', 'Emily.com'),
(10, 'Eden', 'pickles', 'pickles', 'pickles', '560016', 'Eden.com'),
(11, 'Edward', 'music', 'flute', 'music', '560047', 'Edward.com'),
(12, 'Frankiestien', 'bikes', 'bikes', 'bikes', '560017', 'Frankiestien.com'),
(13, 'Frodo', 'costumes', 'costumes', 'costumes', '560018', 'Frodo.com'),
(14, 'George', 'guitar', 'guitar', 'guitar', '560019', 'George.com'),
(15, 'Gary', 'Kids Education', 'Kids Education', 'Kids Education', '560021', 'Gary.com'),
(16, 'Lustre', 'iphones', 'iphones', 'iphones', '560022', 'Lustre.com'),
(17, 'Deepak', 'plants', 'plants', 'plants', '560023', 'Deepak.com'),
(18, 'Hulk', 'power drinks', 'power drinks', 'power drinks', '560024', 'Hulk.com'),
(19, 'Henry', 'boots', 'boots', 'boots', '560025', 'Henry.com'),
(20, 'John', 'cars', 'cars', 'cars', '560040', 'John.com'),
(21, 'Jacob', 'Bikes accessories', 'Bikes accessories', 'Bikes accessories', '560042', 'Jacob.com'),
(22, 'james', 'kids', 'kids', 'kids', '560045', 'james.com'),
(23, 'Leo', 'astrology stuff', 'astrology stuff', 'astrology stuff', '560048', 'Leo.com'),
(24, 'Mary', 'cakes', 'cakes', 'cakes', '560050', 'Mary.com'),
(25, 'abc', 'abc', 'abc', 'abc', '560048', 'abctest.com'),
(26, 'philip1', 'abc', 'abc', 'abc', '560055', 'philip1.com'),
(27, 'philip2', 'abc', 'abc', 'abc', '560051', 'philip2.com'),
(28, 'philip3', 'abc', 'abc', 'abc', '560060', 'philip3.com'),
(29, 'philip4', 'abc', 'abc', 'abc', '560045', 'philip4.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
