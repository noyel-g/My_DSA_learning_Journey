/* Problem: Data Type Size

You are given a string str that represents the name of a primitive data type. Your task is to determine and return the size of that data type in bytes.

The possible values of str and their corresponding sizes are: */

import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        int num = dataType(s);
        System.out.println(num);
        sc.close();
     }
    
        static int dataType(String str){
        if(str.equals("character"))
            return 2;
        else if(str.equals("integer"))
            return 4;
        else if(str.equals("long"))
            return 8;
        else if(str.equals("float"))
            return 4;
        else if(str.equals("double"))
            return 8;
        return -1;
        }
      
}
    

