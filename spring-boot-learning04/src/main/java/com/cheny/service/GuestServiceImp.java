package com.cheny.service;

import com.cheny.bean.Guest;
import com.cheny.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImp implements  GuestService {

    @Autowired
    private GuestDao guestDao;


    @Override
    public List<Guest> list() {
        return guestDao.list();
    }
}
