package org.seonghun.quicklink.utils;

public class SnowFlakeIdGeneratorFactory {
    public static SnowFlakeIdGenerator createSnowFlakeIdGenerator(long nodeId) {
        return new SnowFlakeIdGenerator(nodeId);
    }
}
