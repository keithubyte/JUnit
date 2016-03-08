package com.linkin.junit.impl;

import com.linkin.junit.dao.User;
import com.linkin.junit.inter.Login;

/**
 * @author keith
 * @since 2016-03-08
 */
public class MockLoginImpl implements Login {

    @Override
    public User login(String name, String pwd) {
        return new User("123", name);
    }

}
