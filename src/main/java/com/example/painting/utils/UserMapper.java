package com.example.painting.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.painting.bot.dto.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        var entity = new User(
                rs.getInt("id"),
                rs.getString("user_name"),
                rs.getString("description"));
        log.trace("mapRow(): entity = [{}]", entity);
        return entity;
    }
}
