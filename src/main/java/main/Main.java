package main;

import beans.Tiger;
import beans.TigerMaster;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var tm1 = c.getBean(TigerMaster.class);
        var t1 = c.getBean(Tiger.class);

        System.out.println(tm1);
        System.out.println(t1);
        System.out.println(tm1.getTiger());


    }
}
