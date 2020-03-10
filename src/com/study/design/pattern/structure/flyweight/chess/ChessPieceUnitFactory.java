package com.study.design.pattern.structure.flyweight.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuwei
 * @title: ChessPieceUnitFactory
 * @projectName CodingDesign
 * @description: 享元模式的核心代码：用于复用，节省内存的缓存模块
 * @date 2020-03-08 15:40
 */
public class ChessPieceUnitFactory {
    private static final Map<Integer, ChessPieceUnit> sChessUnits = new HashMap<>();

    /**
     * id和text/color都是固定的，最多有30种组合，若组合方式太多，则需要可以通过动态的方式添加
     * 但是动态方式如果使用动态数组则需要考虑访问的时间复杂度O(n)
     * 用map可以为O(1),但是key需要组合起来，或者有唯一的id
     */
    static {
        sChessUnits.put(1, new ChessPieceUnit.Builder()
                .setId(1)
                .setColor(ChessPieceUnit.Color.BLACK)
                .setText("🐘")
                .build());
        sChessUnits.put(2, new ChessPieceUnit.Builder()
                .setId(2)
                .setColor(ChessPieceUnit.Color.RED)
                .setText("🐎")
                .build());
        sChessUnits.put(3, new ChessPieceUnit.Builder()
                .setId(3)
                .setColor(ChessPieceUnit.Color.BLACK)
                .setText("車")
                .build());
    }

    public static ChessPieceUnit getChessPieceUnit(int id) {
        return sChessUnits.get(id);
    }
}
