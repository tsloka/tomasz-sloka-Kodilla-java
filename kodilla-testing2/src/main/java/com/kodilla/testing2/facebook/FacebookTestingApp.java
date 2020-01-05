package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_NAME = "//div[contains(@id, \"fullname\")]/div/div/div/div/input";
    public static final String XPATH_SURNAME = "//div[contains(@id, \"fullname\")]/div/div[2]/div/div/input";
    public static final String XPATH_PHONENUMBER = "//form[contains(@id, \"reg\")]/div/div[2]/div/div/input";
    public static final String XPATH_DAY = "//select[contains(@id, \"day\")]";
    public static final String XPATH_MONTH = "//select[contains(@id, \"month\")]";
    public static final String XPATH_YEAR = "//select[contains(@id, \"year\")]";


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement nameField = driver.findElement(By.xpath(XPATH_NAME));
        nameField.sendKeys("Grzegorz");

        WebElement surnameField = driver.findElement(By.xpath(XPATH_SURNAME));
        surnameField.sendKeys("Brzeczyszczykiewicz");

        WebElement phoneNoField = driver.findElement(By.xpath(XPATH_PHONENUMBER));
        phoneNoField.sendKeys("12345667890");

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(25);

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(5);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(56);

        Thread thread = new Thread();
        thread.sleep(2000);

        driver.close();
    }
}
