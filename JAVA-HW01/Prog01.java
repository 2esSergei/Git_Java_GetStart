//01.Feladatsor-2013.09.30
//compiler: "c:\Program Files\Java\jdk1.7.0_25\bin"\javac <filename.java>
//run: java <filename>
//teszt bemenet:java Prog01 abd abc gasd ojio abc 1 2654574413544648 1 2 1.123 abc 1 abc 3 4 3

/*
1. Keszits "Hello vilag" programot.
2. Ird ki a parancssori parameterek szamat.
3. Ird ki a parancssori parametereket
    - sorban
    - sorszamozva
    - forditott sorrendben
    - csak a hosszaikat
    - az osszeguket (tfh mind szam)
    - a parosakat
    - sorrendben (tfh mind szoveg)
    - sorrendben (tfh mind szam)
    - azokat, amelyikekbol tobb is talalhato
4. Ird ki a Fibonacci-sorozat elso n elemet.
   Az n parametert a parancssorbol olvasd ki.
5. Add meg egy parancssorbol kapott szam osszes osztojat.
6. Vonj negyzetgyokot egy parancssorbol kapott szambol.
    - Newton-iteracioval is
7. A parancssori parameterek lengyel formaban adott kifejezest irnak le.
   A kifejezesben a negy alapmuvelet szerepelhet. Szamitsd ki az eredmenyt.

    Pl. 1 2 3 * + eredmenye (3 * 2) + 1, azaz 7
*/

import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;

public class Prog01 {
 public static void main(String[] args){
  int a=0;

//*****I-1
  System.out.println("Hail!!!\n");
	
//*****I-2
  for (int i=0; i<args.length; i++)
   a++;
   System.out.println("Parancssori parameterek szama: " + a);

//*****I/3/1
  System.out.println("Parancssori parameterek:");
  for (int i=0; i<args.length; i++){
   System.out.println(args[i]);
  }

//*****I/3/2
  System.out.println("Parancssori parameterek sorszammal:");
  for (int i=0; i<args.length; i++)
   System.out.println("Az " + (i+1) + ".-ik parameter: " + args[i]); 

//*****I/3/3
  System.out.println("Parancssori parameterek forditott sorrendben:");
  for (int i = args.length; i > 0; i--)
   System.out.println(args[i-1]);

//*****I/3/4
  System.out.println("Parancssori parameterek karakterhossza sorrendben:");
  for (int i = 0; i<args.length; i++)
   System.out.println(args[i].length());
/*Ezek nem fernek ossze a tobbivel
//*****I/3/5
  System.out.println("Parancssori parameterek osszege:");
  a = 0;
  for (int i = 0; i<args.length; i++)
   a += Integer.parseInt(args[i]);
  System.out.println(a);

//*****I/3/6
  System.out.println("Paros parancssori parameterek:");
  for (int i = 0; i<args.length; i++)
   if (Integer.parseInt(args[i])%2 == 0)
    System.out.println(args[i]);
*/

//*****I/3/7
/*Compare attekintese
  System.out.println("Parancssori parameterek (szavak): ");
  a = args[0].compareToIgnoreCase(args[1]);
  if (a < 0)
   System.out.println(args[0]);
  else
   System.out.println(args[1]);
*/

  System.out.println("Parancssori parameterek (szavak): ");
  String[] t = new String[args.length];
  for (int i = 0; i < args.length; i++){
   a=0;
   for (int j = 0; j < args.length; j++){
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

//*****I/3/8
//Az elozo megoldas erre a feladatra is tokeletesen megfelelo

//*****I/3/9
  System.out.println("Tobbszor szereplo parancssori parameterek:");
  boolean b;
  for (int i = 0; i < args.length; i++){
   b = true;
   for (int j = 0; j < args.length; j++){
    if (args[i].compareTo(args[j]) == 0 && j < i) //aternativa: equals()
     b = false;
    if (args[i].compareTo(args[j]) == 0 && b && i != j){
     System.out.println(args[i]);
     b = false;
    }
   }
  }

//*****I/4
  System.out.println("Fibonacci-sorozat elemei!\nKerem adja meg hany elemet szamoljak ki:");
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int x,y;
  x = 0;
  y = 1;
  for (int i = 0; i < n; i++){
   a = x + y;
   y = x;
   x = a;
   System.out.println(i + ".-ik elem: " + a);
  }

//*****I/5
  System.out.println("Beirt szam ossze osztoja!\nKerem adja meg a szamot:");
  n = in.nextInt();
  for (int i = 1; i < n+1; i++){
   if(n%i == 0)
    System.out.println(i);
  }

//*****I/6
  System.out.println("Gyokvonas! Kerem adja meg a szamot:");
  float f = in.nextFloat();
  System.out.println("Beepitett fuggvennyel: " + Math.sqrt(f));
  float g = f/2;
  for (int i = 0; i< 1000000; i++){
   g = (g +f/g)/2;
  }
  System.out.println("Newton-iteracioval: " + g);

//*****I/7
  System.out.println("Lengyel forma feldolgozasa!\nKerem adja meg a szamot:");
  Stack v = new Stack();
  while(in.hasNext()){
   String s,o1,o2,o3;
   o1 = "";
   o2 = "";
   s = in.next();
   switch (s){
    case "+":
     f = Float.parseFloat(o1 + v.pop()) + Float.parseFloat(o2 + v.pop());
     v.push(f);
     break;
    case "-":
     f = Float.parseFloat(o1 + v.pop()) - Float.parseFloat(o2 + v.pop());
     v.push(f);
     break;
    case "*":
     f = Float.parseFloat(o1 + v.pop()) * Float.parseFloat(o2 + v.pop());
     v.push(f);
     break;
    case "/":
     f = Float.parseFloat(o1 + v.pop()) / Float.parseFloat(o2 + v.pop());
     v.push(f);
     break;
    default: 
     v.push(s);
   }
   //Nem fejezi be a beolvasast valamiert.
   o3 = "";
   o3 = o3 + v.pop();
   v.push(o3);
   System.out.println("CIKLUSMAG VEGE! " + o3);
  }
 }
}
