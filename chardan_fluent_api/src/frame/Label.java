package frame;

import javax.swing.*;

public class Label implements Content {
    private String value;

    public Label(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "label: \"" + value + "\"";
    }

    @Override
    public void execute(JFrame a) {
        JLabel label0 = new JLabel();
        a.add(label0);
        label0.setText(value);
    }
}
