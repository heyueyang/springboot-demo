package com.fiprs.springbootdemo.dao;

import com.fiprs.springbootdemo.entity.THjjczzRkhz;
import com.fiprs.springbootdemo.entity.THjjczzRkhzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THjjczzRkhzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int countByExample(THjjczzRkhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int deleteByExample(THjjczzRkhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insert(THjjczzRkhz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insertSelective(THjjczzRkhz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    List<THjjczzRkhz> selectByExample(THjjczzRkhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") THjjczzRkhz record, @Param("example") THjjczzRkhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_rkhz
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExample(@Param("record") THjjczzRkhz record, @Param("example") THjjczzRkhzExample example);
}