package Validadores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value="validadorDeCPF")
public class ValidadorDeCPF implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
		String cpf = value.toString().replaceAll("[^0-9]", "");
		if(cpf.length()==11){
			int dv1 = Integer.parseInt(cpf.charAt(9)+ "");
			int dv2 = Integer.parseInt(cpf.charAt(10)+ "");
			
			int contador = 10;
			int soma = 0;
			
			for (int x = 0; x <9 ; x++){
				soma += contador = (Integer.parseInt(cpf.charAt(x)+ ""));
				contador --;				
			}
			int verificador = soma % 11;
			if (verificador < 2) verificador = 0;
			else verificador = 11 - verificador;
			
			if (dv1 !=  verificador){
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "", ""));
			}
			// validadndo dv2
			
			contador = 11;
			soma = 0;
			
			for (int x = 0; x<10; x++){
				soma += contador = (Integer.parseInt(cpf.charAt(x)+ ""));
				contador --;				
			}
			 verificador = soma % 11;
			if (verificador < 2) verificador = 1;
			else verificador = 11 - verificador;
			
			if (dv2 !=  verificador){
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "", ""));
			}
		}
		
	}

}
