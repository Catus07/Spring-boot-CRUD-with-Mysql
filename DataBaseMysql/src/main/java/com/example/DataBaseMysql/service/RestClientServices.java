package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.JsonModel;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RestClientServices {
   // @PostConstruct
    public void getPostData(){
        RestClient restClient = RestClient.create();
        JsonModel post = restClient.get()
                .uri("https://jsonplaceholder.typicode.com/posts/2")
                .retrieve()
                .body(JsonModel.class);
        System.out.println("Title: "+post.getTitle());
        System.out.println("Body"+ post.getBody());
    }
   // @PostConstruct
    public void getPostDataTwo(){
        RestClient restClient = RestClient.create();
        JsonModel post = restClient.get()
                .uri("https://jsonplaceholder.typicode.com/posts/2")
                .retrieve()
                .body(JsonModel.class);
        System.out.println("Title: "+post.getTitle());
        System.out.println("Body"+ post.getBody());
    }


}
