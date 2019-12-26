package bean;

//库存
public class RepertoryInfo {
    private Integer goodsId;             //商品id
    private Integer repertoryNumber;     //库存量
    private Integer repertoryThreshoId;  //补货阈值

    public RepertoryInfo() {
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getRepertoryNumber() {
        return repertoryNumber;
    }

    public void setRepertoryNumber(Integer repertoryNumber) {
        this.repertoryNumber = repertoryNumber;
    }

    public Integer getRepertoryThreshoId() {
        return repertoryThreshoId;
    }

    public void setRepertoryThreshoId(Integer repertoryThreshoId) {
        this.repertoryThreshoId = repertoryThreshoId;
    }

    @Override
    public String toString() {
        return "RepertoryInfo{" +
                "goodsId=" + goodsId +
                ", repertoryNumber=" + repertoryNumber +
                ", repertoryThreshoId=" + repertoryThreshoId +
                '}';
    }
}
