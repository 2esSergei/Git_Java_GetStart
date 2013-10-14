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

 static void rendezo(String[][] s_tomb){
  //Ujrahasznositott feladat megoldas: I/3/7
  String tmp1, tmp2; //a nem tul elegans megoldas...
  String[][] t = new String[10][2];
  for (int i = 0; i < s_tomb.length; i++){
   int a=0;
   tmp1 = "" + s_tomb[i][0];
   for (int j = 0; j < s_tomb.length; j++){
    tmp2 = "" + s_tomb[j][0];    
//    if (tmp1.compareTo(tmp2) > 0)
    if (("" + s_tomb[i][0]).compareTo("" + s_tomb[j][0]) > 0)
     a++;
   }
   if (t[a][0] == null){
    t[a][0] = s_tomb[i][0];
    t[a][1] = s_tomb[i][1];
   }
   else{
    t[(a+1)][0] = s_tomb[i][0];
    t[(a+1)][1] = s_tomb[i][1];
   }
  }
  System.out.println("Sorrendben a nevek: ");
  for (int i = 0; i < s_tomb.length; i++)
   System.out.println(t[i][0] + " " + t[i][1]); 
 }


 public static void main(String[] args){
  String [][] s_tomb = new String[10][2];
  System.out.println("Teljes nevek csaladnev szerinti ABC-sorba rendezese:\nKerem irja be a neveket soronkent(max 10 nev es 'exit'-tel befejezheto)");
  beolvas(s_tomb);
  rendezo(s_tomb);
 }
}

/* A gyakorlati peldakodok 'F3.java' nevu fajl-jaban megtalalhato a szepen kidolgozott megoldas.
 * Kell: dinamikus tombok, had ne kelljen elore megmondani mennyit akarok.
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
