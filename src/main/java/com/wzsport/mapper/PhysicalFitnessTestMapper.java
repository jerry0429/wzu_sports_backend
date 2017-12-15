package com.wzsport.mapper;

import com.wzsport.model.PhysicalFitnessTest;
import com.wzsport.model.PhysicalFitnessTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface PhysicalFitnessTestMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	long countByExample(PhysicalFitnessTestExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int deleteByExample(PhysicalFitnessTestExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Delete({ "delete from wzsport_physical_fitness_test", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Insert({ "insert into wzsport_physical_fitness_test (university_id, grade, ", "name, class_no, class_name, ",
			"college, is_man, birth, ", "nation_no, nation_name, ", "student_no, remark, ",
			"total_points, total_points_level, ", "stature, weight, ", "stature_weight_point, stature_weight_level, ",
			"BMI, vital_capacity, ", "vital_capacity_point, \"vital _capacity_level\", ",
			"stand_jump, stand_jump_point, ", "stand_jump_level, sitting_flexion, ",
			"sitting_flexion_point, sitting_flexion_level, ", "sit_ups, sit_ups_point, ", "sit_ups_level, push_ups, ",
			"push_ups_point, push_ups_level, ", "fifty_run, fifty_run_point, ", "fifty_run_level, eight_hundred_run, ",
			"eight_hundred_point, eight_hundred_level, ", "one_thousand_run, one_thousand_point, ",
			"one_thousand_level)", "values (#{universityId,jdbcType=BIGINT}, #{grade,jdbcType=BIGINT}, ",
			"#{name,jdbcType=VARCHAR}, #{classNo,jdbcType=BIGINT}, #{className,jdbcType=VARCHAR}, ",
			"#{college,jdbcType=VARCHAR}, #{isMan,jdbcType=BIT}, #{birth,jdbcType=DATE}, ",
			"#{nationNo,jdbcType=SMALLINT}, #{nationName,jdbcType=VARCHAR}, ",
			"#{studentNo,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
			"#{totalPoints,jdbcType=DOUBLE}, #{totalPointsLevel,jdbcType=VARCHAR}, ",
			"#{stature,jdbcType=INTEGER}, #{weight,jdbcType=INTEGER}, ",
			"#{statureWeightPoint,jdbcType=INTEGER}, #{statureWeightLevel,jdbcType=VARCHAR}, ",
			"#{bmi,jdbcType=DOUBLE}, #{vitalCapacity,jdbcType=INTEGER}, ",
			"#{vitalCapacityPoint,jdbcType=INTEGER}, #{vitalCapacityLevel,jdbcType=VARCHAR}, ",
			"#{standJump,jdbcType=INTEGER}, #{standJumpPoint,jdbcType=INTEGER}, ",
			"#{standJumpLevel,jdbcType=VARCHAR}, #{sittingFlexion,jdbcType=DOUBLE}, ",
			"#{sittingFlexionPoint,jdbcType=INTEGER}, #{sittingFlexionLevel,jdbcType=VARCHAR}, ",
			"#{sitUps,jdbcType=INTEGER}, #{sitUpsPoint,jdbcType=INTEGER}, ",
			"#{sitUpsLevel,jdbcType=VARCHAR}, #{pushUps,jdbcType=INTEGER}, ",
			"#{pushUpsPoint,jdbcType=INTEGER}, #{pushUpsLevel,jdbcType=VARCHAR}, ",
			"#{fiftyRun,jdbcType=DOUBLE}, #{fiftyRunPoint,jdbcType=INTEGER}, ",
			"#{fiftyRunLevel,jdbcType=VARCHAR}, #{eightHundredRun,jdbcType=DOUBLE}, ",
			"#{eightHundredPoint,jdbcType=INTEGER}, #{eightHundredLevel,jdbcType=VARCHAR}, ",
			"#{oneThousandRun,jdbcType=DOUBLE}, #{oneThousandPoint,jdbcType=INTEGER}, ",
			"#{oneThousandLevel,jdbcType=VARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(PhysicalFitnessTest record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int insertSelective(PhysicalFitnessTest record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	List<PhysicalFitnessTest> selectByExample(PhysicalFitnessTestExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Select({ "select", "id, university_id, grade, name, class_no, class_name, college, is_man, birth, ",
			"nation_no, nation_name, student_no, remark, total_points, total_points_level, ",
			"stature, weight, stature_weight_point, stature_weight_level, BMI, vital_capacity, ",
			"vital_capacity_point, \"vital _capacity_level\", stand_jump, stand_jump_point, ",
			"stand_jump_level, sitting_flexion, sitting_flexion_point, sitting_flexion_level, ",
			"sit_ups, sit_ups_point, sit_ups_level, push_ups, push_ups_point, push_ups_level, ",
			"fifty_run, fifty_run_point, fifty_run_level, eight_hundred_run, eight_hundred_point, ",
			"eight_hundred_level, one_thousand_run, one_thousand_point, one_thousand_level",
			"from wzsport_physical_fitness_test", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.PhysicalFitnessTestMapper.BaseResultMap")
	PhysicalFitnessTest selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int updateByExampleSelective(@Param("record") PhysicalFitnessTest record,
			@Param("example") PhysicalFitnessTestExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int updateByExample(@Param("record") PhysicalFitnessTest record,
			@Param("example") PhysicalFitnessTestExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int updateByPrimaryKeySelective(PhysicalFitnessTest record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_physical_fitness_test
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Update({ "update wzsport_physical_fitness_test", "set university_id = #{universityId,jdbcType=BIGINT},",
			"grade = #{grade,jdbcType=BIGINT},", "name = #{name,jdbcType=VARCHAR},",
			"class_no = #{classNo,jdbcType=BIGINT},", "class_name = #{className,jdbcType=VARCHAR},",
			"college = #{college,jdbcType=VARCHAR},", "is_man = #{isMan,jdbcType=BIT},",
			"birth = #{birth,jdbcType=DATE},", "nation_no = #{nationNo,jdbcType=SMALLINT},",
			"nation_name = #{nationName,jdbcType=VARCHAR},", "student_no = #{studentNo,jdbcType=VARCHAR},",
			"remark = #{remark,jdbcType=VARCHAR},", "total_points = #{totalPoints,jdbcType=DOUBLE},",
			"total_points_level = #{totalPointsLevel,jdbcType=VARCHAR},", "stature = #{stature,jdbcType=INTEGER},",
			"weight = #{weight,jdbcType=INTEGER},", "stature_weight_point = #{statureWeightPoint,jdbcType=INTEGER},",
			"stature_weight_level = #{statureWeightLevel,jdbcType=VARCHAR},", "BMI = #{bmi,jdbcType=DOUBLE},",
			"vital_capacity = #{vitalCapacity,jdbcType=INTEGER},",
			"vital_capacity_point = #{vitalCapacityPoint,jdbcType=INTEGER},",
			"\"vital _capacity_level\" = #{vitalCapacityLevel,jdbcType=VARCHAR},",
			"stand_jump = #{standJump,jdbcType=INTEGER},", "stand_jump_point = #{standJumpPoint,jdbcType=INTEGER},",
			"stand_jump_level = #{standJumpLevel,jdbcType=VARCHAR},",
			"sitting_flexion = #{sittingFlexion,jdbcType=DOUBLE},",
			"sitting_flexion_point = #{sittingFlexionPoint,jdbcType=INTEGER},",
			"sitting_flexion_level = #{sittingFlexionLevel,jdbcType=VARCHAR},", "sit_ups = #{sitUps,jdbcType=INTEGER},",
			"sit_ups_point = #{sitUpsPoint,jdbcType=INTEGER},", "sit_ups_level = #{sitUpsLevel,jdbcType=VARCHAR},",
			"push_ups = #{pushUps,jdbcType=INTEGER},", "push_ups_point = #{pushUpsPoint,jdbcType=INTEGER},",
			"push_ups_level = #{pushUpsLevel,jdbcType=VARCHAR},", "fifty_run = #{fiftyRun,jdbcType=DOUBLE},",
			"fifty_run_point = #{fiftyRunPoint,jdbcType=INTEGER},",
			"fifty_run_level = #{fiftyRunLevel,jdbcType=VARCHAR},",
			"eight_hundred_run = #{eightHundredRun,jdbcType=DOUBLE},",
			"eight_hundred_point = #{eightHundredPoint,jdbcType=INTEGER},",
			"eight_hundred_level = #{eightHundredLevel,jdbcType=VARCHAR},",
			"one_thousand_run = #{oneThousandRun,jdbcType=DOUBLE},",
			"one_thousand_point = #{oneThousandPoint,jdbcType=INTEGER},",
			"one_thousand_level = #{oneThousandLevel,jdbcType=VARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(PhysicalFitnessTest record);
}