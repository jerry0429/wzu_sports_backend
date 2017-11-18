package com.wzsport.mapper;

import com.wzsport.model.AreaActivityDataStatistic;
import com.wzsport.model.AreaActivityDataStatisticExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface AreaActivityDataStatisticMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    long countByExample(AreaActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    int deleteByExample(AreaActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    @Delete({ "delete from wzsport_area_activity_data_statistic", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    @Insert({ "insert into wzsport_area_activity_data_statistic (student_id, activity_id, ",
            "location_total_count, location_against)",
            "values (#{studentId,jdbcType=BIGINT}, #{activityId,jdbcType=BIGINT}, ",
            "#{locationTotalCount,jdbcType=INTEGER}, #{locationAgainst,jdbcType=INTEGER})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(AreaActivityDataStatistic record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    int insertSelective(AreaActivityDataStatistic record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    List<AreaActivityDataStatistic> selectByExample(AreaActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    @Select({ "select", "id, student_id, activity_id, location_total_count, location_against",
            "from wzsport_area_activity_data_statistic", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.AreaActivityDataStatisticMapper.BaseResultMap")
    AreaActivityDataStatistic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    int updateByExampleSelective(@Param("record") AreaActivityDataStatistic record,
            @Param("example") AreaActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    int updateByExample(@Param("record") AreaActivityDataStatistic record,
            @Param("example") AreaActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    int updateByPrimaryKeySelective(AreaActivityDataStatistic record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data_statistic
     * @mbg.generated  Sat Nov 18 12:05:52 CST 2017
     */
    @Update({ "update wzsport_area_activity_data_statistic", "set student_id = #{studentId,jdbcType=BIGINT},",
            "activity_id = #{activityId,jdbcType=BIGINT},",
            "location_total_count = #{locationTotalCount,jdbcType=INTEGER},",
            "location_against = #{locationAgainst,jdbcType=INTEGER}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(AreaActivityDataStatistic record);

    @Select({
        "select",
        "s.id, s.student_id, s.activity_id, s.location_total_count, s.location_against, p.id as location_id, p.name as location_name",
        "from wzsport_area_activity_data_statistic as s",
        "left join wzsport_area_activity as a on s.activity_id = a.id",
        "left join wzsport_fix_location_outdoor_sport_point as p on a.location_id = p.id",
        "where s.student_id = #{studentId, jdbcType=BIGINT}"
    })
    @ResultMap("com.wzsport.mapper.AreaActivityDataStatisticMapper.ResultMapWithFixLocation")
    List<AreaActivityDataStatistic> selectByStudentId(@Param("studentId") Long studentId);
}