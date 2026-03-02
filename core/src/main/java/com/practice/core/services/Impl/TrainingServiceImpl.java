package com.practice.core.services.Impl;
import org.osgi.service.component.annotations.Component;
import com.practice.core.services.TrainingService;
@Component(service=TrainingService.class)
public class TrainingServiceImpl implements TrainingService{
    @Override
    public String getMessage(String name){
        return name + "Chauhan";
    }
}