package com.study.design.pattern.behavior.chain.image;



/**
 * @author wuwei
 * @description 图片处理(旋转,镜像)责任链
 * @date 2020-04-17 10:29
 * @email wei.wu@aispeech.com
 */
public interface IImageHandlerChain {
    AIImageData handle(AIImageData rawImageData);

    AIImageData get();
}
