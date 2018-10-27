package com.mcommerce.eurekaserver.configurations;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SleuthConfig {

    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}