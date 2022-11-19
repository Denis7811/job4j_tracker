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
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new EditItem(out),
                new ExitProgram()
        };
        new StartUI(out).init(in, tracker, actions);
    }
}