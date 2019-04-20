package com.springboot2.helloworld.service;

import com.github.pagehelper.PageHelper;
import com.springboot2.helloworld.dao.EvaluationResultMapper;
import com.springboot2.helloworld.domain.EvaluationResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: Akang
 * @Date: 2018/7/27 18:08
 * @Description:
 */

@Service
@Transactional(rollbackFor = {RuntimeException.class, Exception.class})
public class EvaluationResultServiceImpl implements EvaluationResultService {

    @Resource
    private EvaluationResultMapper evaluationResultMapper;

    @Override
    public List<EvaluationResult> queryAllByPage(int pageNum, int pageSize) {
        //使用分页插件,核心代码就这一行
        PageHelper.startPage(pageNum, pageSize);
        // 获取
        List<EvaluationResult> evaluationResultList = evaluationResultMapper.selectAll();
        return evaluationResultList;
    }

    @Override
    public List<EvaluationResult> queryByAgentCode(String agentCode, int pageNum, int pageSize) {
        //使用分页插件,核心代码就这一行
        PageHelper.startPage(pageNum, pageSize);
        // 获取
        List<EvaluationResult> evaluationResultList = evaluationResultMapper.selectByAgentCode(agentCode);
        return evaluationResultList;
    }

    @Override
    public boolean saveEvaluationResult(EvaluationResult evaluationResult) {
        return evaluationResultMapper.insertSelective(evaluationResult) == 1;
    }

    @Override
    public EvaluationResult queryById(Integer id) {
        return evaluationResultMapper.selectByPrimaryKey(id);
    }

    @Override
    public EvaluationResult modifyById(EvaluationResult evaluationResult) {
        /**
         * 更新成功,返回更新的内容
         * 更新失败,返回数据库现有的数据
         */
        if (evaluationResultMapper.updateByPrimaryKeySelective(evaluationResult) == 1) {
            return evaluationResult;
        }
        return queryById(evaluationResult.getId());
    }

    @Override
    public boolean dropById(Integer id) {
        return evaluationResultMapper.deleteByPrimaryKey(id) == 1;
    }
}
