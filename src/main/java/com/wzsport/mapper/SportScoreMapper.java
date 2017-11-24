package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.SportScore;
import com.wzsport.model.SportScoreExample;

public interface SportScoreMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	long countByExample(SportScoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	int deleteByExample(SportScoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	@Delete({ "delete from wzsport_sport_score", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	@Insert({ "insert into wzsport_sport_score (student_id, term_id, ", "meter50_sprint_time, meter50_sprint_score, ",
			"standing_jump_distance, standing_jump_score, ", "meter1500_run_time, meter1500_run_score, ",
			"abdominal_curl_count, abdominal_curl_score, ", "created_at, updated_at)",
			"values (#{studentId,jdbcType=BIGINT}, #{termId,jdbcType=BIGINT}, ",
			"#{meter50SprintTime,jdbcType=DECIMAL}, #{meter50SprintScore,jdbcType=TINYINT}, ",
			"#{standingJumpDistance,jdbcType=SMALLINT}, #{standingJumpScore,jdbcType=TINYINT}, ",
			"#{meter1500RunTime,jdbcType=SMALLINT}, #{meter1500RunScore,jdbcType=TINYINT}, ",
			"#{abdominalCurlCount,jdbcType=TINYINT}, #{abdominalCurlScore,jdbcType=TINYINT}, ",
			"#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(SportScore record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	int insertSelective(SportScore record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	List<SportScore> selectByExample(SportScoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	@Select({ "select", "id, student_id, term_id, meter50_sprint_time, meter50_sprint_score, standing_jump_distance, ",
			"standing_jump_score, meter1500_run_time, meter1500_run_score, abdominal_curl_count, ",
			"abdominal_curl_score, created_at, updated_at", "from wzsport_sport_score",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.SportScoreMapper.BaseResultMap")
	SportScore selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	int updateByExampleSelective(@Param("record") SportScore record, @Param("example") SportScoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	int updateByExample(@Param("record") SportScore record, @Param("example") SportScoreExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	int updateByPrimaryKeySelective(SportScore record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Fri Nov 24 16:22:45 CST 2017
	 */
	@Update({ "update wzsport_sport_score", "set student_id = #{studentId,jdbcType=BIGINT},",
			"term_id = #{termId,jdbcType=BIGINT},", "meter50_sprint_time = #{meter50SprintTime,jdbcType=DECIMAL},",
			"meter50_sprint_score = #{meter50SprintScore,jdbcType=TINYINT},",
			"standing_jump_distance = #{standingJumpDistance,jdbcType=SMALLINT},",
			"standing_jump_score = #{standingJumpScore,jdbcType=TINYINT},",
			"meter1500_run_time = #{meter1500RunTime,jdbcType=SMALLINT},",
			"meter1500_run_score = #{meter1500RunScore,jdbcType=TINYINT},",
			"abdominal_curl_count = #{abdominalCurlCount,jdbcType=TINYINT},",
			"abdominal_curl_score = #{abdominalCurlScore,jdbcType=TINYINT},",
			"created_at = #{createdAt,jdbcType=TIMESTAMP},", "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(SportScore record);
}