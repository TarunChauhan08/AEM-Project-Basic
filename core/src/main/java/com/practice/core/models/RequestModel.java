package com.practice.core.models;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import com.practice.core.services.TrainingService;
import org.apache.sling.models.annotations.injectorspecific.*;
import org.apache.sling.api.SlingHttpServletRequest;

@Model(
        adaptables = SlingHttpServletRequest.class
)
public class RequestModel {

    @RequestAttribute
    private String fullName;
    @OSGiService
    private TrainingService trainingService;
    public String getFullName() {
       return trainingService.getMessage(fullName);
    }
}