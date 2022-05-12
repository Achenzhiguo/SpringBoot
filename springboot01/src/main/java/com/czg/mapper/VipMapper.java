package com.czg.mapper;

import com.czg.pojo.VipUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/12 - 05 - 12 - 2:44
 * @Description: com.czg.mapper
 * @version: 1.0
 */
@Mapper
public interface VipMapper {

    List<VipUser> findAll();
}
