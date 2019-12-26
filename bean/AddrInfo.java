package bean;

public class AddrInfo {
    private Integer locationId;//地址id
    private String receiveManName;//收货人姓名
    private Integer receiveManPhone;//收货人电话
    private Integer userId;//用户id
    private String provinces;//省份
    private String city;//市
    private String specificLocation;//具体位置
    private Integer zipCode;//邮政编码

    public AddrInfo(){
    }

    public Integer getLocationId() {
        return locationId;
    }

    public String getReceiveManName() {
        return receiveManName;
    }

    public Integer getReceiveManPhone() {
        return receiveManPhone;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getProvinces() {
        return provinces;
    }

    public String getCity() {
        return city;
    }

    public String getSpecificLocation() {
        return specificLocation;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public void setReceiveManName(String receiveManName) {
        this.receiveManName = receiveManName;
    }

    public void setReceiveManPhone(Integer receiveManPhone) {
        this.receiveManPhone = receiveManPhone;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSpecificLocation(String specificLocation) {
        this.specificLocation = specificLocation;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "AddrInfo{" +
                "locationId=" + locationId +
                ", receiveManName='" + receiveManName + '\'' +
                ", receiveManPhone=" + receiveManPhone +
                ", userId=" + userId +
                ", provinces='" + provinces + '\'' +
                ", city='" + city + '\'' +
                ", specificLocation='" + specificLocation + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
