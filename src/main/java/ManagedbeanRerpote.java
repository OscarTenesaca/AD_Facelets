import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean (name = "reporte")
@RequestScoped

public class ManagedbeanRerpote {
	
	private String titulo = "llego managed";
	
	
	

public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



public String confirmarAccion() {

	
	
	return "reporte";
}

public String consultar() {

	return "reporte";
	
}	
	


public String consultar1() {

	
	
	return "indexPrueba";
}	





}
