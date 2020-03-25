package com.study.design.pattern.behavior.strategy.discount.mutable;

import com.study.design.pattern.behavior.strategy.discount.GroupDiscountStrategy;
import com.study.design.pattern.behavior.strategy.discount.IDiscountStrategy;

/**
 * @author wuwei
 * @title: GroupDiscountStrategyFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 22:02
 */
public class GroupDiscountStrategyFactory implements IDiscountStrategyFactory {
    @Override
    public IDiscountStrategy getDiscountStrategy() {
        return new GroupDiscountStrategy();
    }
}
