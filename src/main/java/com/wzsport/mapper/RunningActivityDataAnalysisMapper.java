package com.wzsport.mapper;

import com.wzsport.model.RunningActivityDataAnalysis;
import com.wzsport.model.RunningActivityDataAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RunningActivityDataAnalysisMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	long countByExample(RunningActivityDataAnalysisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int deleteByExample(RunningActivityDataAnalysisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Delete({ "delete from wzsport_running_activity_data_analysis", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Insert({ "insert into wzsport_running_activity_data_analysis (running_activity_id, sport_data_validate_rule_id, ",
			"collection_point_amount, conform_step_per_second_amount, ",
			"conform_distance_per_step_amount, conform_speed_amount)",
			"values (#{runningActivityId,jdbcType=BIGINT}, #{sportDataValidateRuleId,jdbcType=BIGINT}, ",
			"#{collectionPointAmount,jdbcType=INTEGER}, #{conformStepPerSecondAmount,jdbcType=INTEGER}, ",
			"#{conformDistancePerStepAmount,jdbcType=INTEGER}, #{conformSpeedAmount,jdbcType=INTEGER})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(RunningActivityDataAnalysis record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int insertSelective(RunningActivityDataAnalysis record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	List<RunningActivityDataAnalysis> selectByExample(RunningActivityDataAnalysisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Select({ "select", "id, running_activity_id, sport_data_validate_rule_id, collection_point_amount, ",
			"conform_step_per_second_amount, conform_distance_per_step_amount, conform_speed_amount",
			"from wzsport_running_activity_data_analysis", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.RunningActivityDataAnalysisMapper.BaseResultMap")
	RunningActivityDataAnalysis selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RunningActivityDataAnalysis record,
			@Param("example") RunningActivityDataAnalysisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int updateByExample(@Param("record") RunningActivityDataAnalysis record,
			@Param("example") RunningActivityDataAnalysisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int updateByPrimaryKeySelective(RunningActivityDataAnalysis record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_analysis
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Update({ "update wzsport_running_activity_data_analysis",
			"set running_activity_id = #{runningActivityId,jdbcType=BIGINT},",
			"sport_data_validate_rule_id = #{sportDataValidateRuleId,jdbcType=BIGINT},",
			"collection_point_amount = #{collectionPointAmount,jdbcType=INTEGER},",
			"conform_step_per_second_amount = #{conformStepPerSecondAmount,jdbcType=INTEGER},",
			"conform_distance_per_step_amount = #{conformDistancePerStepAmount,jdbcType=INTEGER},",
			"conform_speed_amount = #{conformSpeedAmount,jdbcType=INTEGER}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(RunningActivityDataAnalysis record);
}