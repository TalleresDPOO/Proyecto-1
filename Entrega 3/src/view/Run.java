package view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import modelo.Participante;


public class Run {
	
	
    static public void main(String[] args){
    	
    	String nombre_usuario = input("Ingrese su nombre de usuario ");
		String correo_usuario = input("Ingrese su correo ");
		Boolean es_duenio = true;
		ArrayList actividades = new ArrayList<String>();
	    Participante usuario = new Participante(nombre_usuario, correo_usuario, es_duenio, actividades);
    	Consola consola = new Consola(usuario);
    	consola.ejecutar_aplicacion();
    	consola.mostrar_menu();
    	consola.ejecutar_opciones();
	}
    static private String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
			
			}
		return null;
		}
}