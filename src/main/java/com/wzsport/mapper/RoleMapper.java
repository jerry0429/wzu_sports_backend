package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.Role;
import com.wzsport.model.RoleExample;

public interface RoleMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    long countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    @Delete({ "delete from wzsport_role", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    @Insert({ "insert into wzsport_role (name, priv_ids)",
            "values (#{name,jdbcType=VARCHAR}, #{privIds,jdbcType=VARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    @Select({ "select", "id, name, priv_ids", "from wzsport_role", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.RoleMapper.BaseResultMap")
    Role selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    @Update({ "update wzsport_role", "set name = #{name,jdbcType=VARCHAR},", "priv_ids = #{privIds,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(Role record);
}