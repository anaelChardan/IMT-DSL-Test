package frame;

public class Main {
    public static void main(String[] args) {
        FrameBuilder frameBuilder = new FrameBuilder();

        frameBuilder
                .id("A")
                .title("Frame A")
                .width(200)
                .height(100)
                .label("Hello")
                .button("world!");

        Frame frame = frameBuilder.getContent();

        System.out.println(frame);

        frame.execute();
    }
}
