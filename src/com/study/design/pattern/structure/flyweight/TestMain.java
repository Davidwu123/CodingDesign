package com.study.design.pattern.structure.flyweight;

import com.study.design.common.Log;
import com.study.design.pattern.structure.flyweight.Integer.IntegerCache;
import com.study.design.pattern.structure.flyweight.character.Character;
import com.study.design.pattern.structure.flyweight.character.CharacterEditor;
import com.study.design.pattern.structure.flyweight.character.CharacterStyleFactory;
import com.study.design.pattern.structure.flyweight.chess.ChessBoard;
import java.awt.*;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: 享元模式落地的方式通过工厂模式来进行共享单元的创建
 * @date 2020-03-08 14:40
 */
public class TestMain {
    public static void main(String[] args) {
//        buildChessBoard();
//        System.out.println("\n+++++++++++++++++++++++\n");
//        buildCharacterEditor();
        testIntegerCache();
    }


    private static void buildCharacterEditor() {
        Log.d(TestMain.class, "start");
        CharacterEditor characterEditor = new CharacterEditor();
        characterEditor.addCharacter(new Character("测试",
                CharacterStyleFactory.getCharacterStyle(new Font("1",Font.BOLD,1), 12, 21)));
        characterEditor.addCharacter(new Character("一个",
                CharacterStyleFactory.getCharacterStyle(new Font("2",Font.ITALIC,1), 12, 22)));
        characterEditor.addCharacter(new Character("参数",
                CharacterStyleFactory.getCharacterStyle(new Font("3",Font.PLAIN,1), 12, 10)));
        characterEditor.print();
        Log.d(TestMain.class, "end");
    }

    private static void buildChessBoard() {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.print();
    }

    private static void testIntegerCache() {
        Integer a = IntegerCache.getIntegerById("1");
        Integer a1 = IntegerCache.getIntegerById("1");
        Integer a2 = IntegerCache.getIntegerById("1");
        Integer b = IntegerCache.getIntegerById("10");
        Log.d(TestMain.class, "a == a1 ? " + (a == a1));
        Log.d(TestMain.class, "a == a2 ? " + (a == a2));
        Log.d(TestMain.class, "a1 == a2 ? " + (a1 == a2));
        IntegerCache.releaseIntegerById("1");
        IntegerCache.releaseIntegerById("1");
        IntegerCache.releaseIntegerById("1");
        IntegerCache.releaseIntegerById("1");
        IntegerCache.releaseIntegerById("1");
        IntegerCache.releaseIntegerById("1");
        Integer a3 = IntegerCache.getIntegerById("1");
    }
}
