package com.gl.app;

import com.gl.config.Config;
import org.springframework.boot.SpringApplication;



public class PmsApplication  {

    public static void main(String[] args)
    {
        SpringApplication.run(Config.class, args);
    }

}
