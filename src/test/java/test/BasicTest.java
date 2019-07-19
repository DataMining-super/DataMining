package test;

import com.alibaba.druid.support.spring.stat.SpringStatUtils;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 描述:
 * 配置文件的加载
 *
 * @author ace-huang
 * @create 2019-07-19 4:29 PM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-mapper.xml"})
public class BasicTest {

}