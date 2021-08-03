package com.xinyuan.sm.pojo;

import org.mybatis.spring.support.SqlSessionDaoSupport;
@Deprecated
public class UserImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User getUserById(Integer id) {
        return this.getSqlSession().selectOne("com.xinyuan.sm.pojo.UserMapper.getUserById", id);
    }
}
