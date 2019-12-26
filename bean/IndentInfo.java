package bean;

public class IndentInfo {//订单表
    private Integer orderId;//订单id
    private Integer locationId;//地址id
    private Integer bookId;//书id
    private Integer bookNumber;//书的数量
    private Long orderMoneySum;//订单的总价钱
    private String orderPayWay;//支付方式
    private Integer userId;//用户id

    public IndentInfo(){
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Integer getBookNumber() {
        return bookNumber;
    }

    public Long getOrderMoneySum() {
        return orderMoneySum;
    }

    public String getOrderPayWay() {
        return orderPayWay;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void setOrderMoneySum(Long orderMoneySum) {
        this.orderMoneySum = orderMoneySum;
    }

    public void setOrderPayWay(String orderPayWay) {
        this.orderPayWay = orderPayWay;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "IndentInfo{" +
                "orderId=" + orderId +
                ", locationId=" + locationId +
                ", bookId=" + bookId +
                ", bookNumber=" + bookNumber +
                ", orderMoneySum=" + orderMoneySum +
                ", orderPayWay='" + orderPayWay + '\'' +
                ", userId=" + userId +
                '}';
    }
}
