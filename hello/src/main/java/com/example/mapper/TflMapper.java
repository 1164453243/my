package com.example.mapper;

import com.example.bean.T_fl;
import tk.mybatis.mapper.common.Mapper;

public interface TflMapper extends Mapper<T_fl> {
    public T_fl GetTflByid(String id);
}
