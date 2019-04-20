package com.springboot2.helloworld.service;

import com.springboot2.helloworld.domain.EvaluationResult;

import java.util.List;

/**
 * @Auther: Akang
 * @Date: 2018/7/27 17:58
 * @Description:
 */
public interface EvaluationResultService {
    /**
     * 根据ID获取一条数据库记录
     *
     * @param id ID
     */
    EvaluationResult queryById(Integer id);

    /**
     * 获取所有记录: 分页
     *
     * @param pageNum  当前页码
     * @param pageSize 每页条数
     */
    List<EvaluationResult> queryAllByPage(int pageNum, int pageSize);

    /**
     * 分页查询用户下所有记录
     *
     * @param agentCode 用户编号
     * @param pageNum   当前页码
     * @param pageSize  每页条数
     */
    List<EvaluationResult> queryByAgentCode(String agentCode, int pageNum, int pageSize);

    /**
     * 保存
     *
     * @param evaluationResult 需保存的信息
     * @return 执行结果
     */
    boolean saveEvaluationResult(EvaluationResult evaluationResult);

    /**
     * 修改
     *
     * @param evaluationResult 需修改的信息
     * @return 更新成功, 返回更新的内容; 更新失败,返回数据库现有的数据
     */
    EvaluationResult modifyById(EvaluationResult evaluationResult);

    /**
     * 删除
     *
     * @param id ID
     * @return 执行结果
     */
    boolean dropById(Integer id);
}
