package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.Student;
import com.wzsport.model.StudentExample;

public interface StudentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	long countByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int deleteByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Delete({ "delete from wzsport_student", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Insert({ "insert into wzsport_student (user_id, class_id, ", "university_id, student_no, ",
			"is_man, name, created_at, ", "updated_at)",
			"values (#{userId,jdbcType=BIGINT}, #{classId,jdbcType=BIGINT}, ",
			"#{universityId,jdbcType=BIGINT}, #{studentNo,jdbcType=VARCHAR}, ",
			"#{man,jdbcType=BIT}, #{name,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
			"#{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int insertSelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	List<Student> selectByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Select({ "select", "id, user_id, class_id, university_id, student_no, is_man, name, created_at, ", "updated_at",
			"from wzsport_student", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.StudentMapper.BaseResultMap")
	Student selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	int updateByPrimaryKeySelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	@Update({ "update wzsport_student", "set user_id = #{userId,jdbcType=BIGINT},",
			"class_id = #{classId,jdbcType=BIGINT},", "university_id = #{universityId,jdbcType=BIGINT},",
			"student_no = #{studentNo,jdbcType=VARCHAR},", "is_man = #{man,jdbcType=BIT},",
			"name = #{name,jdbcType=VARCHAR},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
			"updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Student record);
}