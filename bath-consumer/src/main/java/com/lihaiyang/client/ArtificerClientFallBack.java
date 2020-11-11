package com.lihaiyang.client;

import com.lihaiyang.entity.Artificer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtificerClientFallBack implements ArtificerClient{
    @Override
    public List<Artificer> list() {

        return null;
    }

    @Override
    public Artificer getById(Long id) {
        return null;
    }

/*    @Override
    public Artificer getById(@RequestParam("id") Long id) {
        Artificer artificer = new Artificer();
        artificer.setName("页面丢失405");
        return artificer;
    }*/
}
