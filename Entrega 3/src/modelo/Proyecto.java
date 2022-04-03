package modelo;
import java.util.ArrayList;
import java.util.HashMap;

public class Proyecto {
	
	public String nombre;
	private String descripcion;
	private String fecha_de_inicio;
	private String fecha_de_finalizacion;
	private ArrayList<Participante> participantes;
	private ArrayList<String> tipos_de_actividades;
	private HashMap <String, ArrayList<Actividad>> actividades;

	
	public Proyecto (String nombre, String descripcion, String fecha_de_inicio,
			String fecha_de_finalizacion, ArrayList<Participante> participantes,
			ArrayList<String> tipos_de_actividades,
			HashMap <String, ArrayList<Actividad>> actividades) {
		
	
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.fecha_de_inicio = fecha_de_inicio;
	this.fecha_de_finalizacion = fecha_de_finalizacion;
	this.participantes = participantes;
	this.tipos_de_actividades = tipos_de_actividades;
	this.actividades = actividades;
	
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
	 * @return the fecha_de_inicio
	 */
	public String getFecha_de_inicio() {
		return fecha_de_inicio;
	}


	/**
	 * @param fecha_de_inicio the fecha_de_inicio to set
	 */
	public void setFecha_de_inicio(String fecha_de_inicio) {
		this.fecha_de_inicio = fecha_de_inicio;
	}


	/**
	 * @return the fecha_de_finalizacion
	 */
	public String getFecha_de_finalizacion() {
		return fecha_de_finalizacion;
	}


	/**
	 * @param fecha_de_finalizacion the fecha_de_finalizacion to set
	 */
	public void setFecha_de_finalizacion(String fecha_de_finalizacion) {
		this.fecha_de_finalizacion = fecha_de_finalizacion;
	}


	/**
	 * @return the participantes
	 */
	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}


	/**
	 * @param participantes the participantes to set
	 */
	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}


	/**
	 * @return the tipos_de_actividades
	 */
	public ArrayList<String> getTipos_de_actividades() {
		return tipos_de_actividades;
	}


	/**
	 * @param tipos_de_actividades the tipos_de_actividades to set
	 */
	public void setTipos_de_actividades(ArrayList<String> tipos_de_actividades) {
		this.tipos_de_actividades = tipos_de_actividades;
	}


	/**
	 * @return the actividades
	 */
	public HashMap<String, ArrayList<Actividad>> getActividades() {
		return actividades;
	}


	/**
	 * @param actividades the actividades to set
	 */
	public void setActividades(HashMap<String, ArrayList<Actividad>> actividades) {
		this.actividades = actividades;
	}
	
	
	private void aniadir_participante(String nombre, String correo, Boolean es_duenio) {
	    ArrayList<Actividad> lista_actividades = new ArrayList<Actividad>();
		Participante participante = new Participante(nombre,correo, es_duenio,lista_actividades);
		
		this.participantes.add(participante);
	}
}
	    

