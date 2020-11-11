package com.lihaiyang;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerStarter {
       public static void main(String[] args) {
           SpringApplication.run(ConsumerStarter.class,args);
       }

       @Bean
       //开启负载均衡
       @LoadBalanced
       public RestTemplate restTemplate(){
           return new RestTemplate();
       }

       @Bean
       public IRule iRule(){
            return new RandomRule();
       }
}
