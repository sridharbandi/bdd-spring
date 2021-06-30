package org.example.driverutil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class MobileBrowser {

    @Value("${browser}")
    private String browser;


    @Bean(name = "webdriver", destroyMethod = "quit")
    @Profile("mobile")
    public WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        WebDriver driver = new AndroidDriver<AndroidElement>(url, cap);
        return driver;
    }
}
