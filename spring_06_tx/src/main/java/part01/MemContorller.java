package part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//http://localhost:8090/myapp/firstmain.st

@Controller
public class MemContorller {
	private Service svc;
	
	public MemContorller() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSvc(Service svc) {
		this.svc = svc;
	}
	
	@RequestMapping("/firstmain.st")
	public void execute() {
		System.out.println("execute");
		svc.insetProcess();
	}
}
