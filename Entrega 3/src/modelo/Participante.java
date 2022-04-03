package modelo;
import java.util.ArrayList;

public class Participante {
	private String nombre;
	private String correo;
	private Boolean es_duenio;
	private ArrayList<Actividad> lista_actividades;
	
	public Participante(String nombre, String correo,
			Boolean es_duenio, ArrayList<Actividad> lista_actividades) {
		
		this.nombre = nombre;
		this.correo = correo;
		this.es_duenio = es_duenio;
		this.lista_actividades = lista_actividades;
		
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
	 * @param es_duenio the es_duenio to set
	 */
	public void setEs_duenio(Boolean es_duenio) {
		this.es_duenio = es_duenio;
	}

	/**
	 * @return the lista_actividades
	 */
	public ArrayList<Actividad> getLista_actividades() {
		return lista_actividades;
	}

	/**
	 * @param lista_actividades the lista_actividades to set
	 */
	public void setLista_actividades(ArrayList<Actividad> lista_actividades) {
		this.lista_actividades = lista_actividades;
	}
	
	
	private void registrar_actividad() {
		
		
	}
 	
	
	public void registrar_actividad(Actividad actividad) {
		
		this.lista_actividades.add(actividad);
		
	
				
	}
 
	private ArrayList<Reporte_de_actividades> reporte_actividades() {
		ArrayList<Reporte_de_actividades> lista_reportes = new ArrayList<Reporte_de_actividades>();
		for (int i=0;i<lista_actividades.size();i++) {
			Actividad actividad = lista_actividades.get(i);
			ArrayList registros = actividad.getRegistro_de_actividades();
			for (int j=0;i<registros.size();j++) {
				Registro_de_actividades registro = (Registro_de_actividades) registros.get(j);
						Reporte_de_actividades reporte = registro.getReporte_de_actividades();
						lista_reportes.add(reporte);
	    }
    
	
		}
		return lista_reportes;
	}
	
}
	

