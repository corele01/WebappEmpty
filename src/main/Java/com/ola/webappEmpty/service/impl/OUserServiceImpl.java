package com.ola.webappEmpty.service.impl;


import com.ola.webappEmpty.dao.OUserDao;
import com.ola.webappEmpty.model.OUser;
import com.ola.webappEmpty.service.OUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("oUserService")
public class OUserServiceImpl implements OUserService {

    @Autowired
    private OUserDao oUserDao;

    @Override
    public OUser login(OUser user) {
        if (user.getUsername() == null || user.getPassword() == null){
            return null;
        }
        return this.oUserDao.selectByOUser(user);
    }
}
