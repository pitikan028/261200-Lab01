public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.penColor("white");  // สีพื้นหลัง
        turtle.home();

        drawFirework(turtle);         // พลุ
        drawOuterCircle(turtle);      // วงกลมรอบพลุ
        drawSparkle(turtle);          // ประกายเล็กๆ
        drawSun(turtle);              // พระอาทิตย์
        drawCloud(turtle, -200, 150); // ก้อนเมฆ
        drawThaiFlag(turtle, -250, -100); // ธงชาติไทย
    }

    public static void drawFirework(Turtle turtle) {
        turtle.penColor("Green");
        for (int i = 0; i < 20; i++) {
            turtle.forward(100);
            turtle.backward(100);
            turtle.left(18);
        }
    }

    public static void drawOuterCircle(Turtle turtle) {
        turtle.penColor("red");
        turtle.forward(150);
        turtle.left(90);
        turtle.forward(30);
        turtle.right(90);

        turtle.penColor("blue");
        for (int i = 0; i < 36; i++) {
            turtle.forward(5);
            turtle.left(10);
        }
    }

    public static void drawSparkle(Turtle turtle) {
        turtle.penColor("red");
        turtle.home();
        turtle.penColor("yellow");
        for (int i = 0; i < 12; i++) {
            turtle.forward(70);
            turtle.backward(70);
            turtle.left(30);
        }
    }

    public static void drawSun(Turtle turtle) {
        turtle.penUp(true);
        turtle.goTo(200, 150);
        turtle.setHeading(0);
        turtle.penUp(false);
        turtle.penColor("orange");

        for (int i = 0; i < 36; i++) {
            turtle.forward(40);
            turtle.backward(40);
            turtle.left(10);
        }

        turtle.penColor("yellow");
        for (int i = 0; i < 36; i++) {
            turtle.forward(5);
            turtle.left(10);
        }
    }

    public static void drawCloud(Turtle turtle, int x, int y) {
        turtle.penUp(true);
        turtle.goTo(x, y);
        turtle.penUp(false);
        turtle.penColor("lightgray");

        for (int i = 0; i < 3; i++) {
            drawCircle(turtle, 20);
            turtle.penUp(true);
            turtle.forward(30);
            turtle.penUp(false);
        }
    }

    public static void drawCircle(Turtle turtle, int radius) {
        for (int i = 0; i < 36; i++) {
            turtle.forward((2 * Math.PI * radius) / 36);
            turtle.left(10);
        }
    }

    public static void drawThaiFlag(Turtle turtle, int x, int y) {
        turtle.penUp(true);
        turtle.goTo(x, y);
        turtle.setHeading(0);
        turtle.penUp(false);

        int width = 90;
        int height = 20;

        String[] colors = { "red", "white", "blue", "white", "red" };

        for (int i = 0; i < 5; i++) {
            turtle.penColor(colors[i]);
            for (int j = 0; j < 2; j++) {
                turtle.forward(width);
                turtle.right(90);
                turtle.forward(height);
                turtle.right(90);
            }
            turtle.penUp(true);
            turtle.left(90);
            turtle.forward(height);
            turtle.right(90);
            turtle.penUp(false);
        }
    }
}
