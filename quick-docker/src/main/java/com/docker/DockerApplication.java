package com.docker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * User: vector
 * Data: 2018/1/17
 * Time: 13:49
 * Description:
 */
@SpringBootApplication
@RestController
@Slf4j
public class DockerApplication {

    @RequestMapping("/hello")
    public String hello() {
        log.info("接收到请求》》》》》》》》》》》》》》》》》》》》》》》");
        return "<h1>Hello Spring-Boot Maven Docker</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class);
    }
}
