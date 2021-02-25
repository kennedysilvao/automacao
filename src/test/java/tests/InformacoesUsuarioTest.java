package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    private WebDriver navigator;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver\\chromedriver.exe");
        // Abrindo navegador
        navigator = new ChromeDriver();
        navigator.manage().window().maximize();
        navigator.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Navegando para a página do Taskit !
        navigator.get("http://www.juliodelima.com.br/taskit");
    }
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        // clicar no sign-in
        WebElement linkSignIn = navigator.findElement(By.linkText("Sign in"));
        linkSignIn.click();
        // clicar no campo login que está dentro do form de id = signinbox
        WebElement signInBox = navigator.findElement(By.id("signinbox"));
        // digitar login
        signInBox.findElement(By.name("login")).sendKeys("kennedy");
        // digitar senha
        signInBox.findElement(By.name("password")).sendKeys("123456");
        // clicar no link SIGN IN
        signInBox.findElement(By.linkText("SIGN IN")).click();
        // validar que dentro do elemento com class 'me' possui o texto hi,kennedy
//        WebElement me = navigator.findElement(By.className("me"));
//        String txtElementMe = me.getText();
//        assertEquals("Hi, kennedy", txtElementMe);


        // clicar em um link que possui a class "me"

        // Clicar em um link com o texto More data about you

        // Clicar no btn que tem o data-target = xpath


    }
    @After
    public void tearDown() {
        // close the navigator
        navigator.quit();
    }
}
