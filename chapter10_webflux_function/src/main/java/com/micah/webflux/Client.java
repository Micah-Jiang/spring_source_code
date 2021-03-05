package com.micah.webflux;

import com.micah.webflux.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


/**
 * @Author m.kong
 * @Date 2021/3/2 下午3:02
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 调用服务器地址
        WebClient webClient = WebClient.create("http://localhost:52919");
        // 根据id查询
        String id = "1";
        User userRes = webClient.get().uri("/users/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(User.class)
                .block();
        System.out.println(userRes.getName());
    }
}

