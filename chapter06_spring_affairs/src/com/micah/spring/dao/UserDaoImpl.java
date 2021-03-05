package com.micah.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author m.kong
 * @Date 2021/3/1 上午11:25
 * @Version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Micah转账100给Maruko
     * reduce money
     */
    @Override
    public void reduceMoney() {
        String sql = "UPDATE t_account SET money = money - ? where username = ?";
        jdbcTemplate.update(sql, 100, "Micah");
    }

    /**
     * add money
     */
    @Override
    public void addMoney() {
        String sql = "UPDATE t_account SET money = money + ? where username = ?";
        jdbcTemplate.update(sql, 100, "Maruko");
    }
}
