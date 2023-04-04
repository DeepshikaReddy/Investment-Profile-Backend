package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Client;

//@Repository is provided by JpaRespo inteface.
public interface HedgeFundrepo extends JpaRepository<Client,Long>{

}
