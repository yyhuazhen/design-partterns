package org.example;

/**
 *策略模式本质：分离算法，选择实现
 *
 */
public class Client
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Strategy strategy = new NormalCustomerStrategy();
        Content content = new Content(strategy);
        double quote = content.quote(100.00);
        System.out.println(quote);
    }
}
