package com.kou.dao;

import com.kou.domain.Items;

/**
 * 持久层接口
 * @author dell
 */
public interface ItemsDao {


    public Items findById(Integer id);

}
