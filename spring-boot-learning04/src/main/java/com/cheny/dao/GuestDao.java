package com.cheny.dao;

import com.cheny.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    static List<Guest> guestList = new ArrayList<>();
    static {
        guestList.add(new Guest("张三","店长"));
        guestList.add(new Guest("李四","财务"));
        guestList.add(new Guest("王五","总厨"));
        guestList.add(new Guest("赵六","经理"));
        guestList.add(new Guest("孙七","前台"));
    }

    public List<Guest> list(){
        return guestList;
    }
}
