import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        int number = 100;
//        String name = "Abdullahi";
//        Date date = new Date();

//        System.out.println(name);

        String name = new String("abdullahi");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        String code = new String("bdu");
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));

//        primitiveDataType();
    }

    public static void primitiveDataType() {
        byte theByte = 23;
        short theShort = 23456;
        int theInt = 1345667890;
        long theLong = 234567890987L;

        float pi = 3.14F;
        double doublePi = 3.1415;

        boolean isAdult = true;
        char nameInitial = 'A';

        System.out.println(theByte);
        System.out.println(theInt);
        System.out.println(theShort);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(isAdult);
        System.out.println(nameInitial);
    }
}