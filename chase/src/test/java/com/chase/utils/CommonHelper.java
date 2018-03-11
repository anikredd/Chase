package com.chase.utils;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CommonHelper {
	public static AppiumDriver<MobileElement> m_driver;
	
	public static void setupAppiumDriver(String platform, String platformVersion, String deviceId) {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "SAMSUNG-SM-G950U Phone");
		caps.setCapability("udid", deviceId); // Give Device ID of your mobile phone
		caps.setCapability("platformName", platform);
		caps.setCapability("platformVersion", platformVersion);
		caps.setCapability("appPackage", "com.chase.sig.android");
		caps.setCapability("appActivity", "com.chase.sig.android.activity.HomeActivity");
		caps.setCapability("noReset", "true");

		// Instantiate Appium Driver
		try {
			m_driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),
					caps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean verifyEnrolButton() {
		
		boolean isExist = false;
		for (WebElement el : m_driver.findElementsByXPath("//*[@class='android.widget.TextView']")) {
			
			if (el.getAttribute("name").equals("Enrollment link")) {
				isExist = true;
				break;
			}
		}
		System.out.println("Enroll Button Displayed");
		return isExist;
	}
	
public static boolean tapEnrolButton() {
		
		boolean isExist = false;
		for (WebElement el : m_driver.findElementsByXPath("//*[@class='android.widget.TextView']")) {
			
			if (el.getAttribute("name").equals("Enrollment link")) {
				isExist = true;
				el.click();
				break;
			}
		}
		System.out.println("Enroll Button Displayed and Clicked");
		return isExist;
	}

public static boolean clickUserID() {
	
	boolean isExist = false;
	for (WebElement el : m_driver.findElementsByXPath("//*[@class='android.widget.EditText']")) {
		
		if (el.getAttribute("name").equals("User ID")) {
			isExist = true;
			el.click();
			break;
		}
	}
	System.out.println("UserID TextField Displayed and Clicked");
	return isExist;
}

}
