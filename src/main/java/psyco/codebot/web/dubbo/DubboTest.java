package psyco.codebot.web.dubbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import psyco.user.center.client.service.UserService;

import javax.annotation.Resource;

/**
 * Created by peng on 15/10/24.
 */

@Configuration
@SpringBootApplication
@SpringApplicationConfiguration(classes = {DubboTest.class})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages = {"psyco.codebot.web.dubbo"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DubboTest {

    @Resource
    private UserService userService;

    @Test
    public void sdfs() {
        System.out.println(userService.findOne(22l));
    }
}
