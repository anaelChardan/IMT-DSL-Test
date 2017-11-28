package frame;

import javax.swing.*;

public class Button implements Content {
    private String value;

    public Button(String value) {

        this.value = value;
    }

    @Override
    public String toString() {
        return "button: \"" + value + "\"";
    }

    @Override
    public void execute(JFrame a) {
        JButton button1 = new JButton();
        a.add(button1);
        button1.setText(value);
    }
}
