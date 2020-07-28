package com.study.design.functionProgramming;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author wuwei
 * @title: Test
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-05-17 14:53
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("");
        Optional result = Stream.of("f", "ba", "hello")
                .map(s -> s.length())
                .filter(l -> l <= 3)
                .max((o1, o2) -> o1-o2);
        System.out.println(result.get()); // 输出2
    }
}
