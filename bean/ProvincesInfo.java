package bean;

import java.util.Set;

public class    ProvincesInfo {
    private Integer id;
    private String provinceId;
    private String province;
    //描述一对多
    private Set<CityInfo> citySet;
    public ProvincesInfo() {
    }

    public Set<CityInfo> getCitySet() {
        return citySet;
    }

    public void setCitySet(Set<CityInfo> citySet) {
        this.citySet = citySet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "ProvincesInfo{" +
                "id=" + id +
                ", provinceId='" + provinceId + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
