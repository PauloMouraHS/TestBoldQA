package br.com.web.pages;

import static br.com.web.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.web.core.BasePage;

public class BuscarCarroPage extends BasePage {

	// Elementos Web

	By aceitarCookies = By.xpath("//button[@class='sc-htoDjs gtMZoW']");
	By pesquisar = By.xpath("//a[@class='Button Button--red-home']");
	By marca = By.xpath("//a[@title='honda']");
	By clicarModelo = By.xpath("//div[@class = 'Filters__line Filters__line--gray Filters__line--icon Filters__line--icon--right']");
	By modelo = By.xpath("//*[@href=\"https://www.webmotors.com.br/carros/estoque/honda/city\"]");
	By clicarVersao = By.xpath("//div[@class='Filters__line Filters__line--icon Filters__line--icon Filters__line--icon--right Filters__line--gray']");
	By versao = By.xpath("//*[@href='https://www.webmotors.com.br/carros/estoque/honda/city/15-dx-16v-flex-4p-automatico']");
	By honda = By.xpath("//span[contains(@itemprop,'name') and text()='Honda']");
	By city = By.xpath("//span[contains(@itemprop,'name') and text()='City']");
	By vAuto = By.id("honda-city-1.5-dx-16v-flex-4p-automatico");
		
	
	public void acessarSite() throws Exception {
		getDriver().get("https://www.webmotors.com.br/");
	}

	public void buscarMarca() {
		clicar(aceitarCookies);
		clicar(pesquisar);
		clicar(marca);
		clicar(clicarModelo);
		clicar(modelo);
		clicar(clicarVersao);
		clicar(versao);	
		
	}	
	
	public void validarMarca() throws Exception {
		validarTexto("Honda", honda);
	}
	
	public void validarModelo() throws Exception {
		validarTexto("City",city);
	}

	public void validarVersao() throws Exception {
		validarTexto("HONDA CITY 1.5 DX 16V FLEX 4P AUTOMÁTICO", vAuto);
	}
	
}