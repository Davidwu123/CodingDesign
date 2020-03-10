package com.study.design.pattern.structure.flyweight.character;

import com.study.design.common.Log;
import java.awt.*;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wuwei
 * @title: CharacterStyleFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-08 16:37
 */
public class CharacterStyleFactory {
    private static final ConcurrentHashMap<Integer, CharacterStyle> sCharacterStyles = new ConcurrentHashMap<>();

    public static CharacterStyle getCharacterStyle(Font font, int size, int colorRGB) {
        CharacterStyle style = new CharacterStyle.Builder()
                .setFont(font)
                .setSize(size)
                .setColorRGB(colorRGB)
                .build();
        int hashCode = style.hashCode();
        Log.d(CharacterStyleFactory.class, "style hashCode is " + hashCode);
        sCharacterStyles.putIfAbsent(hashCode, style);
        Log.d(CharacterStyleFactory.class, "map is " + sCharacterStyles.toString());
        return sCharacterStyles.get(hashCode);
    }
}
