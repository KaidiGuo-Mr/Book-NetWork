package bean;

public class AuthorInfo {
    private Integer authorInfo;
    private String authorName;
    private Integer authorState;

    public AuthorInfo() {}

    public AuthorInfo(Integer authorInfo, String authorName, Integer authorState) {
        this.authorInfo = authorInfo;
        this.authorName = authorName;
        this.authorState = authorState;
    }

    public Integer getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(Integer authorInfo) {
        this.authorInfo = authorInfo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getAuthorState() {
        return authorState;
    }

    public void setAuthorState(Integer authorState) {
        this.authorState = authorState;
    }

    @Override
    public String toString() {
        return "AuthorInfo{" +
                "authorInfo=" + authorInfo +
                ", authorName='" + authorName + '\'' +
                ", authorState=" + authorState +
                '}';
    }
}
