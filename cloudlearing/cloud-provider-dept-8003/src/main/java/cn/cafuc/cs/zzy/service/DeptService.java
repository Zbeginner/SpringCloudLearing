package cn.cafuc.cs.zzy.service;

import cn.cafuc.cs.zzy.model.Dept;

import java.util.List;

/**
 * @BelongsPackage:cn.cafuc.cs.zzy.service
 * @Author:zzy
 */
public interface DeptService
{
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
