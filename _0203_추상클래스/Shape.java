package _0203_추상클래스;

// 추상 클래스
abstract class Shape {
    // 공통된 필드 (protected로 설정)
    protected String color;

    // 추상 메서드
    abstract void draw();

    // 공통된 메서드 (final로 설정)
    final void setColor(String color) {
        this.color = color;
    }
}

// 하위 클래스 1
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + color);
    }
}

// 하위 클래스 2
class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle with width " + width + ", height " + height + ", and color " + color);
    }
}