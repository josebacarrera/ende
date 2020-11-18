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
                suma();
            break;
        case 2:
                resta();
            break;
        case 3:
                multiplicacion();
            break;
        case 4:
                division();
            break;
        case 5:
            factorial();
            break;
       
        }
    }
    public static void suma () {System.out.println("1+1=2");}
   
    public static void resta () {System.out.println("1-1=0");}
   
    public static void multiplicacion () {System.out.println("2*1=2");}
   
    public static void division () {System.out.println("2/1=2");}
   
    public static void factorial () {System.out.println("Introduce un numero y lo pasará a factorial");
    Scanner sc=new Scanner(System.in);
    int i,num;
    num=0;
    int fac=1;
    num=sc.nextInt();
    for (i=0;i<num;i++) {
    fac=fac*i;
    }
    }
}
