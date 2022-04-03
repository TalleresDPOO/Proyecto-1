package modelo;

public class Registro_de_actividades {

	private String hora_inicio;
	private String hora_finalizacion;
	private Participante participante;
	private String fecha; 
	
	
	public Registro_de_actividades (String hora_inicio, String hora_finalizacion,
			Participante participante, String fecha) {
		
    this.hora_inicio = hora_inicio;
    this.hora_finalizacion = hora_finalizacion;
	this.participante = participante;
	this.fecha = fecha;
	}


	/**
	 * @return the hora_inicio
	 */
	public String getHora_inicio() {
		return hora_inicio;
	}


	/**
	 * @return the hora_finalizacion
	 */
	public String getHora_finalizacion() {
		return hora_finalizacion;
	}


	/**
	 * @return the participante
	 */
	public Participante getParticipante() {
		return participante;
	}


	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	
	private void cambiar_hora(String hora_nueva_inicio, String hora_nueva_finalizacion) {
		this.hora_inicio = hora_nueva_inicio;
		this.hora_finalizacion = hora_nueva_finalizacion;
		
	}
	private void cambiar_fecha(String fecha_nueva) {
		this.fecha = fecha_nueva;
	}
	private void añadir_participante(Participante p_nuevo) {
		this.participante = p_nuevo;
	}
}
