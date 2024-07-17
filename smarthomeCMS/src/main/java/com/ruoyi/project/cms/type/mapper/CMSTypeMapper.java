package com.ruoyi.project.cms.type.mapper;

import com.ruoyi.project.cms.type.domain.CMSType;

import java.util.List;

/**
 * @author qxh
 * version 1.0
 * 公告类型数据访问接口 - 专门处理查询公告类型数据
 * */
public interface CMSTypeMapper {
    /**
     * 查询公告类型数据集合
     *
     * @param type 公告类型信息-查询条件
     * @return 公告类型数据集合
     */
    List<CMSType> selectCMSTypeList(CMSType type);
}
