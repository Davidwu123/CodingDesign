package com.study.design.pattern.behavior.chain.interceptor.norecursive;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: NoRecHttpInterceptorChain
 * @projectName CodingDesign
 * @description: 不优雅
 * @date 2020-03-28 20:49
 */
public class NoRecHttpInterceptorChain {
    private IHttpInterceptorV2[] mHttpInterceptors = new IHttpInterceptorV2[1];
    private static final int DEFAULT_INCREMENT = 2;
    private int mCurrentInterceptorIdx;
    private int mTotalInterceptorsNum;


    public void preHandle(StringBuilder request, StringBuilder response) {
//        Log.d(this.getClass().getSimpleName(), "mTotalInterceptorsNum is " + mTotalInterceptorsNum);
        for (mCurrentInterceptorIdx = 0; mCurrentInterceptorIdx <= mTotalInterceptorsNum - 1; mCurrentInterceptorIdx++) {
            IHttpInterceptorV2 httpInterceptorV2 = mHttpInterceptors[mCurrentInterceptorIdx];
            httpInterceptorV2.doPreHandle(request, response);
        }
//        Log.d(this.getClass().getSimpleName(), "mCurrentInterceptorIdx is " + mCurrentInterceptorIdx);
    }

    public void postHandle(StringBuilder request, StringBuilder response) {
//        Log.d(this.getClass().getSimpleName(), "mCurrentInterceptorIdx is " + mCurrentInterceptorIdx);
        for (int i = mCurrentInterceptorIdx - 1; i >= 0; i--) {
            IHttpInterceptorV2 httpInterceptorV2 = mHttpInterceptors[i];
            httpInterceptorV2.doPostHandle(request, response);
        }
    }

    public void executeRequest(StringBuilder request, StringBuilder response) {
        response.append(request).append(" + ").append("连接成功,code=200!");
    }



    public boolean addInterceptor(IHttpInterceptorV2 httpInterceptor) {
        if (httpInterceptor == null) {
            return false;
        }
        if (mTotalInterceptorsNum >= mHttpInterceptors.length) {
            Log.d(this.getClass().getSimpleName(), "V2 开始扩容......");
            Log.d(this.getClass().getSimpleName(), "V2 total num is " + mTotalInterceptorsNum);
            Log.d(this.getClass().getSimpleName(), "V2 array capacity is " + mHttpInterceptors.length);
            IHttpInterceptorV2[] newInterceptors = new IHttpInterceptorV2[mHttpInterceptors.length + DEFAULT_INCREMENT];
            System.arraycopy(mHttpInterceptors, 0, newInterceptors, 0, mHttpInterceptors.length);
            mHttpInterceptors = newInterceptors;
            Log.d(this.getClass().getSimpleName(), "V2 扩容结束......");
        }
        mHttpInterceptors[mTotalInterceptorsNum++] = httpInterceptor;
        return true;
    }
}
