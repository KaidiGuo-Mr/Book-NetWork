package bean;

public class PublishInfo {
    private Integer publishId;
    private String publishName;
    private Integer publishState;

    public PublishInfo() {}

    public PublishInfo(Integer publishId, String publishName, Integer publishState) {
        this.publishId = publishId;
        this.publishName = publishName;
        this.publishState = publishState;
    }

    public Integer getPublishId() {
        return publishId;
    }

    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public Integer getPublishState() {
        return publishState;
    }

    public void setPublishState(Integer publishState) {
        this.publishState = publishState;
    }

    @Override
    public String toString() {
        return "PublishInfo{" +
                "publishId=" + publishId +
                ", publishName='" + publishName + '\'' +
                ", publishState=" + publishState +
                '}';
    }
}
