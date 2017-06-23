package com.yibimu.dao;

import com.yibimu.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/6/20.
 */
public interface UserDao {
    /**
     * 查询：查询所有用户信息
     * @return
     */
    @Select("select * from ybm_user;")
    List<User> selectUser();
    /**
     * 查询：根据姓名查看用户信息
     * @param user_name
     * @return
     */
    @Select("SELECT * FROM ybm_user WHERE user_name = #{user_name}")
    List<User> findByName(@Param("user_name") String user_name);
    /**
     * 增加：单个添加用户
     * @param map
     */
    @Insert("INSERT INTO ybm_user(ORG_ID, CREATE_DATE, USER_ID, USER_NAME, USER_SEX, USER_AGE) VALUES(#{org_id, jdbcType=INTEGER}, #{create_date, jdbcType=DATE}, #{user_id, jdbcType=INTEGER}, #{user_name, jdbcType=VARCHAR}, #{user_sex, jdbcType=INTEGER}, #{user_age, jdbcType=INTEGER})")
    void insertByUser(Map<String, Object> map);
    /**
     * 删除：根据用户ID删除单个用户
     * @param map
     */
    @Delete("DELETE FROM ybm_user WHERE USER_ID = #{user_id, jdbcType=INTEGER}")
    void deleteUser(Map<String, Object> map);
    /**
     * 修改：更新数据；sql语句中的数据都要修改
     * @param map
     */
    @Update("UPDATE ybm_user SET `org_id`=#{org_id, jdbcType=INTEGER}, `user_name`=#{user_name, jdbcType=VARCHAR}, `user_sex`=#{user_sex, jdbcType=INTEGER}, `user_age`=#{user_age, jdbcType=INTEGER} WHERE `user_id`=#{user_id, jdbcType=INTEGER};")
    void updateUser(Map<String, Object> map);



}
