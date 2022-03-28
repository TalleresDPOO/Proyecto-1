package modelo;

public class Registro_de_actividades {

	private String hora_inicio;
	private String hora_finalizacion;
	private Participante participante;
	private String fecha;
	private Reporte_de_actividades reporte_de_actividades; 
	
	
	public Registro_de_actividades (String hora_inicio, String hora_finalizacion,
			Participante participante, String fecha, Reporte_de_actividades reporte_de_actividades) {
		
    this.hora_inicio = hora_inicio;
    this.hora_finalizacion = hora_finalizacion;
	this.participante = participante;
	this.fecha = fecha;
	this.reporte_de_actividades = reporte_de_actividades;
	}


	/**
	 * @return the hora_inicio
	 */
	public String getHora_inicio() {
		return hora_inicio;
	}


	/**
	 * @param hora_inicio the hora_inicio to set
	 */
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}


	/**
	 * @return the hora_finalizacion
	 */
	public String getHora_finalizacion() {
		return hora_finalizacion;
	}


	/**
	 * @param hora_finalizacion the hora_finalizacion to set
	 */
	public void setHora_finalizacion(String hora_finalizacion) {
		this.hora_finalizacion = hora_finalizacion;
	}


	/**
	 * @return the participante
	 */
	public Participante getParticipante() {
		return participante;
	}


	/**
	 * @param participante the participante to set
	 */
	public void setParticipante(Participante participante) {
		this.participante = participante;
	}


	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	/**
	 * @return the reporte_de_actividades
	 */
	public Reporte_de_actividades getReporte_de_actividades() {
		return reporte_de_actividades;
	}


	/**
	 * @param reporte_de_actividades the reporte_de_actividades to set
	 */
	public void setReporte_de_actividades(Reporte_de_actividades reporte_de_actividades) {
		this.reporte_de_actividades = reporte_de_actividades;
	}
	
	private void cambiar_hora(String hora_nueva) {
		
	}
}
