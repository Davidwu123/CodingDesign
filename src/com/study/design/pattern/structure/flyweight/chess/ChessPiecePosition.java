package com.study.design.pattern.structure.flyweight.chess;

/**
 * @author wuwei
 * @title: ChessPosition
 * @projectName CodingDesign
 * @description: 位置会经常变动，不适合使用工厂模式来实现享元模式
 * @date 2020-03-08 15:46
 */
public class ChessPiecePosition {
    private int positionX;
    private int positionY;

    public ChessPiecePosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return "ChessPiecePosition{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
