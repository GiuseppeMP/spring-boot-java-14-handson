module spring.boot.java.handson {
        requires spring.web;
        requires spring.boot;
        requires spring.boot.autoconfigure;
        requires spring.core;
        requires java.base;
        requires java.sql;
        requires com.fasterxml.classmate;
        requires com.fasterxml.jackson.databind;
        requires org.mapstruct.processor;
        requires static lombok;

        exports br.com.giuseppemp.springbootjava14;
        opens br.com.giuseppemp.springbootjava14 to spring.core, org.junit.jupiter, org.junit.jupiter.api;

}