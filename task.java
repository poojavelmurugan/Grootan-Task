package assignment;

import java.awt.Image;

import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task {
	@Test
	public void captureScreenshot() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://grootan.com");
		driver.manage().window().maximize();
		
	
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[1]").click();
		TakesScreenshot TS=(TakesScreenshot)driver;
		File src= TS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots/grootan home.png"));
	
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[2]").click();
		System.out.println("Service: " + driver.getTitle());
		TakesScreenshot TS1=(TakesScreenshot)driver;
		File src1= TS1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("./Screenshots/grootan service.png"));
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[3]").click();
		System.out.println("Open Source: " + driver.getTitle());
		TakesScreenshot TS2=(TakesScreenshot)driver;
		File src2= TS2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("./Screenshots/grootan open source.png"));
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[5]").click();
		System.out.println("Team: " + driver.getTitle());
		TakesScreenshot TS3=(TakesScreenshot)driver;
		File src3= TS3.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3, new File("./Screenshots/grootan team.png"));
		
		List<WebElement> noOfResults = driver.findElementsByXPath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[6]/div[4]/h5");
		
		int size = noOfResults.size();
		System.out.println("Number of junior engineers: "+ size);
		
		
		
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[6]").click();
		System.out.println("Careers: " + driver.getTitle());
		TakesScreenshot TS4=(TakesScreenshot)driver;
		File src4= TS4.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4, new File("./Screenshots/grootan careers.png"));
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[7]").click();
		System.out.println("Contact Us: " + driver.getTitle());
		TakesScreenshot TS5=(TakesScreenshot)driver;
		File src5= TS5.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src5, new File("./Screenshots/grootan contact us.png"));
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[4]").click();
		System.out.println("Blog: " + driver.getTitle());
		TakesScreenshot TS6=(TakesScreenshot)driver;
		File src6= TS6.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src6, new File("./Screenshots/grootan blog.png"));
		System.out.println("Screenshots taken");
		
		driver.findElementByXPath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[5]").click();
		System.out.println("Team: " + driver.getTitle());
	
		  driver.findElementByXPath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[1]/div[1]/img").click();
			TakesScreenshot TS7=(TakesScreenshot)driver;
			File src7= TS7.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src7, new File("./Screenshots3/grootan co-founder.png"));
			Thread.sleep(3000);
			 
		  
		  
			  driver.findElementByXPath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[1]/div[2]/img").click();
				TakesScreenshot TS8=(TakesScreenshot)driver;
				File src8= TS8.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src8, new File("./Screenshots3/grootan HR.png"));
				Thread.sleep(3000);
	}

	@Test
	  public void imageProcessing() {
		  
		  String imgFile1 = "C:\\Users\\karthik\\Ecllipse\\Maven\\MavenProject\\Screenshots";
		  String imgFile2 = "C:\\Users\\karthik\\Ecllipse\\Maven\\MavenProject\\Screenshots2";
		  Image img1 = Toolkit.getDefaultToolkit().getImage(imgFile1);
		  Image img2 = Toolkit.getDefaultToolkit().getImage(imgFile2);
		  
		  try{
			  PixelGrabber pixGrab1 = new PixelGrabber(img1, 0, 0, -1, -1, false);
			  PixelGrabber pixGrab2 = new PixelGrabber(img2, 0, 0, -1, -1, false);
			 
			  int[] dataArry1 = null;
			  int[] dataArry2 = null;
			  
			  if(pixGrab1.grabPixels()){
				  int height = pixGrab1.getHeight();
				  int width = pixGrab1.getWidth();
				  dataArry1 = new int[width * height];
				  dataArry1 = (int[])pixGrab1.getPixels();
			  }
			  
			  if(pixGrab2.grabPixels()){
				  int height2 = pixGrab2.getHeight();
				  int width2 = pixGrab2.getWidth();
				  dataArry2 = new int[width2 * height2];
				  dataArry2 = (int[])pixGrab2.getPixels();
			  }
			  
			  System.out.println("Pixel Comparison: "+Arrays.equals(dataArry1, dataArry2));
			  
		  }catch(Exception e){
			  e.printStackTrace();
		  }}



	@Test
	  public void imageComparison() {
		  
		  String imgFile1 = "./Screenshots3/grootan co-founder.png";
		  String imgFile2 = "./Screenshots3/grootan HR.png";
		  Image img1 = Toolkit.getDefaultToolkit().getImage(imgFile1);
		  Image img2 = Toolkit.getDefaultToolkit().getImage(imgFile2);
		  
		  try{
			  PixelGrabber pixGrab1 = new PixelGrabber(img1, 0, 0, -1, -1, false);
			  PixelGrabber pixGrab2 = new PixelGrabber(img2, 0, 0, -1, -1, false);
			 
			  int[] dataArry1 = null;
			  int[] dataArry2 = null;
			  
			  if(pixGrab1.grabPixels()){
				  int height = pixGrab1.getHeight();
				  int width = pixGrab1.getWidth();
				  dataArry1 = new int[width * height];
				  dataArry1 = (int[])pixGrab1.getPixels();
			  }
			  
			  if(pixGrab2.grabPixels()){
				  int height2 = pixGrab2.getHeight();
				  int width2 = pixGrab2.getWidth();
				  dataArry2 = new int[width2 * height2];
				  dataArry2 = (int[])pixGrab2.getPixels();
			  }
			  
			  System.out.println("Pixel Comparison: "+Arrays.equals(dataArry1, dataArry2));
			  
		  }catch(Exception e){
			  e.printStackTrace();
		  }}}














	
	
	
	
	
	
	


			  
			  
			  
			  
			  


