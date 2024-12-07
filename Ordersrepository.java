package com.klef.jfsd.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.orders;

@Service
@Repository
public interface Ordersrepository extends JpaRepository<orders, Long> {

}
