package StringsManipulation.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
            StringBuilder sbf = new StringBuilder("Hello");
            sbf.append("World");
            System.out.println(sbf);
            sbf.reverse();
            System.out.println(sbf);sbf.insert(4,"A");
            System.out.println(sbf);
            sbf.replace(5,6,"A");
            System.out.println(sbf);
    }

}
