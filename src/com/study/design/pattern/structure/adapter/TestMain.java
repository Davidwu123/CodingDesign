package com.study.design.pattern.structure.adapter;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: 属于事后的补救措施，在规划和设计的时候用不到
 * @date 2020-03-03 21:07
 */
public class TestMain {
    public static void main(String[] args) {
        IPlayer player1 = new MyPlayerAdapterByExtension();
        player1.play();
        player1.pause();
        player1.release();


        IPlayer player2 = new MyPlayerAdapterByInjection(new MyPlayer());
        player2.play();
        player2.pause();
        player2.release();
    }
}
