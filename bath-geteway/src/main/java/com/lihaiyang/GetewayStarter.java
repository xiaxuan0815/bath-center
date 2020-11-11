package com.lihaiyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetewayStarter {
       public static void main(String[] args) {
           SpringApplication.run(GetewayStarter.class,args);
       }
}
