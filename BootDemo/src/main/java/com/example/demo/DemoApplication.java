package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//来标注一个主程序类，说明是一个SpringBoot应用
public class DemoApplication {

    public static void main(String[] args) {
		//Spring应用启动起来
        SpringApplication.run(DemoApplication.class, args);
    }

}

