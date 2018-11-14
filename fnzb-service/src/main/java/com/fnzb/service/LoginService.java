package com.fnzb.service;

import com.fnzb.dao.entity.Login;

public interface LoginService {

    Long findIdByMobile(Long mobile);

    Login findByMobileAndPassword(Long mobile, String password);
}