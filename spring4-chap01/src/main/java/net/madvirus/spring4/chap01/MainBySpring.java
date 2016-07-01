package net.madvirus.spring4.chap01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBySpring {

	public static void main(String[] args) {
		String configLocation = "classpath:applicationContext.xml";
		
		// 스프링 컨테이너 역할 수행
		// configLocation에 위치한 applicationContext.xml 설정 파일 정보를 읽어 스프링 빈 객체를 생성 및 관리
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		// 생성된 스프링 빈 객체는 getBean() 메서드를 사용해서 구할 수 있다.
		// getBean(스프링 빈 객체 이름, 빈 객체의 타입);
		Project project = ctx.getBean("sampleProject", Project.class);
		project.build();
		ctx.close();
	}
	
	/*
	 * 1. 스프링은 ApplicationContext 라는 인터페이스를 통해 컨테이너가 제공해야 할 기본 기능을 정의하고 있다.
	 * 	  (ApplicationContext 인터페이스 상위에 BeanFactory라는 인터페이스가 더 있다.)
	 * 2. AbstractApplicationContext는 컨테이너 종료와 같은 관리 기능을 제공하고 있다.
	 * 3. GenericXmlApplicationContext는 AbstractApplicationContext를 상속 받아 만들어진 클래스로서
	 * 	  XML 파일에서 스프링 빈 설정 정보를 읽어온다.
	 */
	
}
