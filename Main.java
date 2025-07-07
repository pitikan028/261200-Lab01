public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.penColor("white");
        turtle.home();

        drawFirework(turtle);

        // Move right (Sun)
        turtle.right(90);
        turtle.forward(150);
        turtle.left(90);
        drawSun(turtle);

        // Move back to original position
        turtle.right(90);
        turtle.backward(150);
        turtle.left(90);

        // Move up (Cloud)
        turtle.left(90);
        turtle.forward(100);
        turtle.right(90);
        drawCloud(turtle);

        // Move back to original position
        turtle.right(90);
        turtle.backward(100);
        turtle.left(90);

        // Move down (Thai flag)
        turtle.left(90);
        turtle.backward(150);
        turtle.right(90);
        drawThaiFlag(turtle);

        // Move back to center (optional)
        turtle.right(90);
        turtle.forward(150);
        turtle.left(90);
    }
    //function draw firework
    public static void drawFirework(Turtle turtle) {
        turtle.penColor("green");
        for (int i = 0; i < 20; i++) {
            turtle.forward(100);
            turtle.backward(100);
            turtle.left(18);
        }
        turtle.penColor("yellow");
        for (int i = 0; i < 30; i++) {
            turtle.forward(50);
            turtle.backward(50);
            turtle.left(18);
        }
        turtle.penColor("pink");
        for (int i = 0; i < 40; i++) {
            turtle.forward(25);
            turtle.backward(25);
            turtle.left(18);
        }
    }
    //function draw sun
    public static void drawSun(Turtle turtle) {
        turtle.penColor("red");
        for (int i = 0; i < 36; i++) {
            turtle.forward(40);
            turtle.backward(40);
            turtle.left(10);
        }

        turtle.penColor("orange");
        for (int i = 0; i < 36; i++) {
            turtle.forward(5);
            turtle.left(10);
        }
    }
    //function draw cloud
    public static void drawCloud(Turtle turtle) {
        turtle.penColor("black");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 36; i++) {
                turtle.forward(3);
                turtle.left(10);
            }
            turtle.forward(10);
        }
    }
    //function draw Thaiflag
    public static void drawThaiFlag(Turtle turtle) {
        int width = 80;
        int height = 10;
        String[] colors = {"red", "white", "blue", "white", "red"};

        for (int i = 0; i < 5; i++) {
            turtle.penColor(colors[i]);
            for (int j = 0; j < 2; j++) {
                turtle.forward(width);
                turtle.right(90);
                turtle.forward(height);
                turtle.right(90);
            }

            turtle.left(90);
            turtle.forward(height);
            turtle.right(90);
        }
    }
}
