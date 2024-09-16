import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    public static void main(String[] args) {

        // Configurando o web driver
        WebDriver driver = new ChromeDriver();


        // Abrir Página
        driver.get("https://bugbank.netlify.app/");


        // Identificar botão cadastrar por Xpath
        WebElement cadastro = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]"));
        cadastro.click();


        /* Identificar campo email pelo Xpath, e inserir 'e-mail'
        WebElement login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input"));
        login.click();
        login.sendKeys("priscila-milani@gmail.com");


        // Clicar no campo senha e inserir a senha
        WebElement password = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/input"));
        password.click();
        password.sendKeys("senhapassword"); */









    }

}
