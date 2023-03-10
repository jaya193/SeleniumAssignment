package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1. Launch leaptaps.com/opentaps
		2. Enter the username as DemoSalesManager
		3. Enter the password as crmsfa
		4. Click on Login
		5. Click on CRM/SFA link
		6. Click on Leads
		7. Click on Create Leads
		8. Fill Company Name, First Name, Last Name
		9. Click on Create Lead button*/
		
		//open chrome browser
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		//etr usrname
		WebElement usrname = driver.findElement(By.id("username"));
		usrname.sendKeys("DemoSalesManager");
		//etr Pwd
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();		
		//5. click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//6. Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		//7. Click on Create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		//8-13. Fill Company Name, First Name, Last Name,Firstname-local,Dept,Description,Email
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayashree");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anitha");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jai");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ComputerScience");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("DataScience,Java,Python,AI Technology");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pjayasri@gmail.com");
		//14. Click on Create Lead button
		 driver.findElement(By.name("submitButton")).click();
		//15.Click on edit button
		 driver.findElement(By.linkText("Edit")).click();
		 //16.clear the description textbox 
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 //17.Fill important note 
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium Version 4.6 no need manage webdriver");
		 //18. click update -id ext-gen611
		 //driver.findElement(By.id("ext-gen611")).click();
		 WebElement updatebtn = driver.findElement(By.name("submitButton"));
		 String update = updatebtn.getAttribute("value");
		 System.out.println("update:clicked success-->"+update);
		 if(update.equalsIgnoreCase("Update"))
		 {
		 System.out.println("Found update button in the  page");
		 updatebtn.click();
		 }
		 else
		 {
			 System.out.println("NOt Found update button in the  page");	 
		 }
		 
		 //19.get the title of result page
		 String title = driver.getTitle();
		 System.out.println("Title:"+title);
		 
		 
		 
		 
		
		

	}

}
