package io.github.tanghuibo.analysisstart.controller;

import io.github.tanghuibo.analysisstart.store.BeanStartStore;
import io.github.tanghuibo.analysisstart.vo.BeanStartInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;

/**
 * @author tanghuibo
 * @date 2020/9/19下午11:01
 */
@RequestMapping("beanStartAnalysis")
@RestController
public class BeanStartController {

    @GetMapping
    public List<BeanStartInfo> get(@RequestParam("order") String order) {
        List<BeanStartInfo> list = BeanStartStore.getAll();
        if("startTime".equals(order)) {
            list.sort(Comparator.comparingLong(BeanStartInfo::getStartTime));
        } else if("endTime".equals(order)) {
            list.sort(Comparator.comparingLong(BeanStartInfo::getEndTime));
        } else if("costTime".equals(order)) {
            list.sort(Comparator.comparingLong(BeanStartInfo::getCostTime).reversed());
        }
        return list;
    }
}
