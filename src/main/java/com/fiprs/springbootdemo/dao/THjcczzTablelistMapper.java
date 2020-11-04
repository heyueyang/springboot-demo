package com.fiprs.springbootdemo.dao;

import com.fiprs.springbootdemo.entity.THjcczzTablelist;
import com.fiprs.springbootdemo.entity.THjcczzTablelistExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface THjcczzTablelistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tablelist
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int countByExample(THjcczzTablelistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tablelist
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int deleteByExample(THjcczzTablelistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tablelist
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insert(THjcczzTablelist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tablelist
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int insertSelective(THjcczzTablelist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tablelist
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    List<THjcczzTablelist> selectByExample(THjcczzTablelistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tablelist
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") THjcczzTablelist record, @Param("example") THjcczzTablelistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hjcczz_tablelist
     *
     * @mbggenerated Wed Nov 04 15:15:47 CST 2020
     */
    int updateByExample(@Param("record") THjcczzTablelist record, @Param("example") THjcczzTablelistExample example);
}