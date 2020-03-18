package com.study.design.pattern.behavior.observer.eventbus;

import com.sun.istack.internal.Nullable;

import static java.lang.String.format;

/**
 * @author wuwei
 * @title: Preconditions
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-17 09:32
 */
public class Preconditions {

    //检查参数（expression）是否合法，若为false，抛出IllegalArgumentException异常
    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    //检查入参，带异常信息
    public static void checkArgument(boolean expression, @Nullable Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    /**
     *
     * @param expression 判断表达式
     * @param errorMessageTemplate 表示异常信息模板
     * @param errorMessageArgs 将被替换为信息模板中的参数
     */
    public static void checkArgument(boolean expression, @Nullable String errorMessageTemplate, @Nullable Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalArgumentException(format(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static Object checkNotNull(Object object) {
        if (object == null) {
            throw new NullPointerException("obj is null");
        } else {
            return object;
        }
    }
}
