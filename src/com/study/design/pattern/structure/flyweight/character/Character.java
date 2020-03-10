package com.study.design.pattern.structure.flyweight.character;

/**
 * @author wuwei
 * @title: Character
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-08 16:44
 */
public class Character {
    private String text;
    private CharacterStyle style;

    public Character(String text, CharacterStyle style) {
        this.text = text;
        this.style = style;
    }

    public String getText() {
        return text;
    }

    public Character setText(String text) {
        this.text = text;
        return this;
    }

    public CharacterStyle getStyle() {
        return style;
    }

    public Character setStyle(CharacterStyle style) {
        this.style = style;
        return this;
    }

    @Override
    public String toString() {
        return "Character{" +
                "text='" + text + '\'' +
                ", style=" + style.toString() +
                '}';
    }
}
