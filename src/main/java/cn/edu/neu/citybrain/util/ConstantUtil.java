package cn.edu.neu.citybrain.util;

public class ConstantUtil {
    public static final String JOB_NAME_PREFIX = "CityBrainJob";
    public static final String JOB_NAME = JOB_NAME_PREFIX + "-" + System.currentTimeMillis();

    public static final long CACHE_TIMEOUT = 24 * 60 * 60 * 1000;
    public static final long SOURCE_DELAY = 0 * 60 * 1000;

    // base db
    public static final Double DEFAULT_RID_SPEED = 40D;
}
