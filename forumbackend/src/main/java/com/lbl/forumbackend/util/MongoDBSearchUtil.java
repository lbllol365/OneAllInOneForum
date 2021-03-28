package com.lbl.forumbackend.util;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class MongoDBSearchUtil {
    public static Query getQueryWithColName(String name, String value) {
        Query query = new Query();
        query.addCriteria(Criteria.where(name).is(value));
        return query;
    }
}
