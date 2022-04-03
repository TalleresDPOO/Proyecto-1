package modelo;
import java.util.ArrayList;

public class Participante {
	private String nombre;
	private String correo;
	private Boolean es_duenio;
	private ArrayList<Actividad> lista_actividades;
	private Reporte_de_actividades reporte_de_actividades;
	
	public Participante(String nombre, String correo,
			Boolean es_duenio, ArrayList<Actividad> lista_actividades, Reporte_de_actividades reporte_de_actividades) {
		
		this.nombre = nombre;
		this.correo = correo;
		this.es_duenio = es_duenio;
		this.lista_actividades = lista_actividades;
		this.reporte_de_actividades = reporte_de_actividades;
		
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the es_duenio
	 */
	public Boolean getEs_duenio() {
		return es_duenio;
	}


	/**
	 * @return the lista_actividades
	 */
	public ArrayList<Actividad> getLista_actividades() {
		return lista_actividades;
	}
	
	/**
	 * @return the Reporte_de_actividades
	 */
	public ArrayList<Actividad> getReporte_de_actividades() {
		return lista_actividades;
	}

 	
	
	public void registrar_actividad(Actividad actividad) {
		
		this.lista_actividades.add(actividad);
		
	
				
	}
 
	
}
	

