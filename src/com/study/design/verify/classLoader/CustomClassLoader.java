package com.study.design.verify.classLoader;

import com.study.design.common.Log;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author wuwei
 * @title: MyClassLoader
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-22 21:09
 */
public class CustomClassLoader extends ClassLoader {
    private String classPath;

    public CustomClassLoader(String classPath) {
        this.classPath = classPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String classFilePath = classPath + name + ".class";
        byte[] code = null;
        try {
            Log.d(CustomClassLoader.class, "custom class path is " + classFilePath);
            Path path = Paths.get(new URI(classFilePath));
            code = Files.readAllBytes(path);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        Log.d(CustomClassLoader.class, Arrays.toString(code));
        return this.defineClass(name, code, 0, code.length);
    }
}
