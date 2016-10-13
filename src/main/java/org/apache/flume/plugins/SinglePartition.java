package org.apache.flume.plugins;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

/**
 * 单区块-分割器，不分块
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2016/10/13 下午4:48
 */
public class SinglePartition implements Partitioner {
    public int partition(String s, Object o, byte[] bytes, Object o1, byte[] bytes1, Cluster cluster) {
        return 0;
    }

    public void close() {

    }

    public void configure(Map<String, ?> map) {

    }
}
