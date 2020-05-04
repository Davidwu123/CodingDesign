package com.study.design.verify.file;

import com.study.design.common.Log;

import java.io.File;
import java.io.IOException;

/**
 * @author wuwei
 * @title: FileTest
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-05-01 19:17
 */
public class FileTest {
    private enum WW {
        WW, DG
    }


    public static void main(String[] ag) {
        String path1 = "/Users/wuwei/Desktop/tt/ww.log";
        String path2 = "/Users/wuwei/Desktop/tt/re/";
        createOrExistsFile(path1);
        createOrExistsFile(path2);
        File file = new File(path1);
        Log.d(FileTest.class, "file.getParent() " + file.getParent());
        Log.d(FileTest.class, "file.toURI().toString() " + file.toURI().toString());
        Log.d(FileTest.class, getDirName(path1));
        Log.d(FileTest.class, getDirName(path2));
    }

    public static String getDirName(final String filePath) {
        if (isSpace(filePath)) return filePath;
        int lastSep = filePath.lastIndexOf(File.separator);
        return lastSep == -1 ? "" : filePath.substring(0, lastSep + 1);
    }

    public static boolean createOrExistsFile(final String filePath) {
        return createOrExistsFile(getFileByPath(filePath));
    }

    public static boolean createOrExistsFile(final File file) {
        if (file == null) return false;
        // 如果存在，是文件则返回true，是目录则返回false
        if (file.exists()) return file.isFile();
        if (!createOrExistsDir(file.getParentFile())) return false;
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean createOrExistsDir(final String dirPath) {
        return createOrExistsDir(getFileByPath(dirPath));
    }

    public static boolean createOrExistsDir(final File file) {
        // 如果存在，是目录则返回true，是文件则返回false，不存在则返回是否创建成功
        return file != null && (file.exists() ? file.isDirectory() : file.mkdirs());
    }

    public static File getFileByPath(final String filePath) {
        return isSpace(filePath) ? null : new File(filePath);
    }

    private static boolean isSpace(final String s) {
        if (s == null) return true;
        for (int i = 0, len = s.length(); i < len; ++i) {
            if (!Character.isWhitespace(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
