package com.xa.jans.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author zyl
 *
 */
@Configuration
public class DataSourceConfig {

	@Bean(name="datasource")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource datasource() {
		return new DruidDataSource();
	}
	
	//配置事务
	@Bean(name="transactionManager")
	public DataSourceTransactionManager manager() {
		return new DataSourceTransactionManager(datasource());
	}
}
