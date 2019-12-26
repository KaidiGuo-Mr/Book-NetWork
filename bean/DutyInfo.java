package bean;

public class DutyInfo {
    private Integer dutyId;
    private String dutyName;
    private Integer dutyLevel;

    public DutyInfo() {}

    public DutyInfo(Integer dutyId, String dutyName, Integer dutyLevel) {
        this.dutyId = dutyId;
        this.dutyName = dutyName;
        this.dutyLevel = dutyLevel;
    }

    public Integer getDutyId() {
        return dutyId;
    }

    public void setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public Integer getDutyLevel() {
        return dutyLevel;
    }

    public void setDutyLevel(Integer dutyLevel) {
        this.dutyLevel = dutyLevel;
    }

    @Override
    public String toString() {
        return "DutyInfo{" +
                "dutyId=" + dutyId +
                ", dutyName='" + dutyName + '\'' +
                ", dutyLevel=" + dutyLevel +
                '}';
    }
}
