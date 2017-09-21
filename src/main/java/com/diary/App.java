package com.diary;

import com.diary.entity.States;
import com.diary.service.DiaryService;
import com.diary.util.SetupNigeria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    CommandLineRunner start(DiaryService service) {
        return args -> {
            log.info("@@ Inserting Data....");

            SetupNigeria.setUpNigeriaBasic(service);
            SetupNigeria.setUpNigeriaEconomy(service);
            SetupNigeria.setUpRegion(service);
            SetupNigeria.setUpStates(service);
        };
    }
}
