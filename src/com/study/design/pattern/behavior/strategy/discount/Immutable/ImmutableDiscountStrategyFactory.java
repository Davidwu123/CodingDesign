package com.study.design.pattern.behavior.strategy.discount.Immutable;

import com.study.design.pattern.behavior.strategy.discount.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuwei
 * @title: DiscountStrategyFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 21:55
 */
public class ImmutableDiscountStrategyFactory {
    private static final Map<DiscountType, IDiscountStrategy> sDiscountStrategies
            = new HashMap<>();
    static {
        sDiscountStrategies.putIfAbsent(DiscountType.NORMAL, new NormalDiscountStrategy());
        sDiscountStrategies.putIfAbsent(DiscountType.GROUP, new GroupDiscountStrategy());
        sDiscountStrategies.putIfAbsent(DiscountType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static IDiscountStrategy getDiscountStrategy(DiscountType type) {
        return sDiscountStrategies.get(type);
    }
}
