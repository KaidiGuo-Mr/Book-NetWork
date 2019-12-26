package bean;

//访问
public class VisitInfo {
    private Integer visitId;         //访问id
    private String visitTime;        //访问日期
    private Integer visitAllNumber;  //访问总量
    private Integer visitPeak;       //访问峰值
    private String visitPeakTime;    //峰值出现时间
    private String visitDayRank;     //日图书访问排行

    public VisitInfo() {
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public Integer getVisitAllNumber() {
        return visitAllNumber;
    }

    public void setVisitAllNumber(Integer visitAllNumber) {
        this.visitAllNumber = visitAllNumber;
    }

    public Integer getVisitPeak() {
        return visitPeak;
    }

    public void setVisitPeak(Integer visitPeak) {
        this.visitPeak = visitPeak;
    }

    public String getVisitPeakTime() {
        return visitPeakTime;
    }

    public void setVisitPeakTime(String visitPeakTime) {
        this.visitPeakTime = visitPeakTime;
    }

    public String getVisitDayRank() {
        return visitDayRank;
    }

    public void setVisitDayRank(String visitDayRank) {
        this.visitDayRank = visitDayRank;
    }

    @Override
    public String toString() {
        return "VisitInfo{" +
                "visitId=" + visitId +
                ", visitTime='" + visitTime + '\'' +
                ", visitAllNumber=" + visitAllNumber +
                ", visitPeak=" + visitPeak +
                ", visitPeakTime='" + visitPeakTime + '\'' +
                ", visitDayRank='" + visitDayRank + '\'' +
                '}';
    }
}
