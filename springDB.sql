-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 14 Agu 2019 pada 09.12
-- Versi server: 10.3.16-MariaDB
-- Versi PHP: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springDB`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(6);

-- --------------------------------------------------------

--
-- Struktur dari tabel `menu_master`
--

CREATE TABLE `menu_master` (
  `menu_id` int(4) NOT NULL,
  `menu_name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `menu_master`
--

INSERT INTO `menu_master` (`menu_id`, `menu_name`) VALUES
(1, 'PromoCard'),
(2, 'CategoryCard'),
(3, 'FlashSaleCard'),
(4, 'HistoryCard'),
(5, 'NewsCard');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user_master`
--

CREATE TABLE `user_master` (
  `user_id` int(4) NOT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `user_tipe` varchar(10) DEFAULT NULL,
  `user_value` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `user_master`
--

INSERT INTO `user_master` (`user_id`, `user_name`, `user_tipe`, `user_value`) VALUES
(1, 'Alex Pratama Wibowo', '12345', 100),
(2, 'Robby Tristianto', '13524', 90),
(3, 'Icha', '14235', 250);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `menu_master`
--
ALTER TABLE `menu_master`
  ADD PRIMARY KEY (`menu_id`);

--
-- Indeks untuk tabel `user_master`
--
ALTER TABLE `user_master`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `menu_master`
--
ALTER TABLE `menu_master`
  MODIFY `menu_id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `user_master`
--
ALTER TABLE `user_master`
  MODIFY `user_id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
