package com.example.demo.config;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * 分库策略
 * @author xxy
 */
public class DemoDatabaseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        for (String each : collection) {
            if (each.endsWith(Long.parseLong(preciseShardingValue.getValue().toString()) % 2+"")) {
                System.out.println("DemoDatabaseSharding.each -> " + each + ";     preciseShardingValue -> " + preciseShardingValue.getValue());
                return each;
            }
        }
        throw new IllegalArgumentException();
    }
}
