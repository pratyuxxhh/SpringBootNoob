package com.pratyush.first;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class POJO {
    @Id
    private String id;
    private String name;
    private String branch;
    private String usn;





}
