package com.micah.webflux.server;

import com.micah.webflux.handle.UserHandler;
import com.micah.webflux.service.UserService;
import com.micah.webflux.service.impl.UserServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;

import java.io.IOException;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

/**
 * @Author m.kong
 * @Date 2021/3/2 下午2:09
 * @Version 1.0
 */
public class Server {
    // 1、创建Router路由
    public RouterFunction<ServerResponse> routingFunction(){
        UserService userService = new UserServiceImpl();
        UserHandler userHandler = new UserHandler(userService);

        //设置路由
        return RouterFunctions.route(GET("/users/{id}").and(accept(MediaType.APPLICATION_JSON)),
                userHandler::getUserById).andRoute(GET("/users").and(accept(MediaType.APPLICATION_JSON)),userHandler::getAllUsers);
    }

    // 2 创建服务器完成适配
    public void createReactorServer() {
         // 路由和handler适配
        RouterFunction<ServerResponse> route = routingFunction();
        HttpHandler httpHandler = toHttpHandler(route);

        ReactorHttpHandlerAdapter handlerAdapter = new ReactorHttpHandlerAdapter(httpHandler);

        // 创建服务器
        HttpServer httpServer = HttpServer.create();
        httpServer.handle(handlerAdapter).bindNow();
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.createReactorServer();
        System.out.println("enter to exit");
        System.in.read();
    }
}
