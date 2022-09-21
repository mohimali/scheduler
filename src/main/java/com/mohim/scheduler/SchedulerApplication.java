package com.mohim.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Instant;

@SpringBootApplication
@EnableScheduling
public class SchedulerApplication {

    // fixedDelay in milliseconds, cron can also be used
    @Scheduled(fixedDelay = 1000)
    public void doSomethingAtIntervals(){
        System.out.println("Time: ".concat(Instant.now().toString()));

    }

    public static void main(String[] args) {
        SpringApplication.run(SchedulerApplication.class, args);
    }

}
