package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {

    /**
     * 创建JedisPoolConfig对象
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.redis.pool")
    public JedisPoolConfig jedisPoolConfig(){
        JedisPoolConfig config = new JedisPoolConfig();
        System.out.println("默认值：" + config.getMaxIdle());
        System.out.println("默认值：" + config.getMinIdle());
        System.out.println("默认值：" + config.getMaxTotal());
        return config;
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.redis.pool")
    public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig config){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setPoolConfig(config);
        //factory.setHostName("192.168.0.128");
        //factory.setPort(6379);

        return factory;
    }

    @Bean
    public RedisTemplate<String,Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory){
        RedisTemplate<String,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory);
        // 设置 key的序列号器
        template.setKeySerializer(new StringRedisSerializer());
        // 设置 value的序列化器
        template.setValueSerializer(new StringRedisSerializer());
        return template;

    }
}
