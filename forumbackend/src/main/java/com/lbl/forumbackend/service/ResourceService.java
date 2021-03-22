package com.lbl.forumbackend.service;

import com.lbl.forumbackend.pojo.Resource;

import java.util.Date;
import java.util.List;

public interface ResourceService {
    List<Resource> getAllResources();
    List<Resource> getResourcesByType(String type);
    List<Resource> getResourcesByName(String name);
    List<Resource> getResourcesByTime(List<Date> dateList);
    void saveResource(Resource resource);
}
