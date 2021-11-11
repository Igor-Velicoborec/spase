package com.spase.spase;


import com.spase.spase.controller.LordController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpaseApplicationTests {

    @Autowired
    private LordController lordController;


    @Test
    void contextLoads() {

        Assert.notNull(lordController.getAll().toString(), "Lords not be created");
        Assert.notNull(lordController.getLordsSortByAndLimit("age", 1).toString());
    }

}

