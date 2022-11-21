package part03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//http://localhost:8090/myapp/treemain.se

@Controller
public class MemContorller {
	private Service svc;
	
	public MemContorller() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSvc(Service svc) {
		this.svc = svc;
	}
	
	@RequestMapping("/treemain.se")
	public void execute() {
		System.out.println("execute");
		
		try {
			svc.insetProcess();
			System.out.println("ok");
		}catch (Exception ex) {
			System.out.println("result :"+ ex.toString());
		}
		
	}
}
