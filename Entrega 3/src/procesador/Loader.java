package procesador;
import modelo.Participante;
import modelo.Actividad;
import modelo.Proyecto;
import modelo.Registro_de_actividades;
import modelo.Reporte_de_actividades;

import java.util.ArrayList;
import java.util.HashMap;


public class Loader {
	
	HashMap proyectos = new HashMap<String, Proyecto>();
	

	public Loader() {
		
	}
	public void crear_proyecto(String nombre, String descripcion, String fecha_de_inicio,
			String fecha_de_finalizacion, ArrayList<Participante> participantes,
			ArrayList<String> tipos_de_actividades,
			HashMap <String, ArrayList<Actividad>> actividades) {
		
	}
	
	public void registrar_actividad(String hora_inicio, String hora_finzalizacion, String fecha, Participante participante) {
		
	}
	
	public void modificar_fecha(Actividad actividad, String fecha) {
		
	}
	
	public void modificar_hora(Actividad actividad, String hora) {
		
		
	}
	public void aniadir_participante(String nombre_proyecto, String nombre_participante, String correo_participante) {
		Proyecto proyecto = (Proyecto) this.proyectos.get(nombre_proyecto);
		proyecto.aniadir_participante(nombre_participante,correo_participante, false);
		
	}
	public void reporte_actividades() {
		
	}
	
	public void cronometrar_actividad() {
		
	}
}

