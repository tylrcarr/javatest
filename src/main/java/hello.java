import skilstak.c;
import java.util.*;
public class hello {
    public static void america(String message) throws InterruptedException {
        
        while(true) { 
            System.out.println(c.clear + c.x + c.r + message);
            Thread.sleep(50); 
            System.out.println(c.clear + c.x + c.b3 + message);
            Thread.sleep(50); 
            System.out.println(c.clear + c.x + c.b + message);
            Thread.sleep(50); 
        }
        
    }
    public static void choice(String message) {
        while(true){    
            System.out.println(c.b + "1 " + c.x + c.y + "2" + c.x);
            Scanner scanner2 = new Scanner(System.in);
            String color = scanner2.nextLine();

            if(color.equals("")){
                System.out.println("Put in a number.");
            } else if(color.equals("1")){
                while(true){
                    System.out.println(c.b + message + c.x);
                }
            } else if(color.equals("2")){
                
            
        }
    }
    public static void plain(String message) {
        while(true){
            System.out.println(c.clear + message);
        }
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Option? None for plain, choice of colors for c,");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        System.out.println(c.clear + "Message?");
        Scanner scanner3 = new Scanner(System.in);
        String message = scanner3.nextLine();
        if(!id.equals("")) {
            if(id.equals("c")){
                choice(message);
            }
        } else {
            plain(message);
        }
    
    
    
    
    
    }

    


}
