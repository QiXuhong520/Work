package com.ruoyi.project.cms.type.mapper;

import com.ruoyi.project.cms.type.domain.CMSType;

/**
 *
 */
public interface CMSTypeAddMapper {

    /**
     * 根据公告类型名称查询公告类型对象
     * @param typeName 查询条件
     * @return
     */
    CMSType checkTypeNameUnique(String typeName);

    /**
     * 新增公告类型
     * @param type  要新增的数据
     * @return
     */

    int insertCMSType(CMSType type);
}
