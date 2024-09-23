public class Rectangle {
    // x,y 좌표를 멤버변수로 구현한 경우.
    // private int x;
    // private int y;

    // 좌표를 클래스로 구현한 경우.
    private Point position;
    private int width;
    private int height;
    private String color;

    // 생성자
    public Rectangle(int x, int y, int width, int height) {
        // moveTo(x, y);
        this.position = new Point(x, y);
        this.width = width;
        changeHeight(height);
    }

    int getHeight() {
        return height;
    }
    int getWidth() {
        return width;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
    int area() {
        return width * height;
    }
    boolean isSquare() {
        return width == height;
    }
//    좌표를 멤버변수로 구현한 경우.
//    void moveTo(int x, int y) {
//        if (x >= 0) this.x=x;
//        if (y >= 0) this.y=y;
//    }

//    좌표를 클래스로 구현한 경우.
    void moveTo(int x, int y) {
        position.setX(x);
        position.setY(y);
    }
    //    좌표를 멤버변수로 구현한 경우.
//    void moveBy(int deltaX, int deltaY) {
//        if (x + deltaX >= 0) x += deltaX;
//        if (y + deltaY >= 0) y += deltaY;
//    }

//    좌표를 클래스로 구현한 경우.
    void moveBy(int deltaX, int deltaY) {
        if (position.getX() + deltaX >= 0) position.setX(position.getX() + deltaX);
        if (position.getY() + deltaY >= 0) position.setY(position.getY() + deltaY);
    }

    //    좌표를 멤버변수로 구현한 경우.
//    boolean isInside(int x, int y) {
//        return x > this.x && x <= this.x+this.width && y > this.y && y <= this.y + this.height;
//    }

    // 좌표를 클래스로 구현한 경우
    boolean isInside(int x, int y) {
        return x > position.getX() && x <= position.getX()+this.width && y > position.getY() && y <= position.getY()+this.height;
    }

    void changeHeight(int height) {
        if (height > 0) this.height = height;
    }
}
