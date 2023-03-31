package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.HelloWorld;

public class MainClass {

   public static void main(String[] args) {
      
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
      
      HelloWorld hello1 = (HelloWorld)ctx.getBean("hello1");
      callMethod(hello1);
      ctx.close();
   }
   
   public static void callMethod(HelloWorld hello) {
      hello.sayHello();
   }

}