package com.dharmu;

import java.util.Scanner;
import java.lang.Math;

public class ViralAdvertisement 
{
  
  //counter for likes
  static int likes=0;
  //advertisement given to m people on 1st day
  static int m;
  //number of days
  static int n;
  //share
  static int share;
  public static void main(String[] args) 
  {
    //object of scannner class
    Scanner sc=new Scanner(System.in);
    //value for m
    System.out.println("Enter no people on first day:");
    m=sc.nextInt();
    System.out.println("Enter no of days:");
    n=sc.nextInt();
    //condition for days not less than 0 and greater than 50
    if(n<0&&n>50)
    {
      sc.close();
      return ;
    }
    for(int i=1;i<=n;i++)
    {
       likes=likes+(int)Math.floor(m/2);
       int dislikes=m-(int)Math.floor(m/2);
       int dayLikes=(int)Math.floor(m/2);
       m=dayLikes*3;
    }
    System.out.println("Likes:"+likes);
  }
}
