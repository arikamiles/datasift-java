package com.datasift.client.core;

import com.datasift.client.DataSiftConfig;

/**
 * @author Courtney Robinson <courtney@crlog.info>
 */
public class DataSiftCore {
    public DataSiftCore(DataSiftConfig config) {
        if (config == null) {
            throw new IllegalArgumentException("Config cannot be nulll");
        }
    }
}