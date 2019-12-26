package bean;

public class LunboInfo {
    private Integer lunboid;
    private Integer goodsid;

    public LunboInfo() {
    }

    public Integer getLunboid() {
        return lunboid;
    }

    public void setLunboid(Integer lunboid) {
        this.lunboid = lunboid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    @Override
    public String
    toString() {
        return "LunboInfo{" +
                "lunboid=" + lunboid +
                ", goodsid=" + goodsid +
                '}';
    }
}
