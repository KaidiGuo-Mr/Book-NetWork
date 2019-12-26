package bean;

public class CollectInfo {
    private Integer collectId;
    private Integer goodsId;

    public CollectInfo() {}

    public CollectInfo(Integer collectId, Integer goodsId) {
        this.collectId = collectId;
        this.goodsId = goodsId;
    }

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        return "CollectInfo{" +
                "collectId=" + collectId +
                ", goodsId=" + goodsId +
                '}';
    }
}
