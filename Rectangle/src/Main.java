/*
* 2022136140 이상벽
*
*
* Q1. x와 y 좌표를 각각 별도 변수에 유지하지 않고 x와 y 값을 유지하는 Point 클래스를 정의하고, 이 클래스의
* 객체를 멤버 변수로 유지한다고 가정하자. 이 경우 moveTo, moveBy의 구현이 어떻게 바뀌는지 제시하시오.
*
* A1. Point 클래스를 이용해서 x, y 좌표를 구성한 경우.
* 포인트 클래스 타입의 position 객체를 멤버변수로 추가합니다.
* 그리고 moveTo 함수와 moveBy 함수를 각각 다음과 같이 수정합니다.
* void moveTo(int x, int y) {
*         position.setX(x);
*         position.setY(y);
* }
*
* void moveBy(int deltaX, int deltaY) {
*       if (position.getX() + deltaX >= 0) position.setX(position.getX() + deltaX);
*       if (position.getY() + deltaY >= 0) position.setY(position.getY() + deltaY);
* }
*
* 위와 같이 정의하고 기존에 x와 y에 접근하던 방식 대신 position.getX(), position.getY()를 통해 각 좌표 값에 접근하는 방법을 사용하였습니다.
* 마찬가지로 수정 또한 Setter를 이용하여 수행하도록 하였습니다. 그리고 Point 클래스의 Setter에서 유효성 검사를 별도로 진행하기 때문에,
* 중복을 최소화 하기 위해서 moveTo 함수에서는 유효성 검사를 진행하지 않았습니다.
*
* Q2. 이 과제에 제시된 상태와 행위 외에 추가할 수 있는 것을 찾아 추가해 보세요. 보통 상태가 추가되면 그 상태를 조작하는 메소드의 추가가 필요하다.
*
* A2. 해당 문제를 해결하기 위해 Rectangle의 색상을 보여줄 수 있는 color 멤버 변수를 추가하고, Getter와 Setter를 추가하여 수정과 접근에 용이하게 코드를 작성하였습니다.
 */
public class Main {
    public static void main(String[] args) {
        testRectangle();
    }

    static void testRectangle() {
        Rectangle rect = new Rectangle(10, 10, 100, 200);
        System.out.println(rect.isSquare());
        System.out.println(rect.isInside(30,10));
        rect.moveBy(-10,10);
        System.out.println(rect.isInside(30,30));
        rect.changeHeight(100);
        System.out.println(rect.isSquare());
        rect.setColor("black");
        System.out.println(rect.getColor());
    }
}