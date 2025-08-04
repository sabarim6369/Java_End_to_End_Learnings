package Callable;

import java.util.concurrent.Callable;

public class work implements Callable<String> {
    public String call(){
        return "hello";
    }
}
