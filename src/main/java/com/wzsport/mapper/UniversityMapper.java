package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.wzsport.dto.StudentKcalConsumptionDTO;
import com.wzsport.dto.StudentTimeCostedDTO;
import com.wzsport.model.University;
import com.wzsport.model.UniversityExample;

public interface UniversityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	long countByExample(UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	int deleteByExample(UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	@Delete({ "delete from wzsport_university", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	@Insert({ "insert into wzsport_university (name, created_at, ", "updated_at)",
			"values (#{name,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ", "#{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(University record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	int insertSelective(University record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	List<University> selectByExample(UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	@Select({ "select", "id, name, created_at, updated_at", "from wzsport_university",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.UniversityMapper.BaseResultMap")
	University selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	int updateByExampleSelective(@Param("record") University record, @Param("example") UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	int updateByExample(@Param("record") University record, @Param("example") UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	int updateByPrimaryKeySelective(University record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Sun Mar 04 16:47:47 CST 2018
	 */
	@Update({ "update wzsport_university", "set name = #{name,jdbcType=VARCHAR},",
			"created_at = #{createdAt,jdbcType=TIMESTAMP},", "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(University record);

	/**
	* 获取指定大学的学生热量消耗的排名列表
	*
	* @param universityId 大学id
	*/
//	@Select("SELECT student_id, student_name ,SUM(kcal_consumed) as kcal_consumption  from ( "
//			+"SELECT student.id AS student_id, student.name AS student_name ,(runningAct.kcal_consumed) AS kcal_consumed  "
//			+"FROM wzsport_student AS student  "
//			+"JOIN (SELECT student_id,SUM(kcal_consumed) AS kcal_consumed  "
//			+"	     FROM wzsport_running_activity  "
//			+"	 GROUP BY student_id) runningAct  "
//			+"ON student.id = runningAct.student_id  "
//			+"WHERE student.university_id = #{universityId} "
//			+"UNION ALL "
//			+"SELECT student.id AS student_id, student.name AS student_name ,(areaAct.kcal_consumed) AS kcal_consumed  "
//			+"FROM wzsport_student AS student  "
//			+"JOIN (SELECT student_id,SUM(kcal_consumed) AS kcal_consumed  "
//			+"	     FROM wzsport_area_activity  "
//			+"	 GROUP BY student_id) areaAct  "
//			+"ON student.id = areaAct.student_id  "
//			+"WHERE student.university_id = #{universityId} ) st "
//			+"GROUP BY st.student_id "
//			+"ORDER BY SUM(kcal_consumed) desc")
	@Select("SELECT student_id,name as student_name,avatar_url,SUM(kcal_consumed) AS kcal_consumption\n" +
			"FROM wzsport_student_sport_consume_statistic\n" +
			"WHERE university_id =  #{universityId}\n" +
			"GROUP BY student_id\n" +
			"ORDER BY SUM(kcal_consumed) DESC")
	List<StudentKcalConsumptionDTO> getKcalCostedRanking(@Param("universityId") long universityId);

	/**
	* 获取指定大学的学生运动时长的排名列表
	*
	* @param universityId 大学id
	*/
//	@Select("SELECT student_id, student_name ,SUM(time_costed) time_costed  from ( "
//			+ "SELECT student.id AS student_id, student.name AS student_name ,(runningAct.cost_time) AS time_costed  "
//			+ "FROM wzsport_student AS student  "
//			+ "JOIN (SELECT student_id,SUM(cost_time) AS cost_time  "
//			+ "		   FROM wzsport_running_activity "
//			+ "	   GROUP BY student_id) runningAct  "
//			+ "ON student.id = runningAct.student_id  "
//			+ "WHERE student.university_id = #{universityId} "
//			+ "UNION ALL "
//			+ "SELECT student.id AS student_id, student.name AS student_name ,(areaAct.cost_time) AS time_costed  "
//			+ "FROM wzsport_student AS student  "
//			+ "JOIN (SELECT student_id,SUM(cost_time) AS cost_time  "
//			+ "		   FROM wzsport_area_activity  "
//			+ "	   GROUP BY student_id) areaAct  "
//			+ "ON student.id = areaAct.student_id  "
//			+ "WHERE student.university_id = #{universityId} ) st "
//			+ "GROUP BY st.student_id "
//			+ "ORDER BY SUM(time_costed) desc ")
	@Select("SELECT student_id,name as student_name,avatar_url,SUM(cost_time) AS time_costed\n" +
			"FROM wzsport_student_sport_consume_statistic\n" +
			"WHERE university_id = #{universityId}\n" +
			"GROUP BY student_id\n" +
			"ORDER BY SUM(cost_time) DESC")
	List<StudentTimeCostedDTO> getTimeCostedRanking(@Param("universityId") long universityId);
}