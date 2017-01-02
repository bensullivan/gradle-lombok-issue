package net.bensullivan.sandpit;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"hello"})
public class HelloWorld {
    private final String hello = "Hello";
}
