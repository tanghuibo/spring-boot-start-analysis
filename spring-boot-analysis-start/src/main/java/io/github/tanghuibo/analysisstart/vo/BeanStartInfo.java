package io.github.tanghuibo.analysisstart.vo;

/**
 * @author tanghuibo
 * @date 2020/9/19下午10:42
 */
public class BeanStartInfo {

    /**
     * bean名称
     */
    private String beanName;

    /**
     * 类名
     */
    private String className;

    /**
     * 启动时间
     */
    private Long startTime;

    /**
     * 启动完成时间
     */
    private Long endTime;

    /**
     * 花费时间
     */
    private Long costTime;


    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getCostTime() {
        return costTime;
    }

    public void setCostTime(Long costTime) {
        this.costTime = costTime;
    }
}
