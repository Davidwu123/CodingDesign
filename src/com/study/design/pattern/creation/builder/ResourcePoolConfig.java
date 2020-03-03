package com.study.design.pattern.creation.builder;

/**
 * @author wuwei
 * @title: ResourcePoolConfig
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-26 10:30
 */
public class ResourcePoolConfig {
    private String name;
    private int minIdle;
    private int maxIdle;
    private int maxTotal;

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.minIdle = builder.minIdle;
        this.maxIdle = builder.maxIdle;
        this.maxTotal = builder.maxTotal;
    }

    @Override
    public String toString() {
        return "ResourcePoolConfig{" +
                "name='" + name + '\'' +
                ", minIdle=" + minIdle +
                ", maxIdle=" + maxIdle +
                ", maxTotal=" + maxTotal +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public static class Builder {
        private static final int DEFAULT_MIN_IDLE = 2;
        private static final int DEFAULT_MAX_IDLE = 5;
        private static final int DEFAULT_MAX_TOTAL = 8;
        private String name;
        private int minIdle = DEFAULT_MIN_IDLE;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int maxTotal = DEFAULT_MAX_TOTAL;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 可选设置
         * @param minIdle
         * @return
         */
        public Builder setMinIdle(int minIdle) {
            this.minIdle = minIdle;
            return this;
        }

        /**
         * 可选设置
         * @param maxIdle
         * @return
         */
        public Builder setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
            return this;
        }

        /**
         * 可选设置
         * @param maxTotal
         * @return
         */
        public Builder setMaxTotal(int maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }

        public ResourcePoolConfig build() {
            //这里可以有可以参数合法性，依赖性等业务性检查
            if (name == null || name.equals("")) {
                throw new IllegalArgumentException("invalid name");
            }
            if (minIdle < 0) {
                throw new IllegalArgumentException("invalid minIdle");
            }
            if (maxIdle < 0) {
                throw new IllegalArgumentException("invalid maxIdle");
            }
            if (maxTotal < 0) {
                throw new IllegalArgumentException("invalid maxTotal");
            }
            if (maxTotal < minIdle || maxTotal < maxIdle) {
                throw new IllegalArgumentException("invalid maxTotal");
            }
            return new ResourcePoolConfig(this);
        }
    }
}
