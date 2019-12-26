package bean;

public class AdminInfo {
    private Integer adminId;
    private String adminName;
    private Integer dutyId;

    public AdminInfo() {}

    public AdminInfo(Integer adminId, String adminName, Integer dutyId) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.dutyId = dutyId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Integer getDutyId() {
        return dutyId;
    }

    public void setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", dutyId=" + dutyId +
                '}';
    }
}
