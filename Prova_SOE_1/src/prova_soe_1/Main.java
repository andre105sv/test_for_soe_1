
package prova_soe_1;

/**
 *
 * @author splas
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Good morning");
        hello("world");
        hello("universe");
    }
    
    private static void hello(String msg){
        System.out.println("Hello, " + msg);
    }
    
}
