package com.sanyou.demo;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.core.FlowExecutorHolder;
import com.yomahub.liteflow.property.LiteflowConfig;

/**
 * 检查流程
 *
 * @author sanyou
 * @date 2022/5/14 18:05
 */
public class LiteFlowDemo {

    public static void main(String[] args) {
        LiteflowConfig config = new LiteflowConfig();
        config.setRuleSource("flow.xml");
        FlowExecutor flowExecutor = FlowExecutorHolder.loadInstance(config);

        flowExecutor.execute2Resp("chain1", "");
    }

}
