package com.study.design.pattern.builder;

/**
 * @author wuwei
 * @title: ConstructorArg
 * @projectName CodingDesign
 * @description: 当 isRef 为 true 的时候，arg 表示 String 类型的 refBeanId，type 不需要设置；当 isRef 为 false 的时候，arg、type 都需要设置。请根据这个需求，完善 ConstructorArg 类。
 * @date 2020-02-26 11:21
 */
public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    private ConstructorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.arg = builder.arg;
        this.type = builder.type;
    }

    @Override
    public String toString() {
        return "ConstructorArg{" +
                "isRef=" + isRef +
                ", type=" + type +
                ", arg=" + arg +
                '}';
    }

    public static class Builder {
        private boolean isRef;
        private Class type;
        private Object arg;

        public Builder setRef(boolean ref) {
            isRef = ref;
            return this;
        }

        public Builder setType(Class type) {
            this.type = type;
            return this;
        }

        public Builder setArg(Object arg) {
            this.arg = arg;
            return this;
        }

        public ConstructorArg build() {
            if (arg == null) throw new IllegalArgumentException("invalid arg, can not be null");
            if (!isRef) {
                if (type == null) throw new IllegalArgumentException("invalid type, can not be null");
            } else if(!(arg instanceof String)) {
                  throw new IllegalArgumentException("invalid type of arg");
            }
            return new ConstructorArg(this);
        }
    }
}
