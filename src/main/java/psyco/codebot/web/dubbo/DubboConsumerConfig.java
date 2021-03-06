/**
 * pajk.com Inc.
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package psyco.codebot.web.dubbo;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import psyco.user.center.client.service.UserService;


/**
 * Created by lipeng on 15/10/15.
 */
@Configuration
public class DubboConsumerConfig extends DubboConfig {

//    @Value("${dubbo.port}")
//    private Integer port;

    @Value("${dubbo.timeout}")
    private int timeout;

    @Value("${dubbo.retries}")
    private int retries;

    @Value("${dubbo.consumer.service.check}")
    private String check;

    @Value("${dubbo.usercenter.cosummer.version}")
    private String usercenterVersion;

    @Bean
    public ReferenceConfig referenceConfig() {
        ReferenceConfig rc = new ReferenceConfig();
        rc.setMonitor(monitorConfig());
        return rc;
    }


    private ReferenceBean bean(Class<?> clz, String version) {
        ReferenceBean ref = new ReferenceBean<>();
        ref.setVersion(version);
        ref.setInterface(clz);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    ReferenceBean userService() {
        return bean(UserService.class, usercenterVersion);
    }


}
