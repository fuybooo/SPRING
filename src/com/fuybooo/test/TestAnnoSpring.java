package com.fuybooo.test;

import com.fuybooo.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAnnoSpring {
    @Autowired
    Category c;
    @Test
    public void test() {
        System.out.println(c.getName());
    }
}
