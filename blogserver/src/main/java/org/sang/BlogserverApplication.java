package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 *  进入网址localhost:8089/index.html
 */
@SpringBootApplication
@EnableScheduling//开启定时任务支持
public class BlogserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogserverApplication.class, args);
    }
}
 