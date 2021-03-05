package com.micah.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author m.kong
 * @Date 2021/3/1 下午2:58
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.micah") // 组建扫描
@EnableTransactionManagement //开启事务
public class TxConfig {
    /**
     * 创建数据库连接池
     */
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql:///user_db");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("jlq000321");
        return druidDataSource;
    }

    /**
     * 创建jdbcTemplate对象
     */
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        // 到ioc容器中，根据类型找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 注入dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    /**
     * 创建事务管理器
     */
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
