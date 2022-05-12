package com.czg.service.impl;

import com.czg.mapper.VipMapper;
import com.czg.pojo.VipUser;
import com.czg.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/12 - 05 - 12 - 2:45
 * @Description: com.czg.service.impl
 * @version: 1.0
 */
@Service
public class VipServiceImpl implements VipService {
    @Autowired
    private VipMapper vipMpper;
    @Override
    public List<VipUser> findAll() {
        return vipMpper.findAll();
    }
}
