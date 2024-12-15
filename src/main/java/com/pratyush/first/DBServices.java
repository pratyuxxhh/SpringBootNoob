package com.pratyush.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DBServices {
    @Autowired
    private DBRepository dbRepository;

    public void postRepo(POJO p){
        dbRepository.save(p);
    }

    public List<POJO> getRepo(){
        return dbRepository.findAll();
    }
    public Optional<POJO> getById(String id){
        return dbRepository.findById(id);
    }
    public void deleteRepo(){
        dbRepository.deleteAll();
    }

}
