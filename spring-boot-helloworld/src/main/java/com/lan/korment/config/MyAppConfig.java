package com.lan.korment.config;

import com.lan.korment.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyAppConfig
 * @Description TODO
 * @Date 2019/12/1 0001 22:30
 * @Created by Administrator
 *
 * @Configuration：指明当前类是一个配置类；就是来代替之前的Spring配置文件
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {
    //将方法的返回值添加到容器中；容器这个组件id就是方法名
    @Bean
    public HelloService helloService01(){
        //System.out.println("配置类给容器添加了HelloService组件");
        return new HelloService();
    }
}
