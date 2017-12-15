package com.wzsport.model;

import java.util.ArrayList;
import java.util.List;

public class RunningActivityDataStatisticExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public RunningActivityDataStatisticExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andStudentIdIsNull() {
			addCriterion("student_id is null");
			return (Criteria) this;
		}

		public Criteria andStudentIdIsNotNull() {
			addCriterion("student_id is not null");
			return (Criteria) this;
		}

		public Criteria andStudentIdEqualTo(Long value) {
			addCriterion("student_id =", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotEqualTo(Long value) {
			addCriterion("student_id <>", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThan(Long value) {
			addCriterion("student_id >", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThanOrEqualTo(Long value) {
			addCriterion("student_id >=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThan(Long value) {
			addCriterion("student_id <", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThanOrEqualTo(Long value) {
			addCriterion("student_id <=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdIn(List<Long> values) {
			addCriterion("student_id in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotIn(List<Long> values) {
			addCriterion("student_id not in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdBetween(Long value1, Long value2) {
			addCriterion("student_id between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotBetween(Long value1, Long value2) {
			addCriterion("student_id not between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andActivityIdIsNull() {
			addCriterion("activity_id is null");
			return (Criteria) this;
		}

		public Criteria andActivityIdIsNotNull() {
			addCriterion("activity_id is not null");
			return (Criteria) this;
		}

		public Criteria andActivityIdEqualTo(Long value) {
			addCriterion("activity_id =", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdNotEqualTo(Long value) {
			addCriterion("activity_id <>", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdGreaterThan(Long value) {
			addCriterion("activity_id >", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdGreaterThanOrEqualTo(Long value) {
			addCriterion("activity_id >=", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdLessThan(Long value) {
			addCriterion("activity_id <", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdLessThanOrEqualTo(Long value) {
			addCriterion("activity_id <=", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdIn(List<Long> values) {
			addCriterion("activity_id in", values, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdNotIn(List<Long> values) {
			addCriterion("activity_id not in", values, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdBetween(Long value1, Long value2) {
			addCriterion("activity_id between", value1, value2, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdNotBetween(Long value1, Long value2) {
			addCriterion("activity_id not between", value1, value2, "activityId");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountIsNull() {
			addCriterion("location_total_count is null");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountIsNotNull() {
			addCriterion("location_total_count is not null");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountEqualTo(Integer value) {
			addCriterion("location_total_count =", value, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountNotEqualTo(Integer value) {
			addCriterion("location_total_count <>", value, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountGreaterThan(Integer value) {
			addCriterion("location_total_count >", value, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("location_total_count >=", value, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountLessThan(Integer value) {
			addCriterion("location_total_count <", value, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountLessThanOrEqualTo(Integer value) {
			addCriterion("location_total_count <=", value, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountIn(List<Integer> values) {
			addCriterion("location_total_count in", values, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountNotIn(List<Integer> values) {
			addCriterion("location_total_count not in", values, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountBetween(Integer value1, Integer value2) {
			addCriterion("location_total_count between", value1, value2, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andLocationTotalCountNotBetween(Integer value1, Integer value2) {
			addCriterion("location_total_count not between", value1, value2, "locationTotalCount");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstIsNull() {
			addCriterion("speed_against is null");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstIsNotNull() {
			addCriterion("speed_against is not null");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstEqualTo(Integer value) {
			addCriterion("speed_against =", value, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstNotEqualTo(Integer value) {
			addCriterion("speed_against <>", value, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstGreaterThan(Integer value) {
			addCriterion("speed_against >", value, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstGreaterThanOrEqualTo(Integer value) {
			addCriterion("speed_against >=", value, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstLessThan(Integer value) {
			addCriterion("speed_against <", value, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstLessThanOrEqualTo(Integer value) {
			addCriterion("speed_against <=", value, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstIn(List<Integer> values) {
			addCriterion("speed_against in", values, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstNotIn(List<Integer> values) {
			addCriterion("speed_against not in", values, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstBetween(Integer value1, Integer value2) {
			addCriterion("speed_against between", value1, value2, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andSpeedAgainstNotBetween(Integer value1, Integer value2) {
			addCriterion("speed_against not between", value1, value2, "speedAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstIsNull() {
			addCriterion("distance_per_step_against is null");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstIsNotNull() {
			addCriterion("distance_per_step_against is not null");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstEqualTo(Integer value) {
			addCriterion("distance_per_step_against =", value, "distancePerStepAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstNotEqualTo(Integer value) {
			addCriterion("distance_per_step_against <>", value, "distancePerStepAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstGreaterThan(Integer value) {
			addCriterion("distance_per_step_against >", value, "distancePerStepAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstGreaterThanOrEqualTo(Integer value) {
			addCriterion("distance_per_step_against >=", value, "distancePerStepAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstLessThan(Integer value) {
			addCriterion("distance_per_step_against <", value, "distancePerStepAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstLessThanOrEqualTo(Integer value) {
			addCriterion("distance_per_step_against <=", value, "distancePerStepAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstIn(List<Integer> values) {
			addCriterion("distance_per_step_against in", values, "distancePerStepAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstNotIn(List<Integer> values) {
			addCriterion("distance_per_step_against not in", values, "distancePerStepAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstBetween(Integer value1, Integer value2) {
			addCriterion("distance_per_step_against between", value1, value2, "distancePerStepAgainst");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepAgainstNotBetween(Integer value1, Integer value2) {
			addCriterion("distance_per_step_against not between", value1, value2, "distancePerStepAgainst");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Fri Dec 15 20:34:01 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wzsport_running_activity_data_statistic
     *
     * @mbg.generated do_not_delete_during_merge Fri Nov 17 09:48:29 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}