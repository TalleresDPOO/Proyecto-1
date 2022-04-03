package modelo;
import java.util.ArrayList;
import java.util.HashMap;

public class Actividad {
	private String descripcion;
	private Registro_de_actividades ultimo_registro;
	private String titulo;
	private ArrayList<Registro_de_actividades> registro_de_actividades;
	private String tipo;
	
	public Actividad(String tipo, String descripcion,
			Registro_de_actividades ultimo_registro, String titulo, 
			ArrayList<Registro_de_actividades> registro_de_actividades ) {
	    
     this.tipo = tipo;
     this.descripcion = descripcion;
     this.ultimo_registro = ultimo_registro;
     this.titulo = titulo;
     this.registro_de_actividades = registro_de_actividades;
		
		
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the ultimo_registro
	 */
	public Registro_de_actividades getUltimo_registro() {
		return ultimo_registro;
	}
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * @return the registro_de_actividades
	 */
	public ArrayList<Registro_de_actividades> getRegistro_de_actividades() {
		return registro_de_actividades;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


