package com.fiprs.springbootdemo.dao;

import com.fiprs.springbootdemo.entity.THjcczzTdly;
import com.fiprs.springbootdemo.entity.THjcczzTdlyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THjcczzTdlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tdly
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int countByExample(THjcczzTdlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tdly
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int deleteByExample(THjcczzTdlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tdly
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insert(THjcczzTdly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tdly
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insertSelective(THjcczzTdly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tdly
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    List<THjcczzTdly> selectByExample(THjcczzTdlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tdly
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") THjcczzTdly record, @Param("example") THjcczzTdlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tdly
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExample(@Param("record") THjcczzTdly record, @Param("example") THjcczzTdlyExample example);
}