/**
 * 2022136140 이상벽
 *
 * 추가질문 1.
 * 불변 클래스의 멤버 변수가 객체이며, 불변 객체가 아닌 경우, 다음과 같은 문제점이 발생할 수 있습니다.
 * 1. 상태 변경 가능성
 * 2. 부작용(side-effect)
 * 먼저 상태 변경 가능성이 존재하면 외부에서 불변 클래스의 객체의 상태를 변경할 수 있게되어 문제를 발생시킬 수 있습니다.
 * 그리고 부작용이 발생할 경우 의도되지 동작을 할 수 있고, 코드의 디버깅을 어렵게 만들며 코드의 신뢰성을 떨어뜨립니다.
 *
 * 극복 방법으로는 다음의 방법들이 있습니다.
 * 1. 가변 객체의 복사본 사용
 * 2. 불변 객체 사용
 *
 * 객체의 복사본을 만들어 사용하게 될 경우 원본의 객체가 수정되더라도 불변 클래스의 상태는 영향을 받지않아 해당 문제를
 * 극복할 수 있습니다.
 * 그리고 멤버 변수로 가변 객체 대신 불변 객체를 사용하게 되면 외부에서 멤버 변수의 상태를 변경할 수 없으므로 관련된 문제를
 * 극복할 수 있습니다.
 *
 * 추가 질문 2.
 * 객체 풀을 사용하기에 적합한 상황과 조건으로는 아래와 같은 상황이 있습니다.
 * 1. 객체의 생성 비용이 높은 경우
 * 2. 객체의 생성과 소멸이 빈번한 경우
 * 3. 상태가 동일한 객체가 여러번 생성될 경우
 *
 * 객체의 생성 비용이 높은 경우 미리 객체를 생성해두고 풀에 저장하여 사용하는 것이 효울적입니다.
 * 대표적인 예로는 데이터베이스 연결, 네트워크 소켓 등이 있습니다.
 *
 * 그리고 생성과 소멸이 빈번한 경우 객체 풀을 이용하는 것이 효율적입니다.
 * 객체를 재사용하므로써 가비지 컬렉션으로 인한 성능 저하를 줄일 수 있습니다.
 *
 * 마지막으로 상태가 동일한 객체가 여러번 생성될 경우입니다.
 * 이 경우 풀에 미리 생성된 객체를 저장하여 재사용하므로써 메모리 사용을 최적화 할 수 있습니다.
 * */

public class Main {
    public static void main(String[] args) {
        testTime();
    }

    public static void testTime() {
        Time lunchTime = new Time(12, 30);
        System.out.println(lunchTime);
        System.out.println(lunchTime.isPM());
        Time quitTime = lunchTime.next(7);
        System.out.println(quitTime);
        lunchTime = lunchTime.next(24, 30);
        System.out.println(lunchTime);
        System.out.println(lunchTime.isPM());
        Time dinnerTime = new Time(18, 30, 0);
        System.out.println(dinnerTime);
    }
}