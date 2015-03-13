package modelo;

public enum Sexo {
  M("Masculino"), F("Femenino");
  
  private String nome;
  
  private Sexo (String nome){
	  this.nome = nome;
  }
  public String getNome(){
	  return nome;
  }
}
