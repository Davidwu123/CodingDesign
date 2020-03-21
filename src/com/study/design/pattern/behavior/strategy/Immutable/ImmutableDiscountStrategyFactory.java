package com.study.design.pattern.behavior.strategy.Immutable;

import com.study.design.pattern.behavior.strategy.*;

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
    private static final Map<DiscountType, IDiscountStrategy> sDiscountStrategys
            = new HashMap<>();
    static {
        sDiscountStrategys.putIfAbsent(DiscountType.NORMAL, new NormalDiscountStrategy());
        sDiscountStrategys.putIfAbsent(DiscountType.GROUP, new GroupDiscountStrategy());
        sDiscountStrategys.putIfAbsent(DiscountType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static IDiscountStrategy getDiscountStrategy(DiscountType type) {
        return sDiscountStrategys.get(type);
    }
}
