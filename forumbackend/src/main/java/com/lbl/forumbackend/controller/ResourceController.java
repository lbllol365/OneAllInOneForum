package com.lbl.forumbackend.controller;


import com.lbl.forumbackend.pojo.Resource;
import com.lbl.forumbackend.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    private ResourceService service;

    @GetMapping("getAll")
    public List<Resource> getAllResources() {
        return service.getAllResources();
    }

    @GetMapping("save")
    public void saveResource() {
        Resource resource = new Resource();
        resource.setName("test");
        resource.setUrl("https://www.bing.com");
        resource.setType("网页");
        resource.setGetDate(new Date());
        service.saveResource(resource);
    }

    @PostMapping("getByName")
    public List<Resource> getByName(@RequestBody String name) {
        return service.getResourcesByName(name);
    }

    @GetMapping("getType")
    public List<Object> getResourceType() {
        return service.getResourceTypes();
    }

    @PostMapping("getByType")
    public List<Resource> getByType(@RequestBody String type) {
        return service.getResourcesByType(type);
    }

    @GetMapping("getOne")
    public List<Resource> getOneResource() {
        return service.getResourcesByName("test");
    }
}
