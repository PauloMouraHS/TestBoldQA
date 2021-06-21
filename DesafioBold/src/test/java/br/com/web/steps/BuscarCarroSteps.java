package br.com.web.steps;

import br.com.web.pages.BuscarCarroPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscarCarroSteps {

	private BuscarCarroPage page = new BuscarCarroPage();

	@Dado("^que um usuario acesse o site webmotors$")
	public void  queUmUsuarioAcesseOSiteWebmotors() throws Throwable {
		page.acessarSite();
	}

	@Quando("^realizar a busca de um novo carro$")
	public void realizarABuscaDeUmNovoCarro() throws Throwable {
		page.buscarMarca();
	}
	
	
	@Entao("^a lista de carros solicitados sera aberta$")
	public void aListaDeCarrosSolicitadosSeraAberta() throws Throwable {
		page.validarMarca();
		page.validarModelo();
		page.validarVersao();
		
	}
}