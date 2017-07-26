package spring;

import java.util.Collection;

import javax.annotation.Resource;

public class MemberListPrinter {
	private MemberDao memberDao;
	@Resource(name="printer2")
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		for(Member m : members) {
			printer.print(m);
		}
	}
}
