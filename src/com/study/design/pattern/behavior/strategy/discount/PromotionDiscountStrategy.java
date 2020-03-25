package com.study.design.pattern.behavior.strategy.discount;

/**
 * @author wuwei
 * @title: PromotionDiscountStrategy
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 21:51
 */
public class PromotionDiscountStrategy implements IDiscountStrategy {
    @Override
    public double calDiscount() {
        return 0.4;
    }
}
