package com.letKodeit.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.letKodeit.Pages.PracticePage;
import com.letKodeit.Utilities.BrowserUtils;
import com.letKodeit.Utilities.TestBase;

public class PracticePageTest extends TestBase{
	
	

	@Test
    public void verifyHomePage() throws Exception {

		PracticePage pp = new PracticePage();
	        
        String expected = "Practice Page";
        
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        String actual = pp.practiceHOMEPAGE.getText();//driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText(); 
        //BrowserUtils.waitFor(3);
        
        System.out.println(actual);
        Assert.assertEquals(actual, expected);

    }
}
