package bean;

public class GoodspictInfo {
    private Integer goodspictimg;
    private Integer goodsid;
    private String goodspath;

    public GoodspictInfo() {
    }

    public Integer getGoodspictimg() {
        return goodspictimg;
    }

    public void setGoodspictimg(Integer goodspictimg) {
        this.goodspictimg = goodspictimg;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodspath() {
        return goodspath;
    }

    public void setGoodspath(String goodspath) {
        this.goodspath = goodspath;
    }

    @Override
    public String toString() {
        return "GoodspictInfo{" +
                "goodspictimg=" + goodspictimg +
                ", goodsid=" + goodsid +
                ", goodspath='" + goodspath + '\'' +
                '}';
    }
}
