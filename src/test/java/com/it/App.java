package com.it;

import com.it.Steps.CommonSteps;
import com.it.Steps.HomeSteps;
import com.it.Steps.LoginSteps;
import com.it.Steps.SendMessageSteps;

public class App {

    public CommonSteps common;
    public LoginSteps login;
    public HomeSteps home;
    public SendMessageSteps message;

    public App() {
        common = new CommonSteps();
        login = new LoginSteps();
        home = new HomeSteps();
        message = new SendMessageSteps();
    }


}
