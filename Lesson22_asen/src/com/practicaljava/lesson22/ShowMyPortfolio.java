package com.practicaljava.lesson22;

public class ShowMyPortfolio {
    public static void main(String args[]){
        
        MarketNews mn = new MarketNews();
        Thread m = new Thread(mn,"Market News");
        m.start();
            
        Runnable port = new Portfolio();
        Thread p = new Thread(port, "Portfolio Data");
        p.start();

        System.out.println( "ShowMyPortfolio is finished");
       }
}
