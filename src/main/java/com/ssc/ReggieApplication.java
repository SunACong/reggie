package com.ssc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @ClassName ReggieApplication
 * @Authoc 孙少聪
 * @Date 2022/8/19 11:10:54
 */

@Slf4j
@ServletComponentScan // 扫描过滤器
@SpringBootApplication
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
        log.info("项目启动成功......");
    }
}