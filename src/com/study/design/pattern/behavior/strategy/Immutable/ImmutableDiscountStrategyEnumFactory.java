package com.study.design.pattern.behavior.strategy.Immutable;

import com.study.design.pattern.behavior.strategy.*;

/**
 * @author wuwei
 * @title: DiscountStrategyEnumFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-21 18:56
 */
public enum ImmutableDiscountStrategyEnumFactory {
    NORMAL(DiscountType.NORMAL, new NormalDiscountStrategy()),
    GROUP(DiscountType.GROUP, new GroupDiscountStrategy()),
    PROMOTION(DiscountType.PROMOTION, new PromotionDiscountStrategy());

    private DiscountType type;
    private IDiscountStrategy strategy;
    ImmutableDiscountStrategyEnumFactory(DiscountType discountType, IDiscountStrategy strategy) {
        this.type = discountType;
        this.strategy = strategy;
    }

    public static IDiscountStrategy getDiscountStrategyByType(DiscountType type) {
//        Log.d(DiscountStrategyEnumFactory.class, "input type is " + type);
        ImmutableDiscountStrategyEnumFactory[] enumFactories = values();
        for (ImmutableDiscountStrategyEnumFactory factory : enumFactories) {
//            Log.d(DiscountStrategyEnumFactory.class, "current type is " + factory.type);
            if (factory.type == type) {
                return factory.strategy;
            }
        }
        return null;
    }
}
