public class StringStart {
    public static void main(String[] args) {
        String name = "Ruchika";
        String name1 = new String("Tejaswini");
        System.out.println(name);
        System.out.println(name1);
        System.out.println("Happy New Year @2021!!!");

        // charAt(int index)
        System.out.println(name.charAt(6));

        // int length()
        System.out.println(name.length());

        // String substring(int beginindex)
        System.out.println(name.substring(5));

        // String substring(int beginIndex, int endIndex)
        System.out.println(name.substring(3, 5));

        // boolean contains(CharSequence s)
        System.out.println(name.contains("Ruch"));

        // boolean equals(Object another)
        System.out.println(name.equals(name1));

        // boolean isEmpty()
        System.out.println(name.isEmpty());

        // String concat(String str)
        System.out.println(name.concat(name1));
        System.out.println(name.concat(" Tikariha"));

        // String replace(char old, char new)
        System.out.println(name.replace('k', 'K'));

        // String[] split(String regex)
        String cars = "Hyundai, Maruti, Swift, Wagonr, Ferrari";
        String allCars[] = cars.split(", ");
        for (String car: allCars) {
            System.out.println(car);
        }

        // int indexOf(int ch)
        System.out.println(name.indexOf('R'));

        // String toLowerCase()
        System.out.println(name.toLowerCase());

        // String toUpperCase()
        System.out.println(name.toUpperCase());

        // String trim()
        String name2 = "         Kashhh    ";
        System.out.println(name2 + "....." + name2.trim());
    }
}
