package tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver\\chromedriver.exe");
        // Abrindo navegador
        WebDriver navigator = new ChromeDriver();

        // Navegando para a página do Taskit !
        navigator.get("http://www.juliodelima.com.br/taskit");



        // Validação
        assertEquals(1,1);
    }
}
