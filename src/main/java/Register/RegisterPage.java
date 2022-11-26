package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;
    public RegisterPage(WebDriver driverParametro){
        driver = driverParametro;
    }

    private String firstName = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]";
    private String lastName= "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String address= "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String emailAddress= "//*[@id=\"eid\"]/input";
    private String phone= "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String gender= "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobbies= "//input[@value='Movies']";
    private String skills = "Skills";

    private String selectCountry1 = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";

    private String selectCountry2= "//*[@id=\"select2-country-results\"]/li[3]";
    private String year= "yearbox";
    private String month= "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";
    private String day= "daybox";


    public void preencherNome(String nome) {
        driver.findElement(By.xpath(firstName)).sendKeys(nome);
    }

    public void preencherSobrenome(String sobrenome) {
        driver.findElement(By.xpath(lastName)).sendKeys(sobrenome);
    }

    public void preencherEndereço(String endereco) {
        driver.findElement(By.xpath(address)).sendKeys(endereco);
    }

    public void preencherEmail(String email) {
        driver.findElement(By.xpath(emailAddress)).sendKeys(email);
    }

    public void preencherTelefone(String telefone) {
        driver.findElement(By.xpath(phone)).sendKeys(telefone);
    }

    public void clicarGender() {
        driver.findElement(By.xpath(gender)).click();
    }

    public void preencherHobbies() {
        driver.findElement(By.xpath(hobbies)).click();
    }


    public void selecionarAno(String ano2){
        Select ano = new Select(driver.findElement(By.id(year)));
        ano.selectByVisibleText(ano2);
    }

    public void selecionarMes(String meses) {
        Select mes = new Select(driver.findElement(By.xpath(month)));
        mes.selectByVisibleText(meses);
    }
    public void selecionarDia(String dias){
        Select dia = new Select(driver.findElement(By.id(day)));
        dia.selectByVisibleText(dias);
    }
}
