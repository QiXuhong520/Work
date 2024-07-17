package com.ruoyi.project.cms.type.service;

import com.ruoyi.project.cms.type.domain.CMSType;
import com.ruoyi.project.system.post.domain.Post;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qxh
 * @version 1.0
 * 公告类型管理服务接口 - 处理分页查询
 */

public interface ICMSTypeService
{

    /**
     * 查询公告类型信息集合
     *
     * @param type 公告类型信息-查询条件
     * @return 公告类型信息集合
     */
    public List<CMSType> selectCMSTypeList(CMSType type);




}
