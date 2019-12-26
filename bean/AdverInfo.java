package bean;

public class AdverInfo {
    private Integer adverid;
    private String adverimg;

    public AdverInfo() {
    }

    public int getAdverid() {
        return adverid;
    }

    public void setAdverid(int adverid) {
        this.adverid = adverid;
    }

    public String getAdverimg() {
        return adverimg;
    }

    public void setAdverimg(String adverimg) {
        this.adverimg = adverimg;
    }

    @Override
    public String toString() {
        return "AdverInfo{" +
                "adverid=" + adverid +
                ", adverimg='" + adverimg + '\'' +
                '}';
    }
}
