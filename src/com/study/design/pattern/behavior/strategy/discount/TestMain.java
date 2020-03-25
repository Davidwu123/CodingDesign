package com.study.design.pattern.behavior.strategy.discount;

import com.study.design.common.Log;
import com.study.design.pattern.behavior.strategy.discount.Immutable.ImmutableDiscountStrategyEnumFactory;
import com.study.design.pattern.behavior.strategy.discount.Immutable.ImmutableDiscountStrategyFactory;
import com.study.design.pattern.behavior.strategy.discount.mutable.IDiscountStrategyFactory;
import com.study.design.pattern.behavior.strategy.discount.mutable.MutableDiscountStrategyFactory;
import com.study.design.pattern.behavior.strategy.discount.mutable.MutableDiscountStrategyReflectFactory;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-20 21:52
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("++++executeImmutableStrategy+++++");
        executeImmutableStrategy();
        System.out.println("++++executeEnumImmutableStrategy+++++");
        executeEnumImmutableStrategy();
        System.out.println("++++executeMutableStrategy+++++");
        executeMutableStrategy();
        System.out.println("+++++executeReflectMutableStrategy++++");
        executeReflectMutableStrategy();
    }

    private static void executeMutableStrategy() {
        DiscountType type = DiscountType.NORMAL;
        IDiscountStrategyFactory factory = MutableDiscountStrategyFactory.getDiscountStrategyFactory(type);
        Log.d(TestMain.class, "immutable strategy discount is " + factory.getDiscountStrategy().calDiscount());
        Log.d(TestMain.class, "immutable strategy address is " + factory.getDiscountStrategy().toString());
        IDiscountStrategyFactory factory1 = MutableDiscountStrategyFactory.getDiscountStrategyFactory(type);
        Log.d(TestMain.class, "immutable strategy discount is " + factory1.getDiscountStrategy().calDiscount());
        Log.d(TestMain.class, "immutable strategy address is " + factory1.getDiscountStrategy().toString());
    }

    private static void executeReflectMutableStrategy() {
        DiscountType type = DiscountType.NORMAL;
        IDiscountStrategy strategy = MutableDiscountStrategyReflectFactory.getDiscountStrategyByType(type);
        Log.d(TestMain.class, "immutable reflect strategy discount is " + strategy.calDiscount());
        Log.d(TestMain.class, "immutable reflect strategy address is " + strategy.toString());
        IDiscountStrategy strategy1 = MutableDiscountStrategyReflectFactory.getDiscountStrategyByType(type);
        Log.d(TestMain.class, "immutable reflect strategy discount is " + strategy1.calDiscount());
        Log.d(TestMain.class, "immutable reflect strategy address is " + strategy1.toString());
    }



    private static void executeImmutableStrategy() {
        DiscountType type = DiscountType.GROUP;
        IDiscountStrategy strategy = ImmutableDiscountStrategyFactory.getDiscountStrategy(type);
        Log.d(TestMain.class, "immutable strategy discount is " + strategy.calDiscount());
        Log.d(TestMain.class, "immutable strategy address is " + strategy.toString());
        IDiscountStrategy strategy1 = ImmutableDiscountStrategyFactory.getDiscountStrategy(type);
        Log.d(TestMain.class, "immutable strategy discount is " + strategy1.calDiscount());
        Log.d(TestMain.class, "immutable strategy address is " + strategy1.toString());
    }

    private static void executeEnumImmutableStrategy() {
        DiscountType type = DiscountType.GROUP;
        IDiscountStrategy strategy = ImmutableDiscountStrategyEnumFactory.getDiscountStrategyByType(type);
        Log.d(TestMain.class, "immutable enum strategy discount is " + strategy.calDiscount());
        Log.d(TestMain.class, "immutable enum strategy address is " + strategy.toString());
        IDiscountStrategy strategy1 = ImmutableDiscountStrategyEnumFactory.getDiscountStrategyByType(type);
        Log.d(TestMain.class, "immutable enum strategy discount is " + strategy1.calDiscount());
        Log.d(TestMain.class, "immutable enum strategy address is " + strategy1.toString());
    }
}
