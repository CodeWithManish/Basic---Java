package prog.string.hacker.regularex;

public class MyRegex {
	String number="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern=number +"."+number +"."+number+"."+number;
}
