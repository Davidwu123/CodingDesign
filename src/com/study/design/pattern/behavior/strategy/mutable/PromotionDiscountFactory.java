package com.study.design.pattern.behavior.strategy.mutable;

import com.study.design.pattern.behavior.strategy.IDiscountStrategy;
import com.study.design.pattern.behavior.strategy.PromotionDiscountStrategy;

/**
 * @author wuwei
 * @title: PromotionDiscountFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 22:02
 */
public class PromotionDiscountFactory implements IDiscountStrategyFactory {
    @Override
    public IDiscountStrategy getDiscountStrategy() {
        return new PromotionDiscountStrategy();
    }
}
