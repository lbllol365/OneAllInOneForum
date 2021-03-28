package com.lbl.forumbackend.service.impl;

import com.lbl.forumbackend.pojo.Resource;
import com.lbl.forumbackend.service.ResourceService;
import com.lbl.forumbackend.util.MongoDBSearchUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        return mongoTemplate.find(MongoDBSearchUtil.getQueryWithColName("type", type), Resource.class);
    }

    @Override
    public List<Resource> getResourcesByName(String name) {
        return mongoTemplate.find(MongoDBSearchUtil.getQueryWithColName("name", name), Resource.class);
    }

    @Override
    public List<Resource> getResourcesByTime(List<String> dateList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startTime = LocalDateTime.parse(dateList.get(0), formatter);
        LocalDateTime endTime = LocalDateTime.parse(dateList.get(1), formatter);
        Criteria criteria = Criteria.where("getDate").gte(startTime).lte(endTime);
        Query query = new Query();
        query.addCriteria(criteria);
        return mongoTemplate.find(query, Resource.class);
    }

    @Override
    public void saveResource(Resource resource) {
        mongoTemplate.insert(resource);
    }
}
