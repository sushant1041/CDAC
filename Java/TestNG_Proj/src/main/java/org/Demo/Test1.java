package org.Demo;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.*;

public class Test1 {
    @Test(priority = 1)
    public void f(){
        System.out.println("f");
    }
    @Test(priority = 2)
    public void v(){
        System.out.println("V");
    }
    @Test(priority = 3)
    public void m(){
        System.out.println("M");
    }
    @Test(priority = 4)
    public void l(){
        System.out.println("L");
    }


}
