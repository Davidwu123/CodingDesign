package com.study.design.pattern.behavior.chain.interceptor.recursive;

import com.study.design.common.Log;


/**
 * @author wuwei
 * @title: RecHttpInterceptorChain
 * @projectName CodingDesign
 * @description: 递归方式对请求和结果方式进行拦截/过滤
 * @date 2020-03-28 16:22
 */
public class RecHttpInterceptorChain {
    private IHttpInterceptor[] mHttpInterceptors = new IHttpInterceptor[1];
    private static final int DEFAULT_INCREMENT = 2;
    private int mCurrentInterceptorIdx;
    private int mTotalInterceptorsNum;


    public void doHandle(StringBuilder request, StringBuilder response) {
        //让节点进行处理，各自节点处理完了，会进入递归环节，当节点全部处理完后执行最终的请求环节
        if (mCurrentInterceptorIdx < mTotalInterceptorsNum) {
            IHttpInterceptor httpInterceptor = mHttpInterceptors[mCurrentInterceptorIdx++];
            httpInterceptor.doHandle(request, response, this);
        } else {
            executeRequest(request, response);
        }

        //正常用for each不可以，因为这样每次都会全部遍历一遍，现在的需求是每个拦截器总共只能执行一次，执行完了执行总的请求
        //如果用list,也要用有序list,且也要按照上面的操作，有一个全局的idx来记录执行到哪里了，下次可以继续这里的执行
    }

    private void executeRequest(StringBuilder request, StringBuilder response) {
        response.append(request).append(" + ").append("连接成功,code=200!");
    }

    public boolean addInterceptor(IHttpInterceptor httpInterceptor) {
        if (httpInterceptor == null) {
            return false;
        }
        if (mTotalInterceptorsNum >= mHttpInterceptors.length) {
            Log.d(this.getClass().getSimpleName(), "开始扩容......");
            Log.d(this.getClass().getSimpleName(), "total num is " + mTotalInterceptorsNum);
            Log.d(this.getClass().getSimpleName(), "array capacity is " + mHttpInterceptors.length);
            IHttpInterceptor[] newInterceptors = new IHttpInterceptor[mHttpInterceptors.length + DEFAULT_INCREMENT];
            System.arraycopy(mHttpInterceptors, 0, newInterceptors, 0, mHttpInterceptors.length);
            mHttpInterceptors = newInterceptors;
            Log.d(this.getClass().getSimpleName(), "扩容结束......");
        }
        mHttpInterceptors[mTotalInterceptorsNum++] = httpInterceptor;
        return true;
    }

}
