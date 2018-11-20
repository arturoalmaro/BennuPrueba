-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 20-11-2018 a las 08:08:35
-- Versión del servidor: 5.7.24
-- Versión de PHP: 7.1.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bennudb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(12) NOT NULL,
  `apellido` varchar(12) NOT NULL,
  `fecha_nac` date NOT NULL,
  `id_colegio` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id`, `nombre`, `apellido`, `fecha_nac`, `id_colegio`) VALUES
(1, 'Stephanie', 'Pinero', '1992-05-27', 3),
(2, 'Fabiola', 'Garzaro', '1996-09-16', 2),
(3, 'Livia', 'Almaro', '1998-06-02', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE `asignatura` (
  `id` int(11) NOT NULL,
  `nombre` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`id`, `nombre`) VALUES
(1, 'Matemática'),
(2, 'Química'),
(3, 'Física'),
(4, 'Biología'),
(5, 'Lenguaje'),
(6, 'Historia'),
(7, 'Geografía'),
(8, 'Inglés'),
(9, 'Deporte');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colegio`
--

CREATE TABLE `colegio` (
  `id` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `ubicacion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `colegio`
--

INSERT INTO `colegio` (`id`, `nombre`, `ubicacion`) VALUES
(1, 'Nuestra Senora del Carmen', 'Avenida Roosevelt, Caracas, Venezuela'),
(2, 'Juan XXIII', 'Calle Campo Elias, Los Teques,Venezuela'),
(3, 'Araguaney', 'Punto Fijo, Falcon, Venezuela'),
(4, 'Nuestra Senora del Carmen', 'Avenida Roosevelt, Caracas, Venezuela'),
(5, 'Juan XXIII', 'Calle Campo Elias, Los Teques,Venezuela'),
(6, 'Araguaney', 'Punto Fijo, Falcon, Venezuela'),
(7, 'test4', 'test4'),
(8, 'test1', 'test1'),
(9, 'algo', 'algo'),
(10, 'test', 'test'),
(11, 'test2', 'test2'),
(12, 'test3', 'test3'),
(13, 'test', 'test'),
(14, 'test2', 'test'),
(15, 'test', 'testtest');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nota`
--

CREATE TABLE `nota` (
  `id` int(11) NOT NULL,
  `nota` int(1) NOT NULL,
  `id_alumno` int(4) NOT NULL,
  `id_asignatura` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `nota`
--

INSERT INTO `nota` (`id`, `nota`, `id_alumno`, `id_asignatura`) VALUES
(1, 7, 1, 7),
(2, 5, 2, 7),
(3, 9, 2, 6),
(4, 5, 1, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `id` int(11) NOT NULL,
  `nombre` varchar(12) NOT NULL,
  `apellido` varchar(12) NOT NULL,
  `fecha_nac` date NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `id_colegio` int(2) NOT NULL,
  `id_asignatura` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `profesores`
--

INSERT INTO `profesores` (`id`, `nombre`, `apellido`, `fecha_nac`, `activo`, `id_colegio`, `id_asignatura`) VALUES
(1, 'Alejandra', 'Guzman', '2018-11-06', 1, 6, 9),
(2, 'Rodolfo', 'Perez', '2018-11-11', 0, 4, 5),
(3, 'Arnaldo', 'Subijana', '2018-11-13', 0, 2, 7),
(4, 'Benito', 'Garcia', '2018-11-07', 0, 7, 7),
(5, 'Alejandro', 'Garcia', '2018-11-07', 1, 2, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `colegio_alumnos_fk` (`id_colegio`);

--
-- Indices de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `colegio`
--
ALTER TABLE `colegio`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `nota`
--
ALTER TABLE `nota`
  ADD PRIMARY KEY (`id`),
  ADD KEY `asignatura_nota_fk` (`id_asignatura`),
  ADD KEY `id_alumno` (`id_alumno`);

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`id`),
  ADD KEY `asignatura_profesores_fk` (`id_asignatura`),
  ADD KEY `colegio_profesores_fk` (`id_colegio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `colegio`
--
ALTER TABLE `colegio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `nota`
--
ALTER TABLE `nota`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `profesores`
--
ALTER TABLE `profesores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD CONSTRAINT `colegio_alumnos_fk` FOREIGN KEY (`id_colegio`) REFERENCES `colegio` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `nota`
--
ALTER TABLE `nota`
  ADD CONSTRAINT `asignatura_nota_fk` FOREIGN KEY (`id_asignatura`) REFERENCES `asignatura` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_alumno` FOREIGN KEY (`id_alumno`) REFERENCES `alumnos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD CONSTRAINT `asignatura_profesores_fk` FOREIGN KEY (`id_asignatura`) REFERENCES `asignatura` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `colegio_profesores_fk` FOREIGN KEY (`id_colegio`) REFERENCES `colegio` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
