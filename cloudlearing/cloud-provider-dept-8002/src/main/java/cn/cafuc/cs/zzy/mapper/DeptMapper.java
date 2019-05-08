package cn.cafuc.cs.zzy.mapper;

import cn.cafuc.cs.zzy.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @BelongsPackage:cn.cafuc.cs.zzy.mapper
 * @Author:zzy
 */
@Mapper
public interface DeptMapper {
        public boolean addDept(Dept dept);

        public Dept findById(Long id);

        public List<Dept> findAll();

}
