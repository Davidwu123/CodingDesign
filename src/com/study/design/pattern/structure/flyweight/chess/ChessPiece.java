package com.study.design.pattern.structure.flyweight.chess;

/**
 * @author wuwei
 * @title: ChessPiece
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-08 15:45
 */
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private ChessPiecePosition chessPosition;

    public ChessPiece(ChessPieceUnit chessPieceUnit, ChessPiecePosition chessPosition) {
        this.chessPieceUnit = chessPieceUnit;
        this.chessPosition = chessPosition;
    }

    public ChessPieceUnit getChessPieceUnit() {
        return chessPieceUnit;
    }

    public void setChessPieceUnit(ChessPieceUnit chessPieceUnit) {
        this.chessPieceUnit = chessPieceUnit;
    }

    public ChessPiecePosition getChessPosition() {
        return chessPosition;
    }

    public void setChessPosition(ChessPiecePosition chessPosition) {
        this.chessPosition = chessPosition;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "chessPieceUnit=" + chessPieceUnit.toString() +
                ", ChessPiecePosition=" + chessPosition.toString() +
                '}';
    }
}
