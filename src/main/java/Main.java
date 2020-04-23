import GenericsType.Generics;

public class Main {
    public static void main(String[] args) {
        // creating arrays of type string int.
        String [] words = {"I", "AM","EloHim","Off", "Java"};
        Integer [] numbers = {12,324,6,7900};

        // invoking the Generics class and it's methods.
        Generics.printContent(words);
        System.out.print("\n");
        Generics.printContent(numbers);

        // We instantiating two objects safeguarding enforcing only type String and Integer.
        Generics<String> name = new Generics<>();
        Generics<Integer> age = new Generics<>();

        // setting the values required.
        name.setType("Thabiso");
        age.setType(26);

        // and displaying the results of both values int name and age.
        System.out.println("Name is: " + name.getType());
        System.out.print("\n");
        System.out.println("Age: " + age.getType());
        // end of program.
    }
}
