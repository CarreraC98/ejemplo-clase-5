package com.educacionit.modulos;

public class Principal {

	public static void main(String[] args) {
	System.out.println("hola mundo con java");
//comentario de una linea
	/*comentario
	 * de 
	 * varias 
	 * lineas
	 * variables sintaxis
	 * 1- declarar
	 * tipo_de_dato identificador;
	 * 2- inicializador
	 * identificador = valor;
	 * tambion 1 y 2
	 * tipo_de_dato identificador = valor
	 */
	byte edad;//declarando
	edad = 15;//inicializando
	short stock = 5800;
	int dni = 12345678;
	System.out.println(edad);
	edad = 30;
	System.out.println(edad);
	//DECIMALES
	double precio = 25.45;
	float dato = 4.6f;
	boolean result = true; 
	char letra = 'A'; // comillas simpre simples
	String nombre = "Carlos";//siempre dentro de comillas dobles
	System.out.println(nombre);
	//Concatenamos
	System.out.println(" mi nombre es " + nombre + "y mi edad es " + edad);
	System.out.println(edad + " " + dni);
	//operadores aritmeticos + - * / %(modulo)
	System.out.println(2 + 2);
	int a = 46;
	int b = 50;
	System.out.println(a + b);
	int resta = a - b - 2;
	System.out.println(resta);
	System.out.println(9 % 2);
	a++;//a= a + 1;
	System.out.println(a);
	a--;//a= a - 1;
	System.out.println(a);
	b += 50;//b = b + 50;
	System.out.println(b);
	//operadores de comparacion < > <= >= == != !
	System.out.println(a < b);
	System.out.println(!result);
	System.out.println(a == b);
	//operadores logicos &&(and) ||(or)
	/*
	 * TRUE && TRUE = TRUE
	 * TRUE && FALSE = FALSE
	 * FALSE && TRUE = FALSE
	 * FALSE && FALSE = FALSE
	 * 
	 * FALSE || FALSE = FALSE
	 * TRUE || FALSE = TRUE
	 * FALSE || TRUE = TRUE
	 * TRUE || TRUE = TRUE
	 */
	boolean X = true;
	boolean Z = false;
	System.out.println(X || Z);
	}

}
