package com.test;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;

/**
 * @Author XYJ
 * @Description:
 * @Date:Created in 2017/12/20 9:51
 */
@SpringBootApplication
public class App {
    /*
    使用fastjson第一种方法:extends WebMvcConfigurerAdapter
     */
    /*@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        //创建消息转换对象fastConverter
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //创建fastjson的信息配置对象,
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //设置需要配置的信息,比如是否格式化返回的json数据
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //把封装配置信息的对象添加到消息转换对象fastConverter中
        fastConverter.setFastJsonConfig(fastJsonConfig);
        //将消息转换对象再次添加到converters中
        converters.add(fastConverter);
    }*/
    /*
    使用fastjson第二种方法:
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(){
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        return new HttpMessageConverters(fastConverter);
    }
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}


