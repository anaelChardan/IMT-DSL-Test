package frame;

import java.util.ArrayList;
import java.util.List;

public class FrameBuilder {
    private String id;
    private String title;
    private Integer width;
    private Integer height;
    private List<Content>  contents = new ArrayList<Content>();

    public Frame getContent() {
        return new Frame(id, title, width, height, contents);
    }

    public FrameBuilder button(String name) {
        this.contents.add(new Button(name));
        return this;
    }

    public FrameBuilder label(String name) {
        this.contents.add(new Label(name));
        return this;
    }

    public FrameBuilder id(String a) {
        this.id = a;
        return this;
    }

    public FrameBuilder title(String a) {
        this.title = a;
        return this;
    }

    public FrameBuilder width(Integer a) {
        this.width = a;
        return this;
    }

    public FrameBuilder height(Integer a) {
        this.height = a;
        return this;
    }
}
