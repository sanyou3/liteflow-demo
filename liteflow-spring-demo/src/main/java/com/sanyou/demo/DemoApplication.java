package com.sanyou.demo;

import com.yomahub.liteflow.core.FlowExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 启动引导类
 *
 * @author sanyou
 * @date 2022/5/15 10:45
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class);

        FlowExecutor flowExecutor = applicationContext.getBean(FlowExecutor.class);

        flowExecutor.execute2Resp("chain1", "");
    }

}
