package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean (name= "meuPrimeiroBean")
public class MeuPrimeiroBean {

	private String Ol� = "Ol� <b>amigos</b>";
    private boolean exibir = true;
	
	public String getOl�() {
		return Ol�;
	}

	public boolean isExibir() {
		return exibir;
	}

	public void setExibir(boolean exibir) {
		this.exibir = exibir;
	}
	
	
	
	
}
