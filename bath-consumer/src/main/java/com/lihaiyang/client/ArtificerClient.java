package com.lihaiyang.client;

import com.lihaiyang.entity.Artificer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(value = "bath-service"
        ,path = "artificer"
,fallback = ArtificerClientFallBack.class)
public interface ArtificerClient {
    @GetMapping("list")
    List<Artificer> list();

    @GetMapping("get-by-id")
    Artificer getById(@RequestParam("id") Long id);
}
