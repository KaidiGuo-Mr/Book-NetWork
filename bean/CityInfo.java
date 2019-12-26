package bean;

public class CityInfo {
    private Integer id;
    private String cityId;
    private String city;
    private String provinceId;  //外键，绑定provinceId
    //描述多对一情况
    private ProvincesInfo pi;

    public CityInfo() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public ProvincesInfo getPi() {
        return pi;
    }

    public void setPi(ProvincesInfo pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "CityInfo{" +
                "id=" + id +
                ", cityId='" + cityId + '\'' +
                ", city='" + city + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", pi=" + pi +
                '}';
    }
}
