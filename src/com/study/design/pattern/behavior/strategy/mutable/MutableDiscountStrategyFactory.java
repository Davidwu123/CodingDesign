package com.study.design.pattern.behavior.strategy.mutable;

import com.study.design.pattern.behavior.strategy.DiscountType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuwei
 * @title: MutableDiscountStrategyFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 22:03
 */
public class MutableDiscountStrategyFactory {
    private static final Map<DiscountType, IDiscountStrategyFactory> sDiscountStrategyFactorys
            = new HashMap<>();
    static {
        sDiscountStrategyFactorys.putIfAbsent(DiscountType.NORMAL, new NormalDiscountStrategyFactory());
        sDiscountStrategyFactorys.putIfAbsent(DiscountType.GROUP, new GroupDiscountStrategyFactory());
        sDiscountStrategyFactorys.putIfAbsent(DiscountType.PROMOTION, new PromotionDiscountFactory());
    }

    public static IDiscountStrategyFactory getDiscountStrategyFactory(DiscountType type) {
        return sDiscountStrategyFactorys.get(type);
    }
}
