package day09_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02 extends TestBase {
    @Test
    public void test01(){

        //Yeni bir class olusturalim: MouseActions2
        //        1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
        //        2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
       WebElement dragMe=driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement drophere=driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(dragMe,drophere).perform();
        //        3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        WebElement dropped=driver.findElement(By.xpath(" //*[text()='Dropped!']"));
        Assert.assertTrue(dropped.isDisplayed());

    }
}
