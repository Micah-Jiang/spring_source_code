package com.micah.reactor.reactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author m.kong
 * @Date 2021/3/2 上午9:24
 * @Version 1.0
 */
public class FluxMono {
    public static void main(String[] args) {
        /*
          just方法直接声明
          Mono 0～1个元素
          Flux: 多个元素，声明数据流的方式
         */
        Flux.just(1, 2, 3, 4).subscribe(System.out::print);
        Mono.just(1).subscribe(System.out::print);

        /*// 数组
        Integer[] array = {1, 2, 3, 4};
        Flux.fromArray(array);

        // 集合
        List<Integer> list = Arrays.asList(array);
        Flux.fromIterable(list);

        // 数据流
        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);*/
    }
}
