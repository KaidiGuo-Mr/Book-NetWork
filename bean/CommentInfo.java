package bean;

public class CommentInfo {
        private Integer goodsId;
        private Integer userId;
        private String commentContent;

    public CommentInfo() {}

    public CommentInfo(Integer goodsId, Integer userId, String commentContent) {
        this.goodsId = goodsId;
        this.userId = userId;
        this.commentContent = commentContent;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    @Override
    public String toString() {
        return "CommentInfo{" +
                "goodsId=" + goodsId +
                ", userId=" + userId +
                ", commentContent='" + commentContent + '\'' +
                '}';
    }
}
