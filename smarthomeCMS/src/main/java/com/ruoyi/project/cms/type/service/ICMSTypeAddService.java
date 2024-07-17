package com.ruoyi.project.cms.type.service;

import com.ruoyi.project.cms.type.domain.CMSType;


/*
* @Author qxh
* @version 1.0
*
* 公告类型服务接口-处理新增相关业务
* */
public interface ICMSTypeAddService {
    /**
     * 校验公告类型名称是否唯一
     *
     * @param type 岗位名称信息参数
     * @return 结果 0是唯一，1是非唯一；
     */

    String checkTypeNameUnique(CMSType type);

    /**
     * 新增数据到数据库
     * @param type
     * @return
     */
    int addCMSType(CMSType type);
}
