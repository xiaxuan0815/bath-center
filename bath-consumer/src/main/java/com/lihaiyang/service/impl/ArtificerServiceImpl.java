package com.lihaiyang.service.impl;

import com.lihaiyang.client.ArtificerClient;
import com.lihaiyang.entity.Artificer;
import com.lihaiyang.service.ArtificerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lihaiyang
 * @since 2020-11-06
 */
@Service
public class ArtificerServiceImpl implements ArtificerService {
/*    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private LoadBalancerClient loadBalancerClient;*/
    @Autowired
    private ArtificerClient artificerClient;

    @Override
    public List<Artificer> list() {
     /*   List<ServiceInstance> instances = discoveryClient.getInstances("bath-service");
     *//*   ServiceInstance instance = instances.get(0);
        String host = instance.getHost();
        int port = instance.getPort();*//*
     *//*   return restTemplate.getForObject("http://"+host+":"+port+"/artificer/list",List.class);*//*
        return restTemplate.getForObject("http://bath-service/artificer/list",List.class);*/
        return artificerClient.list();
    }

    @Override
    public Artificer getById(Long id) {
       /* List<ServiceInstance> instances = discoveryClient.getInstances("bath-service");
        ServiceInstance instance = instances.get(0);
        String host = instance.getHost();
        int port = instance.getPort();
        Artificer artificer = restTemplate.getForObject("http://"+host+":"+port+"/artificer/get-by-id?id="+id, Artificer.class);
        return artificer;*/
       return artificerClient.getById(id);
    }
}