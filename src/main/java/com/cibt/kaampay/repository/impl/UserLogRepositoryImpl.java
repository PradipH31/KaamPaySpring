/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.kaampay.repository.impl;

import com.cibt.kaampay.entity.UserLog;
import com.cibt.kaampay.repository.UserLogRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author HP B&O
 */
public class UserLogRepositoryImpl implements UserLogRepository {

    @Autowired
    private JdbcTemplate template;

    @Override
    public void insert(UserLog model) throws Exception {
        String sql = "insert into tbl_user_logs(user_id) values(?)";
        template.update(sql, new Object[]{model.getUser().getId()});
    }

    @Override
    public void update(UserLog model) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserLog> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserLog findById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
