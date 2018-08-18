package com.it.Testes;

import com.it.App;
import com.it.Utils.User;
import com.it.Utils.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

   protected static App app = new App();
   protected static User validUser = UserFactory.getValidUser();

    @AfterSuite
    public void tearDown() {

        app.common.close();

    }

    @BeforeSuite
    public void setUp() {

        app.common.open();


    }
}
