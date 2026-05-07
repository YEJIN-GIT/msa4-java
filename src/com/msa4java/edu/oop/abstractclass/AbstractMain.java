package com.msa4java.edu.oop.abstractclass;

public class AbstractMain {
    public static void main(String[] args) {
        Whale whale = new Whale("고래");
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel("날다람쥐");

        whale.residence();
        flyingSquirrel.residence();

        whale.swimming();

        // 다형성
        // 같은 자료형에 여러가지 타입의 데이터를 대입하여 다양한 결과를 얻어낼 수 있는 성질
        Whale whale2 = new Whale("고래2");
        // 업캐스팅
        Mammal castingWhaleToMammal = (Mammal)whale2;
        whale2.swimming();
//        castingWhaleToMammal.swimming();    // 자식 클래스가 가진 멤버에는 접근이 불가능
        whale2.breath();    // 고래쪽 오버라이드
        castingWhaleToMammal.breath();  // 고래쪽 오버라이드 (업캐스팅하여도 오버라이딩한 자식 메소드가 실행됨)

        // 다운캐스팅 : 업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅 하는 것
        Whale downCastingWhale = (Whale)castingWhaleToMammal;
        downCastingWhale.swimming();    // 고래2 육중하게 헤엄칩니다.

        Mammal[] arrMammal = new Mammal[4];
        arrMammal[0] = new Whale("고래1");
        arrMammal[1] = new Whale("고래2");
        arrMammal[2] = new Whale("고래3");
        arrMammal[3] = new FlyingSquirrel("날다람쥐4");

        for(int i = 0; i < arrMammal.length; i++) {
            Mammal obj = arrMammal[i];

            if(obj instanceof Whale) {
                Whale whale3 = (Whale)obj;
                whale3.swimming();
            } else if(obj instanceof FlyingSquirrel) {
                FlyingSquirrel flyingSquirrel3 = (FlyingSquirrel)obj;
                flyingSquirrel3.residence();
            }
        }
//        고래1 육중하게 헤엄칩니다.
//        고래2 육중하게 헤엄칩니다.
//        고래3 육중하게 헤엄칩니다.
//        날다람쥐4 산에 삽니다.

    }
}
