package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = {"com.example.implementation",
"com.example.Services"})
@ComponentScan(basePackageClasses = {com.example.beans.Vehicle.class,
com.example.beans.Person.class})
        public class ProjectConfig
{
}

