package com.study.design.pattern.behavior.strategy.discount;


/**
 * @author wuwei
 * @title: NormalDiscountStrategy
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 21:50
 */
public class NormalDiscountStrategy implements IDiscountStrategy {
    @Override
    public double calDiscount() {
        return 0.9;
    }
}
