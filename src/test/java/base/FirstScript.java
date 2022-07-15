package base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstScript {
	
public static void main(String[] args) throws MalformedURLException {
	
	File parent= new File("APKFiles"); 
	File app=new File(parent,"ApiDemos-debug.apk");
	
	DesiredCapabilities cap= new DesiredCapabilities(); 
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RahulEmulator");
	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	
	//UI Automator-->Android 
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

	AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap); 
	
	
}
}
