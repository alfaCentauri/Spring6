/**
 * Ejemplo del framework Spring con Java 11. Utilizando anotaciones con ejecución de código antes de la 
 * creación del bean y después de su creación.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
module Spring6 {
	exports DemoAnotaciones;
	requires spring.core;
	requires spring.context;
	requires spring.beans;
	requires java.base;
	requires java.annotation;
}