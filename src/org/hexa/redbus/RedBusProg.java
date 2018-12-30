package org.hexa.redbus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RedBusProg {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Java\\Selenium\\src\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.redbus.in/");
WebElement from=driver.findElement(By.id("src"));
from.sendKeys("Pondicherry");
WebElement to=driver.findElement(By.id("dest"));
to.sendKeys("Chennai");
String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);
}
}