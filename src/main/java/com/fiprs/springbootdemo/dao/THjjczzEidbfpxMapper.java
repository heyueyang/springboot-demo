package com.fiprs.springbootdemo.dao;

import com.fiprs.springbootdemo.entity.THjjczzEidbfpx;
import com.fiprs.springbootdemo.entity.THjjczzEidbfpxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THjjczzEidbfpxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eidbfpx
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int countByExample(THjjczzEidbfpxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eidbfpx
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int deleteByExample(THjjczzEidbfpxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eidbfpx
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insert(THjjczzEidbfpx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eidbfpx
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insertSelective(THjjczzEidbfpx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eidbfpx
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    List<THjjczzEidbfpx> selectByExample(THjjczzEidbfpxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eidbfpx
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") THjjczzEidbfpx record, @Param("example") THjjczzEidbfpxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjjczz_eidbfpx
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExample(@Param("record") THjjczzEidbfpx record, @Param("example") THjjczzEidbfpxExample example);
}