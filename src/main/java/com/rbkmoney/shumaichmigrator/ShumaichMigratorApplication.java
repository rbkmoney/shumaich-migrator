package com.rbkmoney.shumaichmigrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ShumaichMigratorApplication extends SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShumaichMigratorApplication.class, args);
    }

}
