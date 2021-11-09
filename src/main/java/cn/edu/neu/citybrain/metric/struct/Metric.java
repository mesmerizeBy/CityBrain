package cn.edu.neu.citybrain.metric.struct;

public class Metric {
    private String jobName;
    private String dt;
    private long stepIndex1mi;

    private double throughput;
    private double delay;

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getDt() {
        return dt;
    }

    public void setStepIndex1mi(long stepIndex1mi) {
        this.stepIndex1mi = stepIndex1mi;
    }

    public long getStepIndex1mi() {
        return stepIndex1mi;
    }

    public void setThroughput(double throughput) {
        this.throughput = throughput;
    }

    public double getThroughput() {
        return throughput;
    }

    public void setDelay(double delay) {
        this.delay = delay;
    }

    public double getDelay() {
        return delay;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "jobName='" + jobName + '\'' +
                ", dt='" + dt + '\'' +
                ", stepIndex1mi=" + stepIndex1mi +
                ", throughput=" + throughput +
                ", delay=" + delay +
                '}';
    }
}
