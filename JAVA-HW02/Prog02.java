/*
2. Ird ki a parancssori parametereket egy sorban ugy,
hogy a parameterekben az egymas utani 'a' betuket egyetlen 'a' beture csereled.
a) regularis kifejezes hasznalataval
b) regkif nelkul
*/

import java.util.Scanner;

public class Prog02{
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  String s = in.next();
  if (args[0].compareTo("a") == 0){
  //a) feladat???
   s = s.replaceAll("a+", "b");
   System.out.println(s);
  }else{
  //b) feladat???
   int j=0;
   String s_new = "";
   for (int i = 0; i < s.length(); i++){
    while(s.charAt(i) == 'a'){
     if(j == 0)
      s_new = s_new + s.charAt(i);
     j++;
     i++;
    }
    j=0;
    s_new = s_new + s.charAt(i);
   }
   System.out.println(s_new);
  }
 }
}
//villamgyorsan utana kell neznem mi az a regularis kifejezes mert ez alapfogalom...
//mi az a keplet, ami megadja a karaktertomb adott elemenek cimet?
//elorelepes a dokumentacio bongeszesben:(utvonal pelda: string) 	http://docs.oracle.com/javase/
//									http://docs.oracle.com/javase/7/docs/index.html
//									http://docs.oracle.com/javase/7/docs/technotes/guides/index.html#langutil
//									http://docs.oracle.com/javase/7/docs/technotes/guides/lang/index.html
//									http://docs.oracle.com/javase/7/docs/api/java/lang/package-summary.html
//									http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
