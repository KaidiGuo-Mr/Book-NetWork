package bean;

public class MemberInfo {
    private Integer memberLevel;
        private Double discountRate;

    public MemberInfo() {}

    public MemberInfo(Integer memberLevel, Double discountRate) {
        this.memberLevel = memberLevel;
        this.discountRate = discountRate;
    }

    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "MemberInfo{" +
                "memberLevel=" + memberLevel +
                ", discountRate=" + discountRate +
                '}';
    }
}
