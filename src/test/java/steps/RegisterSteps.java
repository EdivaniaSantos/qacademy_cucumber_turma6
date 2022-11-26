package steps;

import Register.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterSteps {
    WebDriver driver;
    RegisterPage registerPage;


    @Before//("@Resister")
    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));


    }
    @After//("@Resister")
    public void fecharBrowser(){
        driver.quit();
    }

    @AfterStep("Register")
    public void print(){
        TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
        byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
        InputStream printStream = new ByteArrayInputStream(printBytes);
        Allure.addAttachment("Register",printStream);
    }

    @Dado("que eu acesso o site Register")
    public void queEuAcessoOSiteRegister() {
        driver.get("https://demo.automationtesting.in/Register.html");

    }

    @Quando("preencho o campo firstName com o valor {string}")
    public void preenchoOCampoFirstNameComOValor(String firstName) {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.preencherNome(firstName);

    }

    @E("preencho o campo lastName com o valor {string}")
    public void preenchoOCampoLastNameComOValor(String lastName) {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.preencherSobrenome(lastName);
    }

    @E("preencho o campo address com o valor {string}")
    public void preenchoOCampoAddressComOValor(String address) {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.preencherSobrenome(address);
    }

    @E("preencho o campo emailAddress com o valor {string}")
    public void preenchoOCampoEmailAddressComOValor(String email) {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.preencherSobrenome(email);
    }

    @E("preencho o campo phone com o valor {string}")
    public void preenchoOCampoPhoneComOValor(String phone) {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.preencherSobrenome(phone);
    }

    @E("clico no campo feminino")
    public void clicoNoCampoFeminino() {

    }

    @E("clico no checkbox Male")
    public void clicoNoCheckboxMale() {
    }

    @E("clico no checkbox Movies")
    public void clicoNoCheckboxMovies() {
    }

    @E("clico no checkbox java")
    public void clicoNoCheckboxJava() {
    }

    @E("preencho o campo year com o valor {string},month {string}, e o day {string}")
    public void preenchoOCampoYearComOValorMonthEODay(String ano, String mes, String dia) {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.selecionarAno(ano);
        registerPage.selecionarMes(mes);
        registerPage.selecionarDia(dia);
    }

}
