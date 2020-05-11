package com.digi.registerstub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;

@SpringBootApplication
@EnableStubRunnerServer
public class RegisterstubApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterstubApplication.class, args);
    }
    @AutoConfigureStubRunner
    static class Config {}

}
