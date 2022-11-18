package ru.job4j.tracker;

public class StubOutput implements Output {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public void println(Object obj) {
        if (obj != null) {
            buffer.append(obj.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return buffer.toString();
    }

    public static void main(String[] args) {
        Output out1 = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker1 = new Tracker();
        UserAction[] actions1 = {
                new ExitProgram()
        };
        new StartUI(out1).init(in, tracker1, actions1);
        out1.toString();
    }
}