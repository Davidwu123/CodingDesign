package com.study.design.pattern.behavior.strategy.discount.mutable;

import com.study.design.pattern.behavior.strategy.discount.DiscountType;
import com.study.design.pattern.behavior.strategy.discount.GroupDiscountStrategy;
import com.study.design.pattern.behavior.strategy.discount.IDiscountStrategy;
import com.study.design.pattern.behavior.strategy.discount.NormalDiscountStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuwei
 * @title: MutableDiscountStrategyReflectFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-21 19:22
 */
public class MutableDiscountStrategyReflectFactory {
    private static final Map<DiscountType, Class<?>> strategyFactories =
            new HashMap<>();

    static {
        strategyFactories.put(DiscountType.NORMAL, NormalDiscountStrategy.class);
        strategyFactories.put(DiscountType.GROUP, GroupDiscountStrategy.class);
        strategyFactories.put(DiscountType.PROMOTION, PromotionDiscountFactory.class);
    }

    public static IDiscountStrategy getDiscountStrategyByType(DiscountType type) {
        return (IDiscountStrategy) createObjByClass(strategyFactories.get(type));
    }


    /**
     * 如果strategy的创建过程比较复杂，还是推荐使用工厂方法，否则通过反射创建还是比较复杂
     * @param clazz
     * @return
     */
    private static Object createObjByClass(Class clazz) {
        Object obj = null;
        try {
            obj = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
