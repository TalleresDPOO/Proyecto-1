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
	 * @param ultimo_registro the ultimo_registro to set
	 */
	public void setUltimo_registro(Registro_de_actividades ultimo_registro) {
		this.ultimo_registro = ultimo_registro;
	}

	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	/**
	 * @return the registro_de_actividades
	 */
	public ArrayList<Registro_de_actividades> getRegistro_de_actividades() {
		return registro_de_actividades;
	}

	/**
	 * @param registro_de_actividades the registro_de_actividades to set
	 */
	public void setRegistro_de_actividades(ArrayList<Registro_de_actividades> registro_de_actividades) {
		this.registro_de_actividades = registro_de_actividades;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
