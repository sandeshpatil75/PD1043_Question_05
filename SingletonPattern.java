class Singleton {
   
    private static Singleton instance;

    
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

   
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

  
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
       
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

      
        Singleton obj2 = Singleton.getInstance();

       
        System.out.println("Are both instances same? " + (obj1 == obj2));
    }
}
