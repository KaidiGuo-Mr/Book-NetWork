package bean;

public class GwcInfo {//购物车表
    private Integer userId;//用户id
    private Integer bookId;//书id
    private Integer bookNumber;//书的数量

    public GwcInfo(){
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Integer getBookNumber() {
        return bookNumber;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }

    @Override
    public String toString() {
        return "GwcInfo{" +
                "userId=" + userId +
                ", bookId=" + bookId +
                ", bookNumber=" + bookNumber +
                '}';
    }
}
