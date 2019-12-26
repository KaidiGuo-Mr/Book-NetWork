package bean;

public class LookInfo {
    private Integer lookid;
    private Integer goodsid;
    private Integer userid;

    public LookInfo() {
    }

    public Integer getLookid() {
        return lookid;
    }

    public void setLookid(Integer lookid) {
        this.lookid = lookid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "LookInfo{" +
                "lookid=" + lookid +
                ", goodsid=" + goodsid +
                ", userid=" + userid +
                '}';
    }
}
