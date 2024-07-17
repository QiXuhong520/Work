CMSTypeConst - 协同开发，只能新增不可以修改
    1、返回视图前缀常量定义


ICMSTypeService:
    1、处理系统公告类型分页查询
        权限标记：cms:type:list




ICMSTypeAddService:
    1、处理新增公告类型
        权限标记：cms:type:add


ICMSTypeEditService:
    1、处理修改公告类型
        权限标记：cms:type:edit
    2、根据主键查询公告类型 - 修改的前置条件
        权限标记：cms:type:edit

ICMSTypeRemoveService:
    1、处理删除公告类型
        权限标记：cms:type:remove