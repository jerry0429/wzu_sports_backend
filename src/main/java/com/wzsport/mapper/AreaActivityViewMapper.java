package com.wzsport.mapper;

import com.wzsport.model.AreaActivityView;
import com.wzsport.model.AreaActivityViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

public interface AreaActivityViewMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_view
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    long countByExample(AreaActivityViewExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_view
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    int deleteByExample(AreaActivityViewExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_view
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    @Insert({ "insert into wzsport_area_activity_view (area_sport_id, location_id, ", "student_id, cost_time, ",
            "start_time, kcal_consumed, ", "qualified, qualified_cost_time, ", "university_id, student_no, ",
            "class_id, is_man, name, ", "ended_at, ended_by)",
            "values (#{areaSportId,jdbcType=BIGINT}, #{locationId,jdbcType=BIGINT}, ",
            "#{studentId,jdbcType=BIGINT}, #{costTime,jdbcType=INTEGER}, ",
            "#{startTime,jdbcType=TIMESTAMP}, #{kcalConsumed,jdbcType=INTEGER}, ",
            "#{qualified,jdbcType=BIT}, #{qualifiedCostTime,jdbcType=INTEGER}, ",
            "#{universityId,jdbcType=BIGINT}, #{studentNo,jdbcType=VARCHAR}, ",
            "#{classId,jdbcType=BIGINT}, #{isMan,jdbcType=BIT}, #{name,jdbcType=VARCHAR}, ",
            "#{endedAt,jdbcType=TIMESTAMP}, #{endedBy,jdbcType=TINYINT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(AreaActivityView record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_view
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    int insertSelective(AreaActivityView record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_view
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    List<AreaActivityView> selectByExample(AreaActivityViewExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_view
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") AreaActivityView record,
            @Param("example") AreaActivityViewExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_view
     * @mbg.generated  Fri Nov 10 19:11:32 CST 2017
     */
    int updateByExample(@Param("record") AreaActivityView record, @Param("example") AreaActivityViewExample example);
}