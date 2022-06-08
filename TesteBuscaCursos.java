package testesenai;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver;



public class TesteBuscaCursos {
private WebDriver driver;
}

	@Before 
	public void abrirNabegador() {
	
		System.setProperty("webDriver.chrome.driver", "C:\\Program Files (x86)\\chromedrive_32"){
	
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
	}
		
	@Test 
	public void testeNavegador() {
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("Busca1_txtFiltro")).sendkeys("gestao");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("Busca1_btnBusca")).click();
	
		
	}
	
}
	