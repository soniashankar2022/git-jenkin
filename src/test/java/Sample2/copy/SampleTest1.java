package Sample2.copy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {
	@Test
public void googleTest() throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wd.findElement(By.name("q")).sendKeys("Chennai");		
		wd.findElement(By.name("q")).submit();
		
		File src=(( TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\daily practise  java Vcentry\\G1_GitHubTest\\Screenshot\\bing.png"));
// version 1 branch
	
	}
}