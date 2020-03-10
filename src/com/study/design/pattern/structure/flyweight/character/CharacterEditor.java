package com.study.design.pattern.structure.flyweight.character;

import com.study.design.common.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuwei
 * @title: CharacterEditor
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-08 16:43
 */
public class CharacterEditor {
    private List<Character> list = new ArrayList<>();

    public CharacterEditor() {

    }

    public void addCharacter(Character character) {
        list.add(character);
    }

    public void print() {
        Log.d(CharacterEditor.class, list.toString());
    }
}
