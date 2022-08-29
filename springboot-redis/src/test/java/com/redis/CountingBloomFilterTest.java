package com.redis;

import orestes.bloomfilter.CountingBloomFilter;
import orestes.bloomfilter.FilterBuilder;

/**
 * @Author: qingshan

 * https://github.com/Baqend/Orestes-Bloomfilter
 */
public class CountingBloomFilterTest {
    public static void main(String[] args) {
        CountingBloomFilter<String> cbf = new FilterBuilder(1000,
                0.01).buildCountingBloomFilter();
        cbf.add("http://redis.com");
        cbf.add("http://alibaba.com");
        cbf.add("http://baidu.com");

        cbf.remove("http://baidu.com");

        System.out.println(cbf.contains("http://redis.com")); //true
        System.out.println(cbf.contains("http://alibaba.com")); //true
        System.out.println(cbf.contains("http://baidu.com")); //false
    }
}
