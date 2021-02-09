package assignment;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	WebDriver driver=null;
	@Test
	public void test1() throws IOException, InterruptedException {
		System.out.println("test 1"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://grootan.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[1]").click();
		TakesScreenshot TS=(TakesScreenshot)driver;
		File src= TS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots1/grootan home.png"));
		Thread.sleep(3000);
		
	}

	@Test
	public void test2() throws IOException, InterruptedException {
		System.out.println("test 2"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://grootan.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[2]").click();
		System.out.println("Service: " + driver.getTitle());
		TakesScreenshot TS1=(TakesScreenshot)driver;
		File src1= TS1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("./Screenshots1/grootan service.png"));
	    Thread.sleep(3000);
}
	
	
	
	@Test
	public void test3() throws IOException, InterruptedException {
		System.out.println("test 3"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://grootan.com");
		driver.manage().window().maximize();	
		
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[2]").click();
		System.out.println("grootan team: " + driver.getTitle());
		TakesScreenshot TS2=(TakesScreenshot)driver;
		File src2= TS2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("./Screenshots1/grootan team.png"));
		Thread.sleep(3000);
		driver.close();
}
	
	@Test
	public void test4() throws IOException, InterruptedException {
		System.out.println("test 4"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://grootan.com");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[2]").click();
		System.out.println("grootan careers " + driver.getTitle());
		TakesScreenshot TS3=(TakesScreenshot)driver;
		File src3= TS3.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3, new File("./Screenshots1/grootan careers.png"));
		Thread.sleep(3000);
		driver.close();
}
	

	@Test
	public void test5() throws InterruptedException, IOException  {
		System.out.println("test 5"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://grootan.com");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[2]").click();
		System.out.println("grootan contact us: " + driver.getTitle());
		TakesScreenshot TS4=(TakesScreenshot)driver;
		File src4= TS4.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4, new File("./Screenshots1/grootan contact us.png"));
		Thread.sleep(3000);
		driver.close();
}
	@Test
	public void test6() throws InterruptedException, IOException  {
		System.out.println("test 6"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://grootan.com");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[2]").click();
		System.out.println("grootan blog " + driver.getTitle());
		TakesScreenshot TS5=(TakesScreenshot)driver;
		File src5= TS5.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src5, new File("./Screenshots1/grootan blog.png"));
		Thread.sleep(3000);
		driver.close();
}	
}
