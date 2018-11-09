package com.fnzb.service;

import com.fnzb.dao.entity.User;

public interface UserService {

    User selectByPrimaryKey(Long id);
}
