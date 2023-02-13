package com.hackerrank.selenium;

import org.openqa.selenium.WebDriver;

public class OnlineSurvey {

    public static void fillDateOfBirth(WebDriver driver, String pageUrl) {
    driver.get(pageUrl)

    Select selectMonth = new Select(driver.findElement(By.id("month")));
    selectMonth.selectByValue("january");
    }

    public static void answerQuestions(WebDriver driver, String pageUrl) {
        // complete implementation
    }
}
