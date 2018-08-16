package testCases;
import org.openqa.selenium.chrome.ChromeDriver;
import features.pages.*;
import features.common.*;

public class testVerifyResults extends GlobalVariables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/cars/search?stars=4&price=&pickup=yes&txtSearch=&searching=&modType=");
        driver.manage().window().maximize();

        resultsVerify checkResult = new resultsVerify();
        commonFunctions timePage = new commonFunctions();
        checkResult.verifyAirportPickup(true);
//        checkResult.verifyAirportPickup(false);

        checkResult.verifyStarGrade(4);
;

        driver.get("https://www.phptravels.net/tours/search?price=&type=197&txtSearch=&searching=&modType=");
        timePage.sleep(20);
        checkResult.verifyTourType("Holiday");

        driver.get("https://www.phptravels.net/flights/0/0/0/0/0/0/1/0/0/0/0/0/Emirates/Air-Madagascar");
        timePage.sleep(20);
        checkResult.verifyAirlineNameList();

        driver.close();
        driver.quit();


    }
}
