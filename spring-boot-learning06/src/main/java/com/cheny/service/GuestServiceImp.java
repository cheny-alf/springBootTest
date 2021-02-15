package com.cheny.service;

import com.cheny.bean.Guest;
import com.cheny.repository.GuestRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements  GuestService {

    @Autowired
    private GuestRespository respository;

    @Override
    public List<Guest> list() {
        return respository.findAll();
    }
}
