package com.pratyush.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/api")
public class DBController {

    @Autowired
    private DBServices dbServices;
    @GetMapping("/info")
    public List<POJO> getInfo(){

        return dbServices.getRepo();
    }
    @PostMapping("/info")
    public void postInfo(@RequestBody POJO pojo){
        dbServices.postRepo(pojo);
    }
    @GetMapping("/info/{id}")
    public POJO getById(@PathVariable String id){

        return dbServices.getById(id).orElse(null);
    }
    @DeleteMapping("/info")
    public void delete(){
        dbServices.deleteRepo();
    }
}
