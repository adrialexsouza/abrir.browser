package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.Metodos;

public class FormTest {
	
Metodos metodos = new Metodos();
@Dado("Que eu esteja no formulario")
public void que_eu_esteja_no_formulario() {
	metodos.abrirBrowser("file:///C:/Users/Rafael/Desktop/semana%20Piramide%20de%20teste/index.html");
    
}

@Quando("Eu preencher e enviar o formulario")
public void eu_preencher_e_enviar_o_formulario() {
    
}

@Entao("Sou direcionado para o site da escola")
public void sou_direcionado_para_o_site_da_escola() {
    
}

}
