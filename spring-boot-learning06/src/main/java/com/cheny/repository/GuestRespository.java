package com.cheny.repository;

import com.cheny.bean.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRespository extends JpaRepository<Guest,Long> {



}
