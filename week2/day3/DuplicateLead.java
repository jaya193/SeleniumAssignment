package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 //15.get the title of result page
		 String title_dup = driver.getTitle();
		 System.out.println("Title bfr duplicate lead:"+title_dup);
		 //16.Click on duplicate button 
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 //17. clear company name & etr new compnay name -
		 WebElement ele_companynme = driver.findElement(By.id("createLeadForm_companyName"));
		 ele_companynme.clear();
		 ele_companynme.sendKeys("TestLeaf Organisation");
		 //18.clear first name & etr new first name 
		 WebElement ele_firstnme = driver.findElement(By.id("createLeadForm_firstName"));
		 ele_firstnme.clear();
		 ele_firstnme.sendKeys("Jaisri");
		 //19.Click on create Lead button -value Create Lead
		 WebElement dup_creatleadbtn = driver.findElement(By.name("submitButton"));
		 String dubPgbtn = dup_creatleadbtn.getAttribute("value");
		 System.out.println("dup_creatleadbtn:clicked success-->"+dubPgbtn);
		 if(dubPgbtn.equals("Create Lead"))
		 {
			  System.out.println("Found Create lead button in Duplicate lead page");
			  dup_creatleadbtn.click();
				 }
		 else
		 {
			 System.out.println("Not Found Create lead button in Duplicate lead page");
		 }
		 
		 //20 get title of result page
		 String title_res = driver.getTitle();
		 System.out.println("Title after duplicate lead click:"+title_res);
		 
		 
		 

	}

}
