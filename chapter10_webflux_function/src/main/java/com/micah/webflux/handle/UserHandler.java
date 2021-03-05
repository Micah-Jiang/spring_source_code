package com.micah.webflux.handle;

import com.micah.webflux.entity.User;
import com.micah.webflux.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

/**
 * @Author m.kong
 * @Date 2021/3/2 上午11:49
 * @Version 1.0
 */
public class UserHandler {
    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    /**
     * 根据id查询用户
     */
    public Mono<ServerResponse> getUserById(ServerRequest request) {
        // 获取id值
        int id = Integer.parseInt(request.pathVariable("id"));
        // 空值处理
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();

        // 调用Service方法得到数据
        Mono<User> userMono = this.userService.getUserById(id);
        // 把userMono进行转换返回
        // 使用reactor操作符floatMap
        return userMono.flatMap(person -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(fromObject(person)))
                .switchIfEmpty(notFound);
    }

    /**
     * 查询所有
     */
    public Mono<ServerResponse> getAllUsers(ServerRequest request) {
        // 调用service得到结果
        Flux<User> allUser = this.userService.getAllUser();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(allUser, User.class);

    }

    /**
     * 添加User
     */
    public Mono<ServerResponse> addUser(ServerRequest request) {
        // 得到User对象
        Mono<User> mono = request.bodyToMono(User.class);
        return ServerResponse.ok().build(this.userService.saveUserInfo(mono));
    }
}
