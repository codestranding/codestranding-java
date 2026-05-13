public class StringPractice {

    public static void main(String[] args) {

        String name = "CodeStranding";

        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }

        if (name.contains(" ")) {
            System.out.println("Your name has spaces");
        } else {
            System.out.println("Your name doesn't contain spaces");
        }

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("a");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.replace("o", "0");
        System.out.println(name);
    }
}