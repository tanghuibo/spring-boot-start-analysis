package io.github.tanghuibo.analysisstart.store;

import io.github.tanghuibo.analysisstart.vo.BeanStartInfo;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author tanghuibo
 * @date 2020/9/19下午10:46
 */
public class BeanStartStore {

    public static Map<String, BeanStartInfo> store = new ConcurrentHashMap<>();

    public static Long appInitTime = System.currentTimeMillis();


    public static void setStart(String beanName, String className) {
        BeanStartInfo beanStartInfo = new BeanStartInfo();
        beanStartInfo.setBeanName(beanName);
        beanStartInfo.setClassName(className);
        beanStartInfo.setStartTime(getTime());
        beanStartInfo.setEndTime(0L);
        store.put(beanName, beanStartInfo);
    }

    private static Long getTime() {
        return System.currentTimeMillis() - appInitTime;
    }

    public static void setEnd(String beanName) {
        BeanStartInfo beanStartInfo = store.get(beanName);
        if(beanStartInfo != null) {
            beanStartInfo.setEndTime(getTime());
            beanStartInfo.setCostTime(beanStartInfo.getEndTime() - beanStartInfo.getStartTime());
        }
    }

    /**
     * 获取全部
     * @return
     */
    public static List<BeanStartInfo> getAll() {
        return store.values().stream().collect(Collectors.toList());
    }
}
