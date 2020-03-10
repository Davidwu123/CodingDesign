package com.study.design.pattern.structure.flyweight.chess;

import com.study.design.common.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wuwei
 * @title: ChessBoard
 * @projectName CodingDesign
 * @description: 棋盘:包括棋盘的初始化，移动，打印等
 * @date 2020-03-08 15:45
 */
public class ChessBoard {
    private Map<Integer, ChessPiece> mChessMap = new HashMap<>();
    private int[] chessIds = new int[]{1, 2, 3};

    public ChessBoard() {
        init();
    }

    private void init() {
        for (int id : chessIds) {
            mChessMap.put(id, new ChessPiece(ChessPieceUnitFactory.getChessPieceUnit(id),
                    new ChessPiecePosition(id + 1, id)));
        }
    }

    public void print() {
        Set<Integer> set = mChessMap.keySet();
        for (Integer id : set) {
            ChessPiece chessPiece = mChessMap.get(id);
            Log.d(ChessBoard.class, chessPiece.toString());
        }
    }
}
