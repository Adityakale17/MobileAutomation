package com.cyient.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebAppChromeMocTest {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("deviceName", "Pixel 2");
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("mobile:Emulation", map);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/search?q=google&rlz=1C1CHBD_enIN952IN952&oq=goo&aqs=chrome.1.69i57j69i59j0i131i433l4j69i60l2.2125j0j7&sourceid=chrome&ie=UTF-8");

	}

}
