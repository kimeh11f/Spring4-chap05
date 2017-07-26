package config;

public class JavaConfig {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberResisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter() {
			infoPrinter.setMemberDao(memberDao());
			infoPrinter.setMemberPrinter(printer());
			return infoPrinter;
		}
	}
}
