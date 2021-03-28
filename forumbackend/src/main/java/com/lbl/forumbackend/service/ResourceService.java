package com.lbl.forumbackend.service;

import com.lbl.forumbackend.pojo.Resource;

import java.util.List;

public interface ResourceService {
    List<Resource> getAllResources();
    List<Resource> getResourcesByType(String type);
    List<Resource> getResourcesByName(String name);
    List<Resource> getResourcesByTime(List<String> dateList);
    void saveResource(Resource resource);
    List<Object> getResourceTypes();
}
