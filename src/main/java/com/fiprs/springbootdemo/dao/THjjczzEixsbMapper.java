package com.fiprs.springbootdemo.dao;

import com.fiprs.springbootdemo.entity.THjjczzEixsb;
import com.fiprs.springbootdemo.entity.THjjczzEixsbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THjjczzEixsbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eixsb
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int countByExample(THjjczzEixsbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eixsb
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int deleteByExample(THjjczzEixsbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eixsb
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insert(THjjczzEixsb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eixsb
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insertSelective(THjjczzEixsb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eixsb
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    List<THjjczzEixsb> selectByExample(THjjczzEixsbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eixsb
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") THjjczzEixsb record, @Param("example") THjjczzEixsbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eixsb
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExample(@Param("record") THjjczzEixsb record, @Param("example") THjjczzEixsbExample example);
}