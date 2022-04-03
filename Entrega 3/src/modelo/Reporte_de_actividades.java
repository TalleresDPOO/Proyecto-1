package modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;  

public class Reporte_de_actividades {
	private long tiempo_total;
	private int tiempo_promedio;
	private int tiempo_por_dia;
	
	public static long calcular_tiempo_total(Participante participante) throws ParseException {
		ArrayList<Actividad> lista = participante.getLista_actividades();
		long tiempo_total = 0;
		for (int i = 0; i<lista.size(); i++) {
			Actividad actividad = lista.get(i);
			ArrayList<Registro_de_actividades> lista_registros = actividad.getRegistro_de_actividades();		
			for (int j = 0; j<lista_registros.size(); j++) {
				Registro_de_actividades registro_actual = lista_registros.get(j);
				
				SimpleDateFormat formateador1 = new SimpleDateFormat("h:mm a");
				Date hora1 = formateador1.parse(registro_actual.getHora_inicio());
						
				SimpleDateFormat formateador2 = new SimpleDateFormat("h:mm a");
				Date hora2 = formateador2.parse(registro_actual.getHora_finalizacion());
				
				SimpleDateFormat formateador3 = new SimpleDateFormat("dd/MM/yyyy");
				Date fecha_x = formateador3.parse(registro_actual.getFecha());
				
				long h1 = hora1.getTime();
				long h2 = hora2.getTime();
				long f_x = fecha_x.getTime();
				tiempo_total = tiempo_total + (h1+h2+f_x);
				
			}
		}
		
		return tiempo_total/1000;
	}
	public void reporte_de_actividades(Participante participante,int tiempo_total,int tiempo_promedio, int tiempo_por_dia) throws ParseException{
		this.tiempo_total = calcular_tiempo_total(participante);
	}
}
