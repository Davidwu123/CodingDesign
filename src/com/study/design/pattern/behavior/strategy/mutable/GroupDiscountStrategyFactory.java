package com.study.design.pattern.behavior.strategy.mutable;

import com.study.design.pattern.behavior.strategy.GroupDiscountStrategy;
import com.study.design.pattern.behavior.strategy.IDiscountStrategy;

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
