package mx.com.example.web.rest;

import mx.com.example.web.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class HelloControllerTest extends BaseTest {

    @Test
    public void exampleTest() {

        //this.entityManager.persist(new UserDO("Javier", "Rodriguez", 1));

        var users = this.catalogosFacade.getAllUsers();

        Assert.assertEquals(1, users.size());
    }
}
