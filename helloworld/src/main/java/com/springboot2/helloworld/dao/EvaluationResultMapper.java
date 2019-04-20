package com.springboot2.helloworld.dao;

import com.springboot2.helloworld.domain.EvaluationResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface EvaluationResultMapper {

    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(EvaluationResult record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(EvaluationResult record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    EvaluationResult selectByPrimaryKey(Integer id);

    /**
     * 获取数据库所有记录
     */
    List<EvaluationResult> selectAll();

    /**
     * 根据agentCode获取一条数据库记录
     */
    List<EvaluationResult> selectByAgentCode(String agentCode);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(EvaluationResult record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(EvaluationResult record);
}