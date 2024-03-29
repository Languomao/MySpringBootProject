package com.lan.korment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Classname SpringBoot01HelloQuickApplication
 * Description TODO
 * Date 2019/11/29 16:47
 * Created by LanKorment
 */
//@ImportResource(locations={"classpath:bean.xml"})
@SpringBootApplication
public class SpringBoot01HelloQuickApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01HelloQuickApplication.class, args);
    }
}
