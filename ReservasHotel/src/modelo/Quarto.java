package modelo;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Quarto
 *
 */
@Entity

public class Quarto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String numero;
	private Collection<Diaria> diarias;
	private TipoQuarto tipoQuarto;

	public Quarto() {
		super();
	}   
	@Id    
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	@OneToMany(mappedBy="quarto")
	public Collection<Diaria> getDiarias() {
		return diarias;
	}
	public void setDiarias(Collection<Diaria> diarias) {
		this.diarias = diarias;
	}
	@Enumerated
	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}
	public void setTipoQuarto(TipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	
	
   
}
