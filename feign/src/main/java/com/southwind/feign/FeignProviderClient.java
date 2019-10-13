package com.southwind.feign;


import com.southwind.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
//使用注解@FeignClient 定义feign客户端 ;
@FeignClient(value = "provider",fallback = FeignError.class)  //feign访问的哪个服务
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection findAll();

    @GetMapping("/student/index")
    public String index();
}
