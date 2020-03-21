package com.study.design.pattern.behavior.strategy.mutable;

import com.study.design.pattern.behavior.strategy.IDiscountStrategy;

/**
 * @author wuwei
 * @title: IDiscountStrategyFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 22:01
 */
public interface IDiscountStrategyFactory {
    IDiscountStrategy getDiscountStrategy();
}
