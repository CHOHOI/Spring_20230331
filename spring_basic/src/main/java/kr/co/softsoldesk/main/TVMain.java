package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.HelloWorld;
import kr.co.softsoldesk.beans.TV;

public class TVMain {

	public static void main(String[] args) {
		
		//Spring 컨테이너 구동
		//AbstractApplicationContext : BeanFactory + ApplicationContext
		//GenericXmlApplicationContext():파일과 클래스 관리 설정(xml)
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		//컨테이너로부터 필요한 개체를 요청
		TV tv1=(TV)ctx.getBean("tv1"); 
		 
		 tv1.powerOn();
		 tv1.powerOff();
		 tv1.volumeUp();
		 tv1.volumeDown();
		 
		 TV tv2=(TV)ctx.getBean("tv2");
		 tv2.powerOn();
		 tv2.powerOff();
		 tv2.volumeUp();
		 tv2.volumeDown();
		 ctx.close();
		
		
		/*
		 * ClassPathXmlApplicationContext ctx= new
		 * ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		 * 
		 * TV tv1=(TV)ctx.getBean("tv1"); 
		 * TV tv2=(TV)ctx.getBean("tv2");
		 * callMethod(tv1); callMethod(tv2);
		 *  ctx.close();
		 */
		

	}
	
	
	public static void callMethod(TV tv) {
	      tv.powerOn();
	      tv.powerOff();
	      tv.volumeUp();
	      tv.volumeDown();
	   }
}
