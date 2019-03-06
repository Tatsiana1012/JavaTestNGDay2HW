package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3HomeWork {

    WebDriver driver;


    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "/Users/tatsianadz/IdeaProjects/JavaTestNG/src/test/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void test001() {
        String url = "http://the-internet.herokuapp.com/checkboxes";

        driver.get(url);

        WebElement checkbox1 = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(1)"));
        WebElement checkbox2 = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(3)"));


        if (checkbox1.isSelected()){
            System.out.println("checkbox1 is checked");

        } else checkbox1.click();

        if (checkbox2.isSelected()){
            System.out.println("checkbox2 is checked");

        } else checkbox2.click();


    }
}
