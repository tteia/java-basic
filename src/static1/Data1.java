package static1;

public class Data1 {
    public String name;
    public int cnt;

    public Data1(String name){
        this.name = name;
        cnt++; // Data1 의 객체가 생성될 때마다 cnt++ 을 해줘서 객체의 수를 셀 수 있을까?
        // 정답은 X ! Data1 인스턴스는 새로 만들어짐 > 인스턴스에 포함된 cnt 도 새로 만들어짐 > cnt = 1
    }
}
