Algoritmo PromedioTemperaturas
	
	Escribir "Ingrese pares de temperatura hasta que ingrese 0 en la primera temperatura";
	Escribir "De las temeperaturas que hay ingresado y se encuentren entre 5 y 15 grados se hallara el promedio"
	
	Prom = 0;
	contador = 0;
	
	Repetir
		Escribir "Ingrese temperatura 1"
		Leer t1;
		Escribir "Ingrese temperatura 2"
		Leer  t2;
		Si t1 >= 5 & t1<= 15 Entonces
			Prom = Prom + t1;
			contador = contador+1;
		Fin Si
		Si t2 >= 5 & t2<= 15 Entonces
			Prom = Prom + t2;
			contador = contador+1;
		Fin Si
		
	Hasta Que t1 == 0
	
	Prom = Prom/contador;
	
	Escribir "El promedio de las temperaturas entre 5 y 15 grados que se hayan ingresado es ", Prom
	
FinAlgoritmo
