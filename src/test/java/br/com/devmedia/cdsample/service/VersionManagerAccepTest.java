package br.com.devmedia.cdsample.service;

import static org.openqa.selenium.By.id;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

@Test
public class VersionManagerAccepTest {

    public void shouldShowTheAppVersion() {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://192.168.2.5:8180/");

        WebElement element = driver.findElement(id("appversion"));
        assertFalse(element.getText().isEmpty());

        driver.quit();
    }

}
