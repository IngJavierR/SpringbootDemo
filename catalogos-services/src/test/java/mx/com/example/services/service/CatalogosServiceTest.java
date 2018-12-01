package mx.com.example.services.service;

import mx.com.example.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class CatalogosServiceTest extends BaseTest {

    @Test
    public void exampleTest() {

        var users = this.catalogosService.getUsers();

        Assert.assertEquals(1, users.size());
    }
}
