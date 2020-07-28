package com.study.design.verify.lock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author wuwei
 * @title: LockTest
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-05-13 20:51
 */
public  class LockTest {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        try {
            reentrantLock.tryLock();
            reentrantLock.lock();
        } finally {
            reentrantLock.unlock();
        }

        LockTest lockTest = new LockTest();
        lockTest.toString();



        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();

        try {
            readLock.lock();
            //read map
        } finally {
            readLock.unlock();
        }


        try {
            writeLock.lock();
            //write map
        } finally {
            writeLock.unlock();
        }



    }
}
