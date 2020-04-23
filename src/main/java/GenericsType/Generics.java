package GenericsType;

public class Generics<T> {
    private T type;

    public void setType(T type){
        this.type = type;
    }
    public  T getType(){
        return type;
    }
// Generic method.
    public static <T> void printContent(T [] stringIntArray){
        for (int i = 0; i < stringIntArray.length ; i++) {
            System.out.print(stringIntArray[i] + " ");
            System.out.println();
        }
    }
}
