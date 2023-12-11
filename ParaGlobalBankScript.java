package Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Parabank {
	public static void main(String args[]) throws AWTException, InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		//Register
		Thread.sleep(7000);
		
		/* By regprop=By.linkText("Register");
		 
		WebElement Register=driver.findElement(regprop);
		Register.click();
		Thread.sleep(2000);
		//customer.firstName
		By FirstNameprop=By.id("customer.firstName");
		WebElement FirstName=driver.findElement(FirstNameprop);
		FirstName.sendKeys("satya");
		Thread.sleep(2000);

		//customer.lastName
		By LastNameprop=By.id("customer.lastName");
		WebElement LastName=driver.findElement(LastNameprop);
		LastName.sendKeys("narayana");
		Thread.sleep(2000);

		//customer.address.street
		By Addressprop=By.id("customer.address.street");
		WebElement Address=driver.findElement(Addressprop);
		Address.sendKeys(" Plot No:MIG-362 APHB Colony");
		Thread.sleep(2000);

		//customer.address.city
		By Cityprop=By.id("customer.address.city");
		WebElement City=driver.findElement(Cityprop);
		City.sendKeys("Adoni");
		Thread.sleep(2000);

		//customer.address.state
		By stateprop=By.id("customer.address.state");
		WebElement state=driver.findElement(stateprop);
		state.sendKeys("AndhraPrasdesh");
		Thread.sleep(2000);

		//customer.address.zipCode
		By zipcodeprop=By.id("customer.address.zipCode");
		WebElement zipcode=driver.findElement(zipcodeprop);
		zipcode.sendKeys("518302");
		Thread.sleep(2000);

		//customer.phoneNumber
		By phoneNumberprop=By.id("customer.phoneNumber");
		WebElement phoneNumber=driver.findElement(phoneNumberprop);
		phoneNumber.sendKeys("7680977657");
		Thread.sleep(2000);

     	//customer.ssn
		By ssnprop=By.id("customer.ssn");
		WebElement ssn=driver.findElement(ssnprop);
		ssn.sendKeys("0102");
		Thread.sleep(2000);

		//customer.username
		By usernameprop=By.id("customer.username");
		WebElement username=driver.findElement(usernameprop);
		username.sendKeys("satya");
		Thread.sleep(2000);

		//customer.password
		By passwordprop=By.id("customer.password");
		WebElement password=driver.findElement(passwordprop);
		password.sendKeys("satya");
		Thread.sleep(2000);

		//repeatedPassword
		By repeatedPasswordprop=By.id("repeatedPassword");
		WebElement repeatedPassword=driver.findElement(repeatedPasswordprop);
		repeatedPassword.sendKeys("satya");
		Thread.sleep(2000);

		//Register
		By RegisterbtnProp=By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
		WebElement Registerbtn=driver.findElement(RegisterbtnProp);
		Registerbtn.click();
		driver.navigate().back();*/
		//================================================================
		Thread.sleep(3000);
		By usernameloginprop=By.name("username");
		WebElement usernamelogin=driver.findElement(usernameloginprop);
		usernamelogin.sendKeys("satya");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		
		By passwordloginprop=By.name("password");
		WebElement passwordlogin=driver.findElement(passwordloginprop);
		passwordlogin.sendKeys("satya");
		////*[@id="loginPanel"]/form/div[3]/input
		By loginbuttonprop=By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
		WebElement loginbutton=driver.findElement(loginbuttonprop);
		loginbutton.click();
		//15231
		Thread.sleep(3000);
		//By amntprop=By.linkText("13566");
		By amntprop=By.linkText("31881");

		WebElement amnt=driver.findElement(amntprop);
		amnt.click();
        Thread.sleep(3000);		
		By monthprop=By.id("month");
		WebElement month=driver.findElement(monthprop);
		Select s=new Select(month);
		Thread.sleep(3000);
		s.selectByVisibleText("January");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		//Log Out
		Thread.sleep(3000);
		//By LogOutprop=By.linkText("Log Out");
		//WebElement LogOut=driver.findElement(LogOutprop);
		//LogOut.click();

		By openacntprop=By.linkText("Open New Account");
		WebElement openacnt=driver.findElement(openacntprop);
		openacnt.click();
		Thread.sleep(3000);
		//type
		By savingsprop=By.id("type");
		WebElement savings=driver.findElement(savingsprop);
		Select s1=new Select(savings);
		s1.selectByVisibleText("SAVINGS");
		Thread.sleep(3000);
		//fromAccountId
		By accountidprop=By.id("fromAccountId");
		WebElement accountid=driver.findElement(accountidprop);
		Select s2=new Select(accountid);
		s2.selectByVisibleText("31881");
		Thread.sleep(3000);
		///html/body/div[1]/div[3]/div[2]/div/div/form/div/input
		By opennewacntbuttonprop=By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input");
		WebElement openaccountbtn=driver.findElement(opennewacntbuttonprop);
		openaccountbtn.click();
		Thread.sleep(3000);
		//Accounts Overview
		By AccountsOverviewprop=By.linkText("Accounts Overview");
		WebElement AccountsOverview=driver.findElement(AccountsOverviewprop);
		AccountsOverview.click();
		Thread.sleep(3000);
		//Transfer Funds
		By TransferFundsprop=By.linkText("Transfer Funds");
		WebElement TransferFunds=driver.findElement(TransferFundsprop);
		TransferFunds.click();
		Thread.sleep(3000);
		//amount
		By amnttransferprop=By.id("amount");
		WebElement amounttransfer=driver.findElement(amnttransferprop);
		amounttransfer.sendKeys("10");
		///html/body/div[1]/div[3]/div[2]/div/div/form/div[2]/input
		By amnttransferbtnprop=By.id("amount");
		WebElement amounttransferbtn=driver.findElement(amnttransferbtnprop);
		amounttransferbtn.click();
		Thread.sleep(3000);
       //Bill Pay
		By billpayprop=By.linkText("Bill Pay");
		WebElement billpay=driver.findElement(billpayprop);
		billpay.click();
		//payee.name
		By payeenameprop=By.name("payee.name");
		WebElement payeename=driver.findElement(payeenameprop);
		payeename.sendKeys("ajay");
		//payee.address.street
		By payeeaddressprop=By.name("payee.address.street");
		WebElement payeeaddress=driver.findElement(payeeaddressprop);
		payeeaddress.sendKeys("MIG-362 APHB COLONY");
		//payee.address.city
		By payeecityprop=By.name("payee.address.city");
		WebElement payeecity=driver.findElement(payeecityprop);
		payeecity.sendKeys("Adoni");
		//payee.address.state
		By payeestateprop=By.name("payee.address.state");
		WebElement payeestate=driver.findElement(payeestateprop);
		payeestate.sendKeys("Andhrapradesh");
		//payee.address.zipCode
		By payeezipcodeprop=By.name("payee.address.zipCode");
		WebElement payeezipcode=driver.findElement(payeezipcodeprop);
		payeezipcode.sendKeys("518305");
		//payee.phoneNumber
		By payeephonenoprop=By.name("payee.phoneNumber");
		WebElement payeephoneno=driver.findElement(payeephonenoprop);
		payeephoneno.sendKeys("1234567890");
		//payee.accountNumber
		By payeeaccountnoprop=By.name("payee.accountNumber");
		WebElement payeeaccountno=driver.findElement(payeeaccountnoprop);
		payeeaccountno.sendKeys("31881");
		//verifyAccount
		By verifyaccountnoprop=By.name("verifyAccount");
		WebElement verifyaccountno=driver.findElement(verifyaccountnoprop);
		verifyaccountno.sendKeys("31881");
       //amount
		By amtprop=By.name("amount");
		WebElement amt=driver.findElement(amtprop);
		amt.sendKeys("10");
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
      //  r.keyPress(KeyEvent.VK_ENTER);
        By sendpaymentbtnprop=By.className("button");
        WebElement sendpaymentbtn=driver.findElement(sendpaymentbtnprop);
        sendpaymentbtn.click();
        Thread.sleep(3000);
        //Find Transactions
        By FindTransactionsprop=By.linkText("Find Transactions");
       WebElement FindTransactions=driver.findElement(FindTransactionsprop);
       FindTransactions.click();
       //criteria.amount
       By findbyamntprop=By.id("criteria.amount");
       WebElement findbyamnt=driver.findElement(findbyamntprop);
       findbyamnt.sendKeys("10");
       //Find Transactions
       By findtransactionbuttonproperty=By.className("button");
      WebElement findtransactionbutton=driver.findElement(findtransactionbuttonproperty);
      findtransactionbutton.click();
      Thread.sleep(3000);
      //Request Loan
      By RequestLoanprop=By.linkText("Request Loan");
      WebElement RequestLoan=driver.findElement(RequestLoanprop);
      RequestLoan.click();
	//amount
      Thread.sleep(3000);
      By loanamountprop=By.id("amount");
      WebElement loanamount=driver.findElement(loanamountprop);
      loanamount.sendKeys("4");
      //downPayment
      Thread.sleep(3000);
      By downPaymentprop=By.id("downPayment");
      WebElement downPayment=driver.findElement(downPaymentprop);
      downPayment.sendKeys("2");
      Thread.sleep(3000);
      //fromAccountId
      By fromAccountIdprop=By.id("fromAccountId");
      WebElement fromAccountId=driver.findElement(fromAccountIdprop);
      Select s3=new Select(fromAccountId);
      s3.selectByVisibleText("31881");
      Thread.sleep(3000);
      ///html/body/div[1]/div[3]/div[2]/div/div/form/table/tbody/tr[4]/td[2]/input
      By applynowprop=By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/table/tbody/tr[4]/td[2]/input");
      WebElement applynow=driver.findElement(applynowprop);
      applynow.click();
      By LogOutprop=By.linkText("Log Out");
		WebElement LogOut=driver.findElement(LogOutprop);
		LogOut.click();
		//contact
		Thread.sleep(3000);
		By contactusprop=By.linkText("contact");
		WebElement contactus=driver.findElement(contactusprop);
		contactus.click();
		By customercarenameprop=By.id("name");
		WebElement customercarename=driver.findElement(customercarenameprop);
		customercarename.sendKeys("satya");
		By customercaremailprop=By.id("email");
		WebElement customercareename=driver.findElement(customercaremailprop);
		customercareename.sendKeys("satya@gmail.com");
		By customercarephonenumberprop=By.id("phone");
		WebElement customercarephonenumber=driver.findElement(customercarephonenumberprop);
		customercarephonenumber.sendKeys("7680977978");
		By customercaremsgprop=By.id("message");
		WebElement customercaremsg=driver.findElement(customercaremsgprop);
		customercaremsg.sendKeys("Automation Testing check!!");
		By customercaresubmitbtnprop=By.className("button");
		WebElement customercaresubmitbtn=driver.findElement(customercaresubmitbtnprop);
		customercaresubmitbtn.click();
		
		
		
		//===========================================================================
	    By homeprop=By.linkText("Home");
		WebElement home=driver.findElement(homeprop);
		home.click();
		Thread.sleep(3000);
		By abtusprop=By.linkText("About Us");
		WebElement abtus=driver.findElement(abtusprop);
		abtus.click();
		Thread.sleep(3000);

		By servicesprop=By.linkText("Services");
		WebElement services=driver.findElement(servicesprop);
		services.click();
		Thread.sleep(3000);

		By Productsprop=By.linkText("Products");
		WebElement Products=driver.findElement(Productsprop);
		Products.click();
		Thread.sleep(3000);
driver.navigate().back();
///html/body/div[1]/div[2]/ul[1]/li[5]/a
		By Locationsprop=By.xpath("/html/body/div[1]/div[2]/ul[1]/li[5]/a");
		WebElement Locations=driver.findElement(Locationsprop);
		Locations.click();
		Thread.sleep(3000);
		driver.navigate().back();

		By Forumprop=By.linkText("Forum");
		WebElement Forum=driver.findElement(Forumprop);
		Forum.click();
		Thread.sleep(3000);
		driver.navigate().back();

		By sitemapprop=By.linkText("Site Map");
		WebElement sitemap=driver.findElement(sitemapprop);
		sitemap.click();
		Thread.sleep(3000);
		driver.navigate().back();

		By Contactusprop=By.linkText("Contact Us");
		WebElement Contactus=driver.findElement(Contactusprop);
		Contactus.click();
		
		
		//===============================================================================*/
		//About Us
		/* By AboutUsprop=By.linkText("About Us");
         WebElement AboutUs=driver.findElement(AboutUsprop);
         AboutUs.click();
         driver.navigate().back();

		
		Thread.sleep(5000);
       By servicesprop=By.linkText("Services");
         WebElement service=driver.findElement(servicesprop);
        service.click();
       // driver.navigate().back();

        
        ////*[@id="rightPanel"]/table[5]/tbody/tr/td/a[2]
        Thread.sleep(3000);
        By scrollprop=By.xpath("//*[@id=\"rightPanel\"]/table[5]/tbody/tr/td/a[2]");
        WebElement scroll=driver.findElement(scrollprop);
        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);",scroll );
      // =============================================================================
    		   //Products
        Thread.sleep(3000);
        By Productsprop=By.linkText("Products");
        WebElement Products=driver.findElement(Productsprop);
        Products.click();
        //=============================================================
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        By Locationsprop=By.linkText("Locations");
        WebElement Locations=driver.findElement(Locationsprop);
        Locations.click();
        driver.navigate().back();
        //====================================================
        //Admin Page
        Thread.sleep(3000);
        By AdminPageprop=By.xpath("/html/body/div[1]/div[2]/ul[1]/li[6]/a");
        WebElement AdminPage=driver.findElement(AdminPageprop);
        AdminPage.click();
        driver.navigate().back();
        //=================================================================
		/*By linksprop=By.tagName("a");
		List <WebElement>links=driver.findElements(linksprop);
		int linkscount=links.size();
		System.out.println("Total no of links :"+linkscount);
		for(int i=0;i<links.size();i++) {
			String linkname=links.get(i).getText();
			System.out.println("Index :"+i+" "+"linkname is:"+linkname);
		}*/
		/*By forgotprop=By.linkText("Forgot login info?");
		WebElement forgot=driver.findElement(forgotprop);
		forgot.click();
		By forgotFirstNameprop=By.id("firstName");
		WebElement forgotFirstName=driver.findElement(forgotFirstNameprop);
		forgotFirstName.sendKeys("Jujare");
		//customer.lastName
		By forgotLastNameprop=By.id("lastName");
		WebElement forgotLastName=driver.findElement(forgotLastNameprop);
		forgotLastName.sendKeys("AjayKumar");
		//customer.address.street
		By forgotAddressprop=By.id("address.street");
		WebElement forgotAddress=driver.findElement(forgotAddressprop);
		forgotAddress.sendKeys("MIG-362 APHB Colony");
		//customer.address.city
		By forgotCityprop=By.id("address.city");
		WebElement forgotCity=driver.findElement(forgotCityprop);
		forgotCity.sendKeys("Adoni");
		//customer.address.state
		By forgotstateprop=By.id("address.state");
		WebElement forgotstate=driver.findElement(forgotstateprop);
		forgotstate.sendKeys("AndhraPrasdesh");
		//customer.address.zipCode
		By forgotzipcodeprop=By.id("address.zipCode");
		WebElement forgotzipcode=driver.findElement(forgotzipcodeprop);
		forgotzipcode.sendKeys("518301");
		
		By forgotssnprop=By.id("ssn");
		WebElement forgotssn=driver.findElement(forgotssnprop);
		forgotssn.sendKeys("12345");
		//
		By findmyinfoprop=By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input");
		WebElement findmyinfo=driver.findElement(findmyinfoprop);
		findmyinfo.click();*/
		
	}

}
