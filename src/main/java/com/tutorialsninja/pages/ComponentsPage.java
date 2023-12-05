package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {

    By componentText= By.xpath("//h2[normalize-space()='Components']");

    /**
     * This method is used to get component text
     * @return
     * @throws InterruptedException
     */
    public String getComponentText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(componentText);
    }
}

