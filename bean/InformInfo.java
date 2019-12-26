package bean;

public class InformInfo {
    private Integer informId;
    private String informTitle;
    private String informContent;

    public InformInfo() {}

    public InformInfo(Integer informId, String informTitle, String informContent) {
        this.informId = informId;
        this.informTitle = informTitle;
        this.informContent = informContent;
    }

    public Integer getInformId() {
        return informId;
    }

    public void setInformId(Integer informId) {
        this.informId = informId;
    }

    public String getInformTitle() {
        return informTitle;
    }

    public void setInformTitle(String informTitle) {
        this.informTitle = informTitle;
    }

    public String getInformContent() {
        return informContent;
    }

    public void setInformContent(String informContent) {
        this.informContent = informContent;
    }

    @Override
    public String toString() {
        return "InformInfo{" +
                "informId=" + informId +
                ", informTitle='" + informTitle + '\'' +
                ", informContent='" + informContent + '\'' +
                '}';
    }
}
