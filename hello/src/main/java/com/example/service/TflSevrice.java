package com.example.service;

import com.example.bean.T_fl;
import com.example.mapper.TflMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TflSevrice  {

    @Autowired
    public TflMapper tflMapper;

    public T_fl GetById(String id){
        T_fl select = tflMapper.selectByPrimaryKey(id);
        return select;
    }
}
