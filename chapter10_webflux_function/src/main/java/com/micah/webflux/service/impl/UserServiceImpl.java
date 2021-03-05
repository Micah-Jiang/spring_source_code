package com.micah.webflux.service.impl;

import com.micah.webflux.entity.User;
import com.micah.webflux.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author m.kong
 * @Date 2021/3/2 上午10:43
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    // 创建一个Map集合，来存储模拟数据
    private final Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1, new User("Micah","男",22));
        this.users.put(2, new User("Maruko","女",19));
    }

    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(person -> {
            // 向map中存放值
            int id = users.size() + 1;
            users.put(id, person);
        }).thenEmpty(Mono.empty());
    }
}
