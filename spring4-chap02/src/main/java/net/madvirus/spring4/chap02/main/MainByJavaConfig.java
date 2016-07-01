package net.madvirus.spring4.chap02.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.madvirus.spring4.chap02.AuthenticationService;
import net.madvirus.spring4.chap02.PasswordChangeService;
import net.madvirus.spring4.chap02.conf.Config;

public class MainByJavaConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Config.class);
		
		AuthenticationService authSvc = 
				ctx.getBean("authenticationServce", AuthenticationService.class);
		authSvc.authenticate("bkchoi", "1234");
		
		PasswordChangeService pwChgSvc = 
				ctx.getBean(PasswordChangeService.class);
		pwChgSvc.changePassword("bkchoi", "1234", "5678");
		
		ctx.close();
	}
	
}
