package com.czg.service;

import com.czg.pojo.VipUser;

import java.util.List;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/12 - 05 - 12 - 2:44
 * @Description: com.czg.service
 * @version: 1.0
 */

public interface VipService {

    List<VipUser> findAll();
}
