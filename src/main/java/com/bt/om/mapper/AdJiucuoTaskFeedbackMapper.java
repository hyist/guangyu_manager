package com.bt.om.mapper;

import com.bt.om.entity.AdJiucuoTaskFeedback;

public interface AdJiucuoTaskFeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_jiucuo_task_feedback
     *
     * @mbggenerated Sun Jan 21 14:59:02 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_jiucuo_task_feedback
     *
     * @mbggenerated Sun Jan 21 14:59:02 CST 2018
     */
    int insert(AdJiucuoTaskFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_jiucuo_task_feedback
     *
     * @mbggenerated Sun Jan 21 14:59:02 CST 2018
     */
    int insertSelective(AdJiucuoTaskFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_jiucuo_task_feedback
     *
     * @mbggenerated Sun Jan 21 14:59:02 CST 2018
     */
    AdJiucuoTaskFeedback selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_jiucuo_task_feedback
     *
     * @mbggenerated Sun Jan 21 14:59:02 CST 2018
     */
    int updateByPrimaryKeySelective(AdJiucuoTaskFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_jiucuo_task_feedback
     *
     * @mbggenerated Sun Jan 21 14:59:02 CST 2018
     */
    int updateByPrimaryKey(AdJiucuoTaskFeedback record);

    AdJiucuoTaskFeedback selectByTaskId(Integer id);
}