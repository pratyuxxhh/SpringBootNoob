package com.pratyush.first;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface DBRepository  extends MongoRepository<POJO,String> {

}
