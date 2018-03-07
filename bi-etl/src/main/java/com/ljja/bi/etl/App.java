package com.ljja.bi.etl;

import java.sql.Driver;

public class App
{
    public static void main(String[] args)
    {
        Driver d = new oracle.jdbc.driver.OracleDriver();
        System.out.println(d);
        System.out.println(App.class);
    }
}
