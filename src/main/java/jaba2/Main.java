package jaba2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Main {
    public static void main(String[] args)throws Exception {
        String
        System.setProperty("webdriver.edge.driver","C:\\Users\\madam\\IdeaProjects\\jaba2\\src\\main\\java\\jaba2\\Silenium\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://web.telegram.org/z/#-1743766900");
        Thread.sleep(30*1000);
        WebElement text = webDriver.findElement(By.id("editable-message-text"));
        while(true) {
            text.sendKeys("your@email.here");
            text.sendKeys("\n");
        }



        //      WebElement vegetable = webDriver.findElement(By.className("ListItem Chat chat-item-clickable group no-selection"));
    }
}
