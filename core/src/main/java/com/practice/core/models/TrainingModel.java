package com.practice.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import com.practice.core.services.TrainingService;
import org.apache.sling.models.annotations.injectorspecific.*;

@Model(adaptables=Resource.class)
public class TrainingModel{

   @ValueMapValue
   private String courseType;
    @ValueMapValue
    private String courseDuration;
    @ValueMapValue
    private String courseTitle;

    public String getMessage() {
        return trainingService.getMessage("Tarun");
    }

    @OSGiService
    private TrainingService trainingService;

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
}