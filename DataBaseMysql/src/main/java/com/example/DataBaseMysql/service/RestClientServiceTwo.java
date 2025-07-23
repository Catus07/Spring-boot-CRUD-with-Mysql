package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.JsonModel;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class RestClientServiceTwo {
    public JsonModel getJsonModel(){
        RestClient restClient = RestClient.create();
        JsonModel jsonModel = restClient.get()
                .uri("https://jsonplaceholder.typicode.com/posts/1")
                .retrieve().body(JsonModel.class);
        return jsonModel;
        //RestClient restClient = RestClient.builder().baseUrl().build();
        // Model model = client.get().url("/post/1").retrieve().body(model.class)
    }
    public List<JsonModel> externalApi2(){
        RestClient client = RestClient.create();
          List<JsonModel> jsonModel =client.get()
                .uri("https://jsonplaceholder.typicode.com/posts")
                .retrieve().body(new ParameterizedTypeReference<List<JsonModel>>() {
                  });
          return jsonModel;
    }
    public JsonModel update(JsonModel jsonModel){
        RestClient restClient = RestClient.create();
        jsonModel = restClient.put()
                .uri("https://jsonplaceholder.typicode.com/posts/1")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve().onStatus(HttpStatusCode::is4xxClientError,( request,response) ->{
                    throw new RuntimeException("Client error");
                } )
                .onStatus(HttpStatusCode::is5xxServerError,(request, response) -> {
                    throw new RuntimeException("server error");
                })
                .body(JsonModel.class);
        return jsonModel;
    }

}
