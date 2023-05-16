package week4.d4;

public class Address {
    private String fullAddr;
    private String sido; //
    private String sigungu;

    public Address(String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr; //병원 홈페이지 도메인 주소
        this.sido = sido; //
        this.sigungu = sigungu;
    }

    public String getFullAddr() {
        return fullAddr;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }
}
