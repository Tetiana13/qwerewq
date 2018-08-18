package com.it.Steps;

import com.it.Pages.BasePage;

import static com.it.common.Constants.BASE_URL;

public class CommonSteps extends BasePage {

  public void open(){
      driver.get(BASE_URL);
  }

    public void  close(){
        driver.quit();
    }
}
