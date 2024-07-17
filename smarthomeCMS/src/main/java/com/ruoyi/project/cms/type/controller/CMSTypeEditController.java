package com.ruoyi.project.cms.type.controller;
/*
* @author: qxh
* @version 1.0
*
* 修改公告类型控制器
*
* */

import com.ruoyi.project.cms.type.commons.CMSTypeConst;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(CMSTypeConst.PATH_PREFIX)
public class CMSTypeEditController {


    public String  toEdit(){
        return CMSTypeConst.PREFIX + "/edit";
    }
}
