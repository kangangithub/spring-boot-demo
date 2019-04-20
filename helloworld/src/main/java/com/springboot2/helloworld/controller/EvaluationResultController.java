package com.springboot2.helloworld.controller;

import com.springboot2.helloworld.domain.EvaluationResult;
import com.springboot2.helloworld.service.EvaluationResultService;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Akang
 * @Date: 2018/7/27 18:11
 * @Description:
 */
@RestController
@RequestMapping(value = "/evaluationResult")
public class EvaluationResultController {

    /**
     * 一个接口多个实现, @Autowired, @Qualifier("beanID") 可以用@Resource代替
     * Spring创建bean时bean ID 默认类名首字母小写, 也可自定义
     */
    @Autowired
    @Qualifier("evaluationResultServiceImpl")
//    @Resource
    private EvaluationResultService evaluationResultService;

    /**
     * @RequestParam :
     * POST: http://127.0.0.1:8083/evaluationResult/getAll, 参数pageNum, pageSize以键值对形式保存在form-data中(表单提交)
     * GET: http://127.0.0.1:8083/evaluationResult/getAll?pageNum=1&pageSize=10
     */
    @ResponseBody
    @PostMapping("/getAll")
    public List<EvaluationResult> getAll(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        return evaluationResultService.queryAllByPage(pageNum, pageSize);
    }

    /**
     * URL: http://127.0.0.1:8083/evaluationResult/getByAgentCode/1111150075
     *
     * @RequestBody : 用于读取Request请求的body部分数据，使用系统默认配置的HttpMessageConverter进行解析，然后把相应的数据绑定到要返回的对象(可以是String, 可以是Map....)上,
     * 再把HttpMessageConverter返回的对象数据绑定到 controller中方法的参数上。
     */
    @ResponseBody
    @PostMapping("/getByAgentCode/{agentCode}")
    public List getByAgentCode(@PathVariable(value = "agentCode") String agentCode, @RequestBody Map<String, Object> paramMap) {
        return evaluationResultService.queryByAgentCode(agentCode, MapUtils.getIntValue(paramMap, "pageNum"), MapUtils.getInteger(paramMap, "pageSize"));
    }

    /**
     * @PathVariable :参数拼接URL
     * URL: http://127.0.0.1:8083/evaluationResult/getOneById/10
     */
    @ResponseBody
    @PostMapping("/getOneById/{id}")
    public EvaluationResult getOneById(@PathVariable(value = "id") int id) {
        return evaluationResultService.queryById(id);
    }

//    测试JSON 保存
//    {   "overAll": "overall",   "riskWrite": "defaultStr1",   "productType1": "severeDisease",   "productCode1": "100000000030,100000000031,100000000032",   "copyWrite1": "customizeStr1",   "productType2": "healthCare",   "productCode2": "100000000030,100000000031,100000000032",   "copyWrite2": "customizeStr1",   "productType3": "accident",   "productCode3": "100000000030,100000000031,100000000032",   "copyWrite3": "customizeStr1",   "evaluationPerson": "SpringBoot",   "agentCode": "1111150128",   "createTime": "2018-06-19T02:26:44.000+0000" }
//    测试JSON 修改
//    {   "id": 130, "overAll": "overall",   "riskWrite": "defaultStr1",   "productType1": "severeDisease",   "productCode1": "100000000030,100000000031,100000000032",   "copyWrite1": "customizeStr1",   "productType2": "healthCare",   "productCode2": "100000000030,100000000031,100000000032",   "copyWrite2": "customizeStr1",   "productType3": "accident",   "productCode3": "100000000030,100000000031,100000000032",   "copyWrite3": "customizeStr1",   "evaluationPerson": "SpringBoot",   "agentCode": "1111150128",   "createTime": "2018-06-19T02:26:44.000+0000" }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    public boolean save(@RequestBody EvaluationResult evaluationResult) {
        return evaluationResultService.saveEvaluationResult(evaluationResult);
    }

    /**
     * 删除
     */
    @ResponseBody
    @PostMapping("/drop/{id}")
    public boolean drop(@PathVariable(value = "id") int id) {
        return evaluationResultService.dropById(id);
    }

    /**
     * 更新
     */
    @ResponseBody
    @PostMapping("/modify/{id}")
    public EvaluationResult modifyById(@PathVariable(value = "id") int id, @RequestBody EvaluationResult evaluationResult) {
        return evaluationResultService.modifyById(evaluationResult);
    }

}
