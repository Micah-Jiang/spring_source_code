package com.micah.reactor.test;

import org.junit.Test;
import reactor.core.publisher.Mono;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * @Author m.kong
 * @Date 2021/3/2 上午10:56
 * @Version 1.0
 */
public class MonoTest {
    /**
     * 取出Mono<Object obj>中的元素
     */
    @Test
    public void getMonoElem() {
        // 添加元素
        Mono<String> mono = Mono.just("get element from Mono");
        mono.subscribe();

        Optional<String> result = Mono.<String>empty().blockOptional();
        assertEquals(Optional.empty(), result);
    }
}
