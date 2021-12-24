import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccessHRC {


public static void main(String args[]) throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver dr=new ChromeDriver();
dr.get("https://todo-list-login.firebaseapp.com/#!/");
dr.manage().window().maximize();
dr.findElement(By.xpath("//a[@class='btn btn-social btn-github']")).click();
Thread.sleep(3000);
ArrayList x= new ArrayList(dr.getWindowHandles());
	dr.switchTo().window((String)x.get(1));
	 dr.findElement(By.name("login")).sendKeys("marupakasaivani10@gmail.com");
	 dr.findElement(By.id("password")).sendKeys("saivani1992");
	dr.findElement(By.name("commit")).click();	
	
//	dr.findElement(By.xpath("//*[text()='Authorize prateek3255']")).click();
	Thread.sleep(2000);
	dr.switchTo().window((String)x.get(0));
	dr.findElement(By.xpath("(//*[@type='text'])[2]")).click();
	for(int i=1;i<=10;i++)
	{
	Thread.sleep(1000);
dr.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("Text" + i );
Thread.sleep(1000);
dr.findElement(By.xpath("//*[text()='Add List']")).click();
	}
	Thread.sleep(1000);
dr.findElement(By.xpath("//*[text()='Sign out']")).click();

////////again login
Thread.sleep(2000);
dr.findElement(By.xpath("//a[@class='btn btn-social btn-github']")).click();
for(int i=5;i<=10;i++)
{
Thread.sleep(1000);
 dr.findElement(By.xpath("//*[@class='list-group']/li["+(i)+"]/div/div[2]/button")).click();
}
Thread.sleep(1000);
//dr.findElement(By.xpath("//a[@<button class="btn btn-default"]/ng-click="todo.signOut()">Sign out</button>));
//dr.findElement(By.xpath("//*[text()='Sign out']")).click();
dr.findElement( By.xpath("//a[@class='btn btn-default']")).click();
dr.findElement(By.xpath("//*[text()='Sign out']")).click();


//dr.findElement(By.xpath("//a[@<button class="btn btn-default" ng-click="todo.signOut()">Sign out</button>

}
}







