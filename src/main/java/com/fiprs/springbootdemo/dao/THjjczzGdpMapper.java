package com.fiprs.springbootdemo.dao;

import com.fiprs.springbootdemo.entity.THjjczzGdp;
import com.fiprs.springbootdemo.entity.THjjczzGdpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THjjczzGdpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int countByExample(THjjczzGdpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int deleteByExample(THjjczzGdpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insert(THjjczzGdp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insertSelective(THjjczzGdp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    List<THjjczzGdp> selectByExample(THjjczzGdpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") THjjczzGdp record, @Param("example") THjjczzGdpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_gdp
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExample(@Param("record") THjjczzGdp record, @Param("example") THjjczzGdpExample example);
}