


-- Profesores ordenados por nombre

SELECT * FROM profesores ORDER BY nombre


-- Los alumnos con nota roja

SELECT a.nombre, a.apellido ,AVG(n.nota) AS promedio 
FROM alumnos a 
JOIN nota n 
ON n.id_alumno = a.id 
JOIN asignatura aa 
ON aa.id = n.id_asignatura 
GROUP BY a.nombre, a.apellido 
HAVING promedio > 5


-- Alumnos con mejor nota por asignatura



SELECT top 1 a.nombre, a.apellido, MAX(n.nota) 
FROM alumnos a
JOIN nota n
ON n.id_alumno = a.id 
JOIN asignatura aa
ON aa.id = n.id_asignatura 
GROUP BY a.nombre, a.apellido 