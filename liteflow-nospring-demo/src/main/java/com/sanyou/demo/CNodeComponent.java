package com.sanyou.demo;

import com.yomahub.liteflow.core.NodeComponent;

/**
 * 检查流程
 *
 * @author sanyou
 * @date 2022/5/14 18:05
 */
public class CNodeComponent extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("CNodeComponent 执行啦。。");
    }

}
