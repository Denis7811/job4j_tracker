package ru.job4j.inheritance.new22;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}

class ReportUsage {
    public static void main(String[] args) {
        TextReport report1 = new TextReport();
        HtmlReport report2 = new HtmlReport();
        String text1 = report1.generate("Report's name", "Report's body");
        System.out.println(text1);
        String text2 = report2.generate("Report's name", "Report's body");
        System.out.println(text2);
        JSONReport report3 = new JSONReport();
        String text3 = report3.generate("Report's name", "Report's body");
        System.out.println(text3);
    }
}

class HtmlReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}

class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        return "{" + ln
                + "\t\"name\" : " + name + "," + ln
                + "\t\"body\" : " + body + "," + ln
                + "}";
    }
}
