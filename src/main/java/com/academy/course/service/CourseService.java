package com.academy.course.service;

import com.academy.course.dto.CourseResponse;
import com.academy.course.dto.CreateCourseRequest;

import java.util.List;

public interface CourseService {
    CourseResponse create(CreateCourseRequest request);
    List<CourseResponse> list();
}