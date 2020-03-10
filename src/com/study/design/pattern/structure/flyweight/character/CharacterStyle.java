package com.study.design.pattern.structure.flyweight.character;

import java.awt.*;

/**
 * @author wuwei
 * @title: CharactorStyle
 * @projectName CodingDesign
 * @description: 针对这种组合，该对象不会再变了
 * @date 2020-03-08 16:33
 */
public class CharacterStyle {
    private Font font;
    private int size;
    private int colorRGB;

    private CharacterStyle(Builder builder) {
        this.font = builder.font;
        this.size = builder.size;
        this.colorRGB = builder.colorRGB;
    }

    public Font getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public int getColorRGB() {
        return colorRGB;
    }

    @Override
    public int hashCode() {
        return font.getStyle() + size + colorRGB;
    }

    @Override
    public String toString() {
        return "CharacterStyle{" +
                "font=" + font +
                ", size=" + size +
                ", colorRGB=" + colorRGB +
                '}';
    }

    public static class Builder {
        private Font font;
        private int size;
        private int colorRGB;

        public Builder setFont(Font font) {
            this.font = font;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setColorRGB(int colorRGB) {
            this.colorRGB = colorRGB;
            return this;
        }

        public CharacterStyle build() {
            return new CharacterStyle(this);
        }
    }


}
