        package bean;

public class GoodsInfo {
    private Integer goodsId;
    private String goodsName;
    private Float goodsPrice;
    private String goodsInform;
    private Integer publishId;
    private Integer authorId;
    private Integer goodsState;

    public GoodsInfo() {
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsInform() {
        return goodsInform;
    }

    public void setGoodsInform(String goodsInform) {
        this.goodsInform = goodsInform;
    }

    public Integer getPublishId() {
        return publishId;
    }

    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsInform='" + goodsInform + '\'' +
                ", publishId=" + publishId +
                ", authorId=" + authorId +
                ", goodsState=" + goodsState +
                '}';
    }
}
