package com.study.design.pattern.creation.factory;

/**
 * @author wuwei
 * @title: IPlayer
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 09:23
 */
public interface IPlayer {
    void play();

    void pause();

    void stop();

    void release();

    void setCallback(IPlayEventCallback callback);


    interface IPlayEventCallback {
        void onReady();

        void onStop();

        void onError(int id, String msg);

        void onProgress(int total, int current);
    }
}
