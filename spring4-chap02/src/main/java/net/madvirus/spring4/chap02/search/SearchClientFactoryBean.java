package net.madvirus.spring4.chap02.search;

import org.springframework.beans.factory.FactoryBean;

// 생성할 스프링 빈 객체의 타입은 SearchClientFactory 이므로 FactoryBean의 제너릭 타입 파라미터로
// SearchClientFactory를 사용하였다.
public class SearchClientFactoryBean implements FactoryBean<SearchClientFactory>{
	
	private SearchClientFactory searchClientFactory;
	
	private String server;
	private int port;
	private String contentType;
	private String encoding;
	
	public void setServer(String server) {
		this.server = server;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	
	// 빈 객체로 사용될 SearchClientFactory를 생성하고 이를 리턴한다.
	@Override
	public SearchClientFactory getObject() throws Exception {
		if (this.searchClientFactory != null)
			return this.searchClientFactory;
		
		SearchClientFactoryBuilder builder = new SearchClientFactoryBuilder();
		builder.server(server)
			.port(port)
			.contentType(contentType == null ? "json" : contentType)
			.encoding(encoding);
		
		SearchClientFactory searchClientFactory = builder.build();
		searchClientFactory.init();
		// 매번 동일한 객체를 리턴하기 위해 생성한 객체를 searchClientFactory 필드에 보관한다.
		this.searchClientFactory = searchClientFactory;
		
		return this.searchClientFactory;
	}
	
	// 스프링이 사용할 빈 객체의 타입을 리턴한다.
	@Override
	public Class<?> getObjectType() {
		return SearchClientFactory.class;
	}
	
	// 매번 동일한 객체를 리턴하므로 true를 리턴한다.
	@Override
	public boolean isSingleton() {
		return true;
	}
	
	

}
