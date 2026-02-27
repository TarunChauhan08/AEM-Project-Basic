package com.practice.core.models;

import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.SlingHttpServletRequest;

@Model(adaptables = SlingHttpServletRequest.class)
public class RequestModel {

    @RequestAttribute
    private String message;

    public String getMessage() {
        return message + " Chauhan";
    }
}
