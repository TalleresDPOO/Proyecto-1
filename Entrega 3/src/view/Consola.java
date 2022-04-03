package view;
import java.io.BufferedReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;

import modelo.Participante;
import procesador.Loader;
import modelo.Actividad;

public class Consola {

	private Participante usuario;
	
	static public void main(String[] args){
		
	}
	
	public Consola(Participante usuario) {
		this.usuario = usuario;
				
	}
	
	public void ejecutar_aplicacion() {
		
	}

	
	public void mostrar_menu(){
		
		
	 	
	 System.out.println("Menu:");
	 System.out.println("__________________________________");
	 System.out.println("1-Crear_proyecto");
	 System.out.println("2-Agregar participante a proyecto");
	 System.out.println("3-Registrar actividad con hora y fecha actual");
	 System.out.println("4-Registrar actividad con fecha y hora modificada");
	 System.out.println("5-Cronometrar una actividad");
	 System.out.println("6-Mostrar reporte de actividades");
	 	
		  
		
	}
	public void ejecutar_opciones(){
		
	String opcion_string = input("Ingrese_una_opcion ");
	Integer opcion = Integer.parseInt(opcion_string);
	
	if (opcion == 1) {
	    opcion1();	
	}
	else if (opcion == 2){
		opcion2();
		
	}
    else if (opcion == 3){
		
	}
    else if (opcion == 4){
		
	}  
    else if (opcion == 5){
		
	}
	
	}
		
	private void opcion1(){
        
		ArrayList participantes = new ArrayList<Participante>();
		participantes.add(this.usuario);
		String nombre_proyecto = input("Ingrese el nombre del proyecto "); 
		String descripcion = input("Ingrese una descripcion para su proyecto");
		String tipos_de_actividades_string = input("Ingrese los tipos de actividades que va a tener su proyecto separados por comas ','");
		String[] tipos_de_actividades_array = tipos_de_actividades_string.split(",");
		ArrayList tipos_de_actividades = new ArrayList<String>();
		for (int i = 0; i< tipos_de_actividades_array.length; i++) {
			tipos_de_actividades.add(tipos_de_actividades_array[i]);		
		}
		HashMap actividades = new HashMap<String, ArrayList<Actividad>>();
		for (int i = 0; i< tipos_de_actividades_array.length; i++) {
			actividades.put(tipos_de_actividades_array[i], new ArrayList<Actividad>());
			
		}
		
		String fecha_inicio = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		String fecha_estimada_de_finalizacion = input("Ingrese una fecha estimada de finalizacion si la conoce en formato yyyy/MM/dd ");
		
        Loader loader = new Loader(); 
	    loader.crear_proyecto(nombre_proyecto, descripcion, fecha_inicio , fecha_estimada_de_finalizacion, participantes,
	    		tipos_de_actividades, actividades);
	    	    
	
	}


	 private void opcion2() {
		String nombre_proyecto = input("Ingrese el nombre de el proyecto al que quiere añadir un participante");
		String nombre_participante = 
				
		
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

