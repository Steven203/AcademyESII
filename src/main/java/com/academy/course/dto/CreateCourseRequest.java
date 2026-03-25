package com.academy.course.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateCourseRequest {

    @NotBlank(message = "name is required")
    @Size(max = 150, message = "name must be <= 150 chars")
    private String name;

    @Size(max = 1000, message = "description must be <= 1000 chars")
    private String description;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}