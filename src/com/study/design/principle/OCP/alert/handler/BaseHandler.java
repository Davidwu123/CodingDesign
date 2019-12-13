package com.study.design.principle.OCP.alert.handler;

import com.study.design.principle.OCP.alert.AlertMessage;
import com.study.design.principle.OCP.alert.pusher.IPusher;

/**
 * @author wuwei
 * @title: BaseRuleHandler
 * @projectName CodingDesign
 * @description: TODO
 * @date 2019-12-13 17:14
 */
public abstract class BaseHandler {
   protected IPusher mPusher;

   public BaseHandler(IPusher pusher) {
      this.mPusher = pusher;
   }

   public abstract void check(AlertMessage message);
}
