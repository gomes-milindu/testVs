public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        for(int x=0; x<5; x++){
            for(int y=x; y<5; y++){
                    System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
