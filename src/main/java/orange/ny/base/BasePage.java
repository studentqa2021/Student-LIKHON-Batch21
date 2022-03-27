package orange.ny.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasePage {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	public BasePage() {
		logger = Logger.getLogger("Test Lead Likhon"); 
		PropertyConfigurator.configure("Log4j.properties");
	

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream( 
			System.getProperty("user.dir") + "/src/main/java/orange/ny/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
//		finally { // Must executed
//			System.out.println("The finally statement is executed file not found");
//		}

	}
	
	public static void initializations() { // setUP();
	  prop.getProperty("browserName");
		logger.info("****** Starting Chrome Browser ******");
				
			System.setProperty("webdriver.chrome.driver", prop.getProperty("windows"));
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

	}
