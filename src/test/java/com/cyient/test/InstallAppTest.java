package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class InstallAppTest {

	public static void main(String[] args) throws MalformedURLException {
		
DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability("deviceName", "Samsung");
cap.setCapability("platformName", "Android");

//for installing app in device
cap.setCapability("app", "C:\\Users\\ak59127\\Desktop\\TrainAutomation\\MobileAutomation\\src\\test\\resources\\Apk\\Khan Academy_v6.3.0_apkpure.com.apk");

AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"),cap);



	}

}
