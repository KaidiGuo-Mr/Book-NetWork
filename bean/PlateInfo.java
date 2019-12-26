package bean;

public class PlateInfo {
private String plateName;
private Integer plateNum;
private Integer plateInnum;
private Integer plateParentNum;

    public PlateInfo() {
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
    }

    public Integer getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(Integer plateNum) {
        this.plateNum = plateNum;
    }

    public Integer getPlateInnum() {
        return plateInnum;
    }

    public void setPlateInnum(Integer plateInnum) {
        this.plateInnum = plateInnum;
    }

    public Integer getPlateParentNum() {
        return plateParentNum;
    }

    public void setPlateParentNum(Integer plateParentNum) {
        this.plateParentNum = plateParentNum;
    }

    @Override
    public String toString() {
        return "PlateInfo{" +
                "plateName='" + plateName + '\'' +
                ", plateNum=" + plateNum +
                ", plateInnum=" + plateInnum +
                ", plateParentNum=" + plateParentNum +
                '}';
    }
}
