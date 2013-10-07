/*
3. A parancssori parameterek emberek neveit tartalmazzak (egy csaladnev + egy utonev).
Írd ki az emberek neveit csaladnev szerint csoportositva.
*/

import java.util.Scanner;

public class Prog03{
 static void beolvas(String [][] s_tomb){
  Scanner in = new Scanner(System.in);
  String tmp;
  int i = 0;
  short j = 0;
  tmp = in.next();
  while (tmp.compareTo("exit") != 0 && i<10){
   j = 0;
   s_tomb[i][j] = tmp;
   j = 1;
   tmp = in.next();
   s_tomb[i][j] = tmp;
   System.out.println("Hozzaadva: " + s_tomb[i][0] + " " + s_tomb[i][1]);
   i++;
   tmp = in.next();
  }
 }

 public class rendezo(String[][] s_tomb){
  //Ujrahasznositott feladat megoldas: I/3/7
  System.out.println("Parancssori parameterek (szavak): ");
  for (int i = 0; i < s_tomb.length(); i++){
   a=0;
   for (int j = 0; j < s_tomb.length(); j++){
    if (args[i].compareToIgnoreCase(args[j]) > 0)
     a++;
   }
   if (t[a] == null)
    t[a] = args[i];
   else
    t[(a+1)] = args[i];
  }
  for (int i = 0; i < args.length; i++)
   System.out.println(t[i]); 
 }


 public static void main(String[] args){
  String [][] s_tomb = new String[10][2];
  beolvas(s_tomb);
  System.out.println("Kiirva: " + s_tomb[1][0] + " " + s_tomb[1][1]);
 }
}

/* Kell: dinamikus tombok, had ne kelljen elore megmondani mennyit akarok.
 * HAJAJ... lathatosagi problemak, a fuggveny mar elve a tomb referenciajat kapja meg:
 * ezzel nagyon ovatosan kell banni (elsosorban az OOP eszkozoknel)
 * peldaprogram

import java.util.Scanner;

public class Prog03{
 static void beolvas(String [][] s_tomb){
  Scanner in = new Scanner(System.in);
  String tmp;
  int i = 0;
  short j = 0;
  tmp = in.next();
  while (tmp.compareTo("exit") != 0 && i<10){
   j = 0;
   s_tomb[i][j] = tmp;
   j = 1;
   tmp = in.next();
   s_tomb[i][j] = tmp;
   System.out.println("Hozzaadva: " + s_tomb[i][0] + " " + s_tomb[i][1]);
   i++;
   tmp = in.next();
  }
 }
 
 public static void main(String[] args){
  String [][] s_tomb = new String[10][2];
  beolvas(s_tomb);
  System.out.println("Kiirva: " + s_tomb[1][0] + " " + s_tomb[1][1]);
 }
}
*/
