package com.wzsport.model;

public class Privilege {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_privilege.id
     * @mbg.generated  Fri Nov 10 17:18:19 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_privilege.table_name
     * @mbg.generated  Fri Nov 10 17:18:19 CST 2017
     */
    private String tableName;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_privilege.id
     * @return  the value of wzsport_privilege.id
     * @mbg.generated  Fri Nov 10 17:18:19 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_privilege.id
     * @param id  the value for wzsport_privilege.id
     * @mbg.generated  Fri Nov 10 17:18:19 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_privilege.table_name
     * @return  the value of wzsport_privilege.table_name
     * @mbg.generated  Fri Nov 10 17:18:19 CST 2017
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_privilege.table_name
     * @param tableName  the value for wzsport_privilege.table_name
     * @mbg.generated  Fri Nov 10 17:18:19 CST 2017
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}