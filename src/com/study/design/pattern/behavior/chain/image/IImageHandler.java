package com.study.design.pattern.behavior.chain.image;


/**
 * @author wuwei
 * @decription TODO
 * @date 2020-04-17 10:53
 * @email wei.wu@aispeech.com
 */
public interface IImageHandler {

    AIImageData handle(IImageHandlerChain chain);
}
