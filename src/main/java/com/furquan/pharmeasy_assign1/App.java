/**
 * 
 */
package com.furquan.pharmeasy_assign1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author furquan.ahmed
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String... args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is working");
    }

}
