import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        long z=1,y=1;
        for(int i=0;i<testcase;i++){
            long nextval=sc.nextLong();
            while(z<nextval){
                z=z+(++y);
            }
            z=z-y;
            System.out.println(nextval-z);
            z=1;y=1;
        }
	}
}