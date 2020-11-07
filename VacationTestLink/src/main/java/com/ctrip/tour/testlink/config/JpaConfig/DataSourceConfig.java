package com.ctrip.tour.testlink.config.JpaConfig;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by hbhu on 2018/9/3.
 */
//@Configuration
public class DataSourceConfig {

    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
}
