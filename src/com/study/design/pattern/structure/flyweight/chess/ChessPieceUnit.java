package com.study.design.pattern.structure.flyweight.chess;

/**
 * @author wuwei
 * @title: ChessPieceUnit
 * @projectName CodingDesign
 * @description: 共享对象单元:内部属性不可改，可以是builder方式，或者参数构造函数中传入(参数过多不适用)
 * @date 2020-03-08 15:35
 */
public class ChessPieceUnit {
    public enum Color{
        RED, BLACK
    }
    private int id;
    private String text;
    private Color color;


    private ChessPieceUnit(Builder builder) {
        this.id = builder.id;
        this.text = builder.text;
        this.color = builder.color;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ChessPieceUnit{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", color=" + color +
                '}';
    }

    public static class Builder{
        private int id;
        private String text;
        private Color color;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public ChessPieceUnit build() {
            return new ChessPieceUnit(this);
        }
    }
}
