public class Fruits{
    public static void main(String[] args) {
        singleApple.getInstance().printApple();
    }
}

class singleApple extends Fruits{
    private singleApple(){}
    private static singleApple instance;

    public static singleApple getInstance(){
        if (instance == null){
            instance = new singleApple();
        }
        return instance;
    }

    public static void printApple(){
        System.out.println("Hello");
    }
}