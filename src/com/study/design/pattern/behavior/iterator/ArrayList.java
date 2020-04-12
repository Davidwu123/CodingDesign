package com.study.design.pattern.behavior.iterator;

import com.study.design.common.Log;

import java.util.ConcurrentModificationException;

/**
 * @author wuwei
 * @title: ArrayList
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-01 21:12
 */
public class ArrayList<T> implements List {
    private static final int DEFAULT_SIZE = 20;
    private Object[] mElements = new Object[DEFAULT_SIZE];
    private int mCurrentSize;
    private int mModifyCount;

    @Override
    public Iterator iterator() {
        return new ArrayListIterator(this);
    }

    @Override
    public Iterator snapshotIterator() {
        return null;
    }

    public void add(T t) {
        mElements[mCurrentSize++] = t;
        modifyCount();
    }

    public void addAll(ArrayList<T> list) {
        //浅拷贝数据
    }

    public void remove() {
        mElements[mCurrentSize--] = null;
        modifyCount();
    }

    public T get(int idx) {
       return (T) mElements[idx];
    }

    private void modifyCount() {
        mModifyCount++;
    }

    public int size() {
        return mCurrentSize;
    }


    private class SnapshotListIterator<T> implements Iterator {
        private ArrayList snapShotList;
        private int cursor;

        public SnapshotListIterator(ArrayList<T> list) {
            snapShotList = new ArrayList();
            snapShotList.addAll(list);
        }

        @Override
        public boolean hasNext() {
            return cursor < snapShotList.size();
        }

        @Override
        public void next() {
            cursor++;
        }

        @Override
        public T getCurrentItem() {
            if (cursor >= snapShotList.size()) {
                Log.e(this.getClass().getSimpleName(), "out of boundary list");
                throw new ArrayIndexOutOfBoundsException("out of boundary list");
            }
            return (T) snapShotList.get(cursor);
        }
    }




    private class ArrayListIterator<T> implements Iterator {
        private ArrayList<T> mList;
        private int mCursor;
        private int mExpectedCount;

        public ArrayListIterator(ArrayList<T> list) {
            this.mList = list;
            this.mCursor = 0;
            this.mExpectedCount = mModifyCount;
        }

        /**
         * 0, 1, 2（size=3）
         * @return
         */
        @Override
        public boolean hasNext() {
//        Log.d(this.getClass().getSimpleName(), "cursor is " + mCursor);
//        Log.d(this.getClass().getSimpleName(), "size is " + mList.size());
            return mCursor < mList.size();
        }

        @Override
        public void next() {
            mCursor++;
        }

        private void checkModifyCount() {
            if (mExpectedCount != mModifyCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public T getCurrentItem() {
            checkModifyCount();
            if (mCursor >= mList.size()) {
                Log.e(this.getClass().getSimpleName(), "out of boundary list");
                throw new ArrayIndexOutOfBoundsException("out of boundary list");
            }
            return mList.get(mCursor);
        }
    }


}
