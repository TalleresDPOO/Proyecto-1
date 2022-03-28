package view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import modelo.Participante;
import procesador.Loader;

public class Consola {

	private Participante usuario;
	private Loader loader;
	
	public Consola(Participante usuario) {
		this.usuario = usuario;
				
	}
	
	private void mostrar_menu(){
		
		
	 	
	 System.out.println("Menu:");
	 System.out.println("__________________________________");
	 System.out.println("1-Crear_proyecto");
	 System.out.println("2-");
	 System.out.println("Menu:");
	 System.out.println("Menu:");
	 System.out.println("Menu:");
	 System.out.println("Menu:");
	 System.out.println("Menu:");
	 System.out.println("Menu:");
	 	
		
		
	}
	private void ejecutar_opciones(){
		
	Integer opcion = Integer.parseInt("Ingrese_una_opcion ");
	
	if (opcion == 1) {
	String nombre_usuario = input("Ingrese su nombre de usuario ");
	String correo_usuario = input("Ingrese su correo ");
	Boolean es_duenio = true;
	ArrayList actividades = new ArrayList<String>(); 
	
	this.usuario = new Participante(nombre_usuario, correo_usuario, es_duenio, actividades);
    System.out.println("Ingrese nombre del proyecto");
	
	
	}
	else if (opcion == 2){
		
	}
    else if (opcion == 3){
		
	}
    else if (opcion == 4){
		
	}  
    else if (opcion == 5){
		
	}
	
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

