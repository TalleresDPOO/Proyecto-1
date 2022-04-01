package procesador;
import java.io.BufferedReader;
import procesador.Loader;

public class Archivo {
	
	private String archivo_texto_plano;
	
	public Archivo(String archivo_texto_plano){
		this.archivo_texto_plano = archivo_texto_plano;
		
	}
	
	public void crear_proyecto() {
		
	}
	
	public void modificar_fecha_actividad() {
		
	}
	
	public void modificar_hora_actividad() {
		
	}

	public String getArchivo_texto_plano() {
		return archivo_texto_plano;
	}

	public void setArchivo_texto_plano(String archivo_texto_plano) {
		this.archivo_texto_plano = archivo_texto_plano;
	}

}
