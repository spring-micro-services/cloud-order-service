package com.innominds;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderManagementApplication implements CommandLineRunner {

    @Value( "${database.name}" )
    private String name;

    @Value( "${database.url}" )
    private String url;

    public static void main( String[] args ) {
        new SpringApplicationBuilder( OrderManagementApplication.class ).run( args );
    }

    @Override
    public void run( String... args ) throws Exception {

        // while ( true ) {
        System.err.println( "Database name  = " + name );
        System.err.println( "Database URL  = " + url );
        // TimeUnit.MILLISECONDS.sleep( 10 );
        // }
    }

}
