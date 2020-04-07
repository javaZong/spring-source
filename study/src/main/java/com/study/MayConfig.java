package com.study;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 测试入口
 * @author zongchao
 */
@Configurable
@ComponentScan("com.study")
@EnableAspectJAutoProxy
public class MayConfig {
}
