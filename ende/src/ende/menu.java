package ende;
import java.util.Scanner;
public class menu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int usu;
        System.out.println(
        		"1-sumar"
                + "2-restar"
                + "3-multiplicacion"
                + "4-dividir");
       
        usu=Integer.parseInt(sc.nextLine());
       
        switch(usu){
        case 1:
                System.out.print("1+1=2");
            break;
        case 2:
        	 System.out.print("2-1=1");
            break;
        case 3: System.out.print("2*1=2");
            break;
        case 4:
        	 System.out.print("2/1=2");
       
}
        
 }
    
}