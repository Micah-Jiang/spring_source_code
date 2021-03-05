package com.micah.webflux.service;

import com.micah.webflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author m.kong
 * @Date 2021/3/2 上午10:37
 * @Version 1.0
 * @Description 用户操作接口
 */
public interface UserService {
    /**
     * 根据id查询用户
     * @param id 主键
     * @return 指定id的用户
     */
    Mono<User> getUserById(int id);


    /**
     * 查询所有用户
     * @return 用户集合
     */
    Flux<User> getAllUser();

    /**
     * 添加一个用户
     * @param user 插入的用户
     * @return 无返回值
     */
    Mono<Void> saveUserInfo(Mono<User> user);
}
