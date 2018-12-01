package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Lait.pl.selenium1.Init;


public class ReservationPage {
	
	WebDriver driver;

	@FindBy(xpath = "/html/body/div/table/tbody"
			+ "/tr/td[2]/table/tbody/tr[4]/td"
			+ "/table/tbody/tr/td[2]/table/tbody"
			+ "/tr[5]/td/form/table/tbody/tr[2]"
			+ "/td[2]/b/font/input[2]")
	WebElement oneWayRadio;
	
	@FindBy(xpath = "/html/body/div/table/tbody"
			+ "/tr/td[2]/table/tbody/tr[4]/td"
			+ "/table/tbody/tr/td[2]/table/tbody"
			+ "/tr[5]/td/form/table/tbody/tr[2]"
			+ "/td[2]/b/font/input[1]")
	WebElement RoundTrippRadio;
	
	@FindBy(name = "passCount")
	WebElement passCount;
	
	@FindBy(name = "fromPort")
	WebElement fromPort;
	@FindBy(name = "fromMonth")
	WebElement fromMonth;
	@FindBy(name = "fromDay")
	WebElement fromDay;
	
	@FindBy(name = "toPort")
	WebElement toPort;
	@FindBy(name = "toMonth")
	WebElement toMonth;
	@FindBy(name = "toDay")
	WebElement toDay;
	
	@FindBy(xpath = "/html/body/div/table/tbody/"
			+ "tr/td[2]/table/tbody/tr[4]/td/table"
			+ "/tbody/tr/td[2]/table/tbody/tr[5]/td/"
			+ "form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement businessClass;
	
	@FindBy(name = "airline")
	WebElement airline;
	
	@FindBy(name = "findFlights")
	WebElement continueBtn;
	
	public ReservationPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void oneWayRadioClick() {
		oneWayRadio.click();
	}
	public void roundTripRadioClick() {
		RoundTrippRadio.click();
	}
	public void passengersCount(String count) {
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue(count);
	}
	
	public void on(String month, String day) {
		Select m = new Select(fromMonth);
		m.selectByValue(month);
		Select d = new Select(fromDay);
		d.selectByValue(day);
		
	}
	
	public void to(String month, String day) {
		Select m = new Select(toMonth);
		m.selectByValue(month);
		Select d = new Select(toDay);
		d.selectByValue(day);
	}
	
	public void businessClass() {
		businessClass.click();
	}
	
	/**
	 * <select name="airline"><br>
	 *No Preference<br>
	 *Blue Skies Airlines<br>
	 *Unified Airlines<br>
	 *Pangea Airlines<br>
	 * @param line
	 */
	public void airline(String line) {
		Select line_tmp_var = new Select(airline);
		line_tmp_var.selectByVisibleText(line);
	}
	
	public void continueBtnClick() {
		continueBtn.click();
	}

	public void fromPort(String portValue) {
	  Select p = new Select(fromPort);
	  p.selectByValue(portValue);
		
	}

	public void arrivingInPort(String toportvalue) {
		Select p = new Select (toMonth);
		p.selectByVisibleText(toportvalue);
		
	}

	public void returningDate(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	


		
	}


