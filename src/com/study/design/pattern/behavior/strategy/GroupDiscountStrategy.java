package com.study.design.pattern.behavior.strategy;

/**
 * @author wuwei
 * @title: GroupDiscountStrategy
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 21:51
 */
public class GroupDiscountStrategy implements IDiscountStrategy {
    @Override
    public double calDiscount() {
        return 0.7;
    }
}
