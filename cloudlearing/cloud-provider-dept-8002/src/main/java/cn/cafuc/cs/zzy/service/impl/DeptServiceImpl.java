package cn.cafuc.cs.zzy.service.impl;

import cn.cafuc.cs.zzy.mapper.DeptMapper;
import cn.cafuc.cs.zzy.model.Dept;
import cn.cafuc.cs.zzy.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @BelongsPackage:cn.cafuc.cs.zzy.service.impl
 * @Author:zzy
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    DeptMapper deptMapper;
    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
