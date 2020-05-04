package com.study.design.pattern.behavior.chain.image;

/**
 * @author wuwei
 * @decription TODO
 * @date 2020-03-27 11:58
 * @email wei.wu@aispeech.com
 */
public class AIImageData implements Cloneable{
    private byte[] data;
    private int width;
    private int height;

    public static AIImageData emptyData() {
        return new AIImageData(new byte[0], 0, 0);
    }


    /**
     * 需要进行深拷贝，因为应用层对象实例所对应的指向堆中字节数组首地址的引用变量复用的是一个，若数据返回太快，
     * SDK内部在使用的过程中会出现引用变量所指向的数据首地址被修改，导致数据错乱和异常
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public AIImageData clone() throws CloneNotSupportedException {
        byte[] copyData = new byte[data.length];
        System.arraycopy(data, 0, copyData, 0, data.length);
        return new AIImageData(copyData, width, height);
    }

    public AIImageData(byte[] data, int width, int height) {
        this.data = data;
        this.width = width;
        this.height = height;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
