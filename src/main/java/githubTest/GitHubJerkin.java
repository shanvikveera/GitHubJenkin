package githubTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class GitHubJerkin {
	public void logintest() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanwik\\workspace2\\github\\env\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://bing.com");
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\shanwik\\workspace2\\GitHub1Test\\screenshot\\test.jpg"));

}
}
