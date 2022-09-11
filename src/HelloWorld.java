import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//String
//input - Scanner , BufferReader
class PrintHelloIndia{
    String b="";
    public void  PrintHelloIndia(String b){
        this.b=b;
        System.out.println( "Hello" +b);
    }

//    public String getB() {
//        return b;
//    }
//
//    public void setB(String b) {
//        this.b = b;
//    }

    public static void PrintIndia(String b){

    }

}
class HelloWorld {
    public static void printHello(String a) {
        System.out.println("hello " + a);
    }

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("world");
        printHello("box");
        PrintHelloIndia printHelloIndia = new PrintHelloIndia();
        String b="india";
        printHelloIndia.PrintIndia(b);
        //input
        Scanner sc = new Scanner(System.in);
//        String b = sc.nextLine();
//        printHelloIndia.PrintIndia(b);


    }
}

//class based -static method
//function based -  instance method