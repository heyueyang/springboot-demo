package com.fiprs.springbootdemo.dao;

import com.fiprs.springbootdemo.entity.THjjczzSbei;
import com.fiprs.springbootdemo.entity.THjjczzSbeiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THjjczzSbeiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_sbei
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int countByExample(THjjczzSbeiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_sbei
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int deleteByExample(THjjczzSbeiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_sbei
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insert(THjjczzSbei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_sbei
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insertSelective(THjjczzSbei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_sbei
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    List<THjjczzSbei> selectByExample(THjjczzSbeiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_sbei
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") THjjczzSbei record, @Param("example") THjjczzSbeiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_sbei
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExample(@Param("record") THjjczzSbei record, @Param("example") THjjczzSbeiExample example);
}