package selenium;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfereConfigProjeto {
    WebDriver driver;

    @Before
    public void abreBrowser() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void testConfereConfigProjetoOK() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Teste");
        Assert.assertEquals("https://www.google.com", driver.getCurrentUrl().substring(0, 22));
        JOptionPane.showMessageDialog(null, "Seu ambiente está configurado para o treinamento.");
        System.exit(0);
    }

    @After
    public void fechaBrowser() {
        driver.quit();
    }
}