package com.southwind.feign.impl;

import com.southwind.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}
