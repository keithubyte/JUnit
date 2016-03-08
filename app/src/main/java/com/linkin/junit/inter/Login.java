package com.linkin.junit.inter;

import com.linkin.junit.dao.User;

/**
 * @author keith
 * @since 2016-03-08
 */
public interface Login {

    User login(String name, String pwd);

}
