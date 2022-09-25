-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.24-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para prueba
CREATE DATABASE IF NOT EXISTS `prueba` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `prueba`;

-- Volcando estructura para tabla prueba.departamentos
CREATE TABLE IF NOT EXISTS `departamentos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cod_depto` int(11) NOT NULL,
  `nombre_depto` varchar(50) NOT NULL,
  `fecha_hora_crea` datetime NOT NULL,
  `fecha_hora_mod` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla prueba.departamentos: ~31 rows (aproximadamente)
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` (`id`, `cod_depto`, `nombre_depto`, `fecha_hora_crea`, `fecha_hora_mod`) VALUES
	(2, 2, 'Antioquia', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(3, 3, 'Arauca', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(4, 4, 'Atlántico', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(5, 5, 'Bolívar', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(6, 6, 'Boyacá', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(7, 7, 'Caldas', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(8, 8, 'Caquetá', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(9, 9, 'Casanare', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(10, 10, 'Cauca', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(11, 11, 'Cesar', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(12, 12, 'Chocó', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(13, 13, 'Córdoba', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(14, 14, 'Cundinamarca', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(15, 15, 'Guainía', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(16, 16, 'Guaviare', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(17, 17, 'Huila', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(18, 18, 'La Guajira', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(19, 19, 'Magdalena', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(20, 20, 'Meta', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(21, 21, 'Nariño', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(22, 22, 'Norte de Santander', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(23, 23, 'Putumayo', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(24, 24, 'Quindío', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(25, 25, 'Risaralda', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(26, 26, 'San Andrés y Providencia', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(27, 27, 'Santander', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(28, 28, 'Sucre', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(29, 29, 'Tolima', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(30, 30, 'Valle del Cauca', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(31, 31, 'Vaupés', '2022-09-22 06:04:55', '2022-09-22 06:04:55'),
	(32, 32, 'Vichada', '2022-09-22 06:04:55', '2022-09-22 06:04:55');
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;

-- Volcando estructura para tabla prueba.empleados
CREATE TABLE IF NOT EXISTS `empleados` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doc_tipo` varchar(50) NOT NULL,
  `doc_numero` int(20) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `depto_id` int(11) NOT NULL,
  `ciudad` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` int(11) NOT NULL,
  `fecha_hora_crea` datetime NOT NULL,
  `fecha_hora_mod` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__departamentos` (`depto_id`),
  CONSTRAINT `FK__departamentos` FOREIGN KEY (`depto_id`) REFERENCES `departamentos` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla prueba.empleados: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` (`id`, `doc_tipo`, `doc_numero`, `nombres`, `apellidos`, `depto_id`, `ciudad`, `direccion`, `correo`, `telefono`, `fecha_hora_crea`, `fecha_hora_mod`) VALUES
	(1, 'cc', 1116277802, 'brayan steven', 'gomez', 30, 'tulua', 'carrera 11 # 14a-51', 'brayanstevengomezrivera@gmail.com', 2147483647, '2022-09-22 18:09:17', '2022-09-22 18:09:19');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
