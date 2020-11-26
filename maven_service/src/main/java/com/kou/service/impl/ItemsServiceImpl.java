package com.kou.service.impl;

import com.kou.dao.ItemsDao;
import com.kou.domain.Items;
import com.kou.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JIAJUN KOU
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
