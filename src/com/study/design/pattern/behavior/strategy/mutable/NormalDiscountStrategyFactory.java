package com.study.design.pattern.behavior.strategy.mutable;

import com.study.design.pattern.behavior.strategy.IDiscountStrategy;
import com.study.design.pattern.behavior.strategy.NormalDiscountStrategy;

/**
 * @author wuwei
 * @title: NormalDiscountStrategyFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 22:00
 */
public class NormalDiscountStrategyFactory implements IDiscountStrategyFactory {
    @Override
    public IDiscountStrategy getDiscountStrategy() {
        return new NormalDiscountStrategy();
    }
}
