package com.it.Testes;

import com.it.Utils.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test

        public void test1() throws InterruptedException {
            UserFactory.getRandomUsers(10)
                    .forEach(System.out::println);
            app.login.login(validUser.getLogin(),validUser.getPassword());
            Assert.assertEquals(app.home.getLabelUserEmail(), validUser.getEmail());

    }

}
