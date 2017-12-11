package com.dharmu;

import java.util.Scanner;

class SetDetails
{
   static final double BITS=1000000;
   private double marketBuyRate;
   private double marketSellRate;
   private double userValue;
   
   public void setMarketBuyRate(double marketBuyRate)
   {
     this.marketBuyRate=marketBuyRate;
   }
   
   public void setMarketSellRate(double marketSellRate)
   {
     this.marketSellRate=marketSellRate;
   }
   
   public void setUserValue(double userValue)
   {
     this.userValue=userValue;
   }
   
   public double getMarketBuyRate()
   {
     return marketBuyRate;
   }
   
   public double getMarketSellRate()
   {
     return marketSellRate;
   }
   
   public double getUserValue()
   {
     return userValue;
   }
}

class Calculate
{
   SetDetails sd=new SetDetails();
  public void calculate(int option)
  {
    switch(option)
    {
      case 1:
      {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter market rate:");
        sd.setMarketBuyRate(sc.nextDouble());
        System.out.println("Enter user amount:");
        sd.setUserValue(sc.nextDouble());
        converter();
        break;
      }
      case 2:
      {
        //SetDetails sd=new SetDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter market buy rate:");
        sd.setMarketBuyRate(sc.nextDouble());
        System.out.println("Enter market sell rate:");
        sd.setMarketSellRate(sc.nextDouble());
        System.out.println("Enter user amount:");
        sd.setUserValue(sc.nextDouble());
        comparison();
        break;
      }
      default:
      {
        System.out.println("Invalid choice.");
        
      }
    }
  }
  public void converter()
  {
    double temp,temp1;
    temp=sd.getMarketBuyRate()/sd.BITS;
    temp1=sd.getUserValue()/temp;
    System.out.println("Number of bits:"+(temp1/sd.BITS));
  }
  
  public void comparison()
  {
    double percentage;
    double difference;
    difference=sd.getMarketSellRate()-sd.getMarketBuyRate();
    percentage=(difference/sd.getMarketBuyRate())*100;
    System.out.println("Trade fee on "+(int)sd.getUserValue()+" is:"+tax());
    System.out.println("Total payable amount:"+(sd.getUserValue()+tax()));
    System.out.println("profit:"+(((sd.getUserValue()/100)*percentage)-tax()));
  }
  
  public double tax()
  {
    return (sd.getUserValue()*(0.25))/100;
  }
}
public class BitcoinConverter {
  
  public static void main(String[] args) 
  {
    System.out.println("1:Amount to bits");
    System.out.println("2: Comparison");
    System.out.println("Enter your choice:");
    int option=new Scanner(System.in).nextInt();
    Calculate c=new Calculate();
    c.calculate(option);
  }
  
}
