package org.seonghun.quicklink.utils;

public class SnowFlakeIdGenerator {

    private final long nodeId;
    private int sequence = 0;
    private long lastTimestamp = -1L;


    public SnowFlakeIdGenerator(long nodeId) {
        this.nodeId = nodeId;
    }

    public synchronized long generateID() {
        long timestamp = System.currentTimeMillis() - 1718421837905L;

        if (timestamp == lastTimestamp) {
            sequence = (sequence + 1) & 0x3F;
            if (sequence == 0) {
                do {
                    timestamp = System.currentTimeMillis();
                } while (timestamp == lastTimestamp);
            }
        } else {
            sequence = 0;
        }

        lastTimestamp = timestamp;

        return ((timestamp & 0xFFFFFFFFFFL) << 12) | (nodeId << 6) | sequence;
    }

}
