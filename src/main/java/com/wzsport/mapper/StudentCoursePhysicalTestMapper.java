package com.wzsport.mapper;

import com.wzsport.model.StudentCoursePhysicalTest;
import com.wzsport.model.StudentCoursePhysicalTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface StudentCoursePhysicalTestMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sports_course_physical_test_view
	 * @mbg.generated  Mon Nov 20 14:03:21 CST 2017
	 */
	long countByExample(StudentCoursePhysicalTestExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sports_course_physical_test_view
	 * @mbg.generated  Mon Nov 20 14:03:21 CST 2017
	 */
	int deleteByExample(StudentCoursePhysicalTestExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sports_course_physical_test_view
	 * @mbg.generated  Mon Nov 20 14:03:21 CST 2017
	 */
	@Insert({ "insert into wzsport_student_sports_course_physical_test_view (university_id, college_name, ",
			"grade_no, class_no, ", "class_name, student_no, ", "nationality_no, nationality_name, ",
			"student_name, is_man, ", "birthday, home_address, ", "height, weight, ",
			"vital_capacity, fifty_run_time, ", "standing_long_jump, sit_and_reach, ",
			"eight_hundred_run_time, one_thousand_run_time, ", "one_minute_sit_up, pull_up, ",
			"is_tested, is_free_test, total_score, ", "school_year, term, course_name, ", "teacher_name, course_time, ",
			"major_name, is_pass)", "values (#{universityId,jdbcType=BIGINT}, #{collegeName,jdbcType=VARCHAR}, ",
			"#{gradeNo,jdbcType=BIGINT}, #{classNo,jdbcType=BIGINT}, ",
			"#{className,jdbcType=VARCHAR}, #{studentNo,jdbcType=VARCHAR}, ",
			"#{nationalityNo,jdbcType=BIGINT}, #{nationalityName,jdbcType=VARCHAR}, ",
			"#{studentName,jdbcType=VARCHAR}, #{isMan,jdbcType=BIT}, ",
			"#{birthday,jdbcType=DATE}, #{homeAddress,jdbcType=VARCHAR}, ",
			"#{height,jdbcType=DECIMAL}, #{weight,jdbcType=DECIMAL}, ",
			"#{vitalCapacity,jdbcType=BIGINT}, #{fiftyRunTime,jdbcType=DECIMAL}, ",
			"#{standingLongJump,jdbcType=INTEGER}, #{sitAndReach,jdbcType=DECIMAL}, ",
			"#{eightHundredRunTime,jdbcType=DECIMAL}, #{oneThousandRunTime,jdbcType=DECIMAL}, ",
			"#{oneMinuteSitUp,jdbcType=SMALLINT}, #{pullUp,jdbcType=SMALLINT}, ",
			"#{isTested,jdbcType=BIT}, #{isFreeTest,jdbcType=BIT}, #{totalScore,jdbcType=DECIMAL}, ",
			"#{schoolYear,jdbcType=VARCHAR}, #{term,jdbcType=BIT}, #{courseName,jdbcType=VARCHAR}, ",
			"#{teacherName,jdbcType=VARCHAR}, #{courseTime,jdbcType=VARCHAR}, ",
			"#{majorName,jdbcType=VARCHAR}, #{isPass,jdbcType=BIT})" })
	int insert(StudentCoursePhysicalTest record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sports_course_physical_test_view
	 * @mbg.generated  Mon Nov 20 14:03:21 CST 2017
	 */
	int insertSelective(StudentCoursePhysicalTest record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sports_course_physical_test_view
	 * @mbg.generated  Mon Nov 20 14:03:21 CST 2017
	 */
	List<StudentCoursePhysicalTest> selectByExample(StudentCoursePhysicalTestExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sports_course_physical_test_view
	 * @mbg.generated  Mon Nov 20 14:03:21 CST 2017
	 */
	int updateByExampleSelective(@Param("record") StudentCoursePhysicalTest record,
			@Param("example") StudentCoursePhysicalTestExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sports_course_physical_test_view
	 * @mbg.generated  Mon Nov 20 14:03:21 CST 2017
	 */
	int updateByExample(@Param("record") StudentCoursePhysicalTest record,
			@Param("example") StudentCoursePhysicalTestExample example);
}