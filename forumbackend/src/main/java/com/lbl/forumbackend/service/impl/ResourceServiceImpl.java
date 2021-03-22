package com.lbl.forumbackend.service.impl;

import com.lbl.forumbackend.pojo.Resource;
import com.lbl.forumbackend.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Resource> getAllResources() {
        return mongoTemplate.findAll(Resource.class);
    }

    @Override
    public List<Resource> getResourcesByType(String type) {
        return null;
    }

    @Override
    public List<Resource> getResourcesByName(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is("test"));
        return mongoTemplate.find(query, Resource.class);
    }

    @Override
    public List<Resource> getResourcesByTime(List<Date> dateList) {
        return null;
    }

    @Override
    public void saveResource(Resource resource) {
        mongoTemplate.insert(resource);
    }
}
