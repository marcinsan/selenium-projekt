package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;

import Lait.pl.selenium1.Init;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Login2Test {

	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();
		System.out.println("wewnatrz openPage (before)");
		driver = Init.getDriver();
		System.out.println("wewnatrz openPage (koniec before);");
	}

	@Ignore
	@Test
	public void login() {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("123@gmail.com", "123");
		System.out.println("koniec testu login");

	}

	@Test
	public void reservation() {
		// 1 - otwieramy przegladarkę i logujemy sie do aplikacji
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("adamdz", "qwe123");
		// 2 - na pierwszym ekranie po zalogowaniu sie wypełniam formularz rezerwacji
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.oneWayRadioClick();
		Init.sleep(1);
		reservationPage.roundTripRadioClick();
		Init.sleep(1);
		reservationPage.passengersCount("2");
		Init.sleep(1);
		reservationPage.passengersCount("3");
		reservationPage.fromPort("London");
		reservationPage.on("12", "1");
		reservationPage.businessClass();
		reservationPage.airline("Blue Skies Airlines");
		Init.sleep(4);
		reservationPage.continueBtnClick();
		Init.sleep(3);
		
		Reservation2Page r2p = new Reservation2Page();
		r2p.radio2Click();
		r2p.radio6Click();
		r2p.continueBtnClick();
		
		Init.sleep(6);
		r2p.pass0("Rycho", "Zwiedzacz", "Hindu");
		Init.sleep(10);
		r2p.creditCard("MasterCard");
		Init.sleep(10);
		r2p.securePurchaseClick();
		Init.sleep(10);
		
		
		
	}


	@After
	public void close() {
		Init.endTest();

	}

}
