package com.ycl.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 *  @SpringBootConfiguration:Spring Boot的配置类；
 *
 * ​		标注在某个类上，表示这是一个Spring Boot的配置类；
 * ​		@Configuration:配置类上来标注这个注解；
 * ​			配置类 -----  配置文件；配置类也是容器中的一个组件；@Component
 * @EnableAutoConfiguration：开启自动配置功能；
 *      @EnableAutoConfiguration告诉SpringBoot开启自动配置功能；这样自动配置才能生效；
 *          @AutoConfigurationPackage：自动配置包
 * ​		@Import(AutoConfigurationPackages.Registrar.class)：
 * ​		Spring的底层注解@Import，给容器中导入一个组件；导入的组件由AutoConfigurationPackages.Registrar.class；
==将主配置类（@SpringBootApplication标注的类）的所在包及下面所有子包里面的所有组件扫描到Spring容器；==

 */
@SpringBootApplication
public class SpringdemoApplication {
  /*  SpringBoot就应该运行这个类的main方法来启动SpringBoot应用；*/
    public static void main(String[] args) {
        SpringApplication.run(SpringdemoApplication.class, args);
    }

}
