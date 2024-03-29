package com.lan.korment;

import com.lan.korment.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring Boot的单元你测试
 * 可以在测试期间 方便的类似编码一样进行自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void testHelloService01(){
        boolean b = ioc.containsBean("helloService01");
        System.out.println(b);
    }

}
