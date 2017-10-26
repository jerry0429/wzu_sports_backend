package com.wzsport.mapper;

import com.wzsport.model.ClientWechatInfo;
import com.wzsport.model.ClientWechatInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ClientWechatInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	long countByExample(ClientWechatInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	int deleteByExample(ClientWechatInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	@Delete({ "delete from wzsport_client_wechat_info", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	@Insert({ "insert into wzsport_client_wechat_info (open_id, user_id)",
			"values (#{openId,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(ClientWechatInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	int insertSelective(ClientWechatInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	List<ClientWechatInfo> selectByExample(ClientWechatInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	@Select({ "select", "id, open_id, user_id", "from wzsport_client_wechat_info", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.ClientWechatInfoMapper.BaseResultMap")
	ClientWechatInfo selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	int updateByExampleSelective(@Param("record") ClientWechatInfo record,
			@Param("example") ClientWechatInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	int updateByExample(@Param("record") ClientWechatInfo record, @Param("example") ClientWechatInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	int updateByPrimaryKeySelective(ClientWechatInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_wechat_info
	 * @mbg.generated  Mon Aug 28 14:24:51 CST 2017
	 */
	@Update({ "update wzsport_client_wechat_info", "set open_id = #{openId,jdbcType=VARCHAR},",
			"user_id = #{userId,jdbcType=BIGINT}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(ClientWechatInfo record);
}