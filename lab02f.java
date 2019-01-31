//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -


import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
import java.text.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.util.Collections.*;
import static java.util.Arrays.*;
import static java.lang.Double.*;
import static java.lang.Character.*;
import static java.lang.Math.*;

public class lab02f
{
 public void run()
 {
  Scanner keyboard = new Scanner(in);
  int x1,y1, x2, y2;
  double slope;
  System.out.println("Enter x1 ::");
  x1 = keyboard.nextInt();
  System.out.println("Enter y1 ::");
  y1 = keyboard.nextInt();
  System.out.println("Enter x2 ::");
  x2 = keyboard.nextInt();
  System.out.println("Enter y2 ::");
  y2 = keyboard.nextInt();
  slope = ( (double)(y2-y1)/(double)(x2-x1));
  
  out.printf("The slope is :: %.2f ",slope);




 }

 public static void main(String[] args)
 {
  lab02f test = new lab02f();
  test.run();
 }
}