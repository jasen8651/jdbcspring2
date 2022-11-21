package part02;

import org.apache.ibatis.transaction.Transaction;
import org.springframework.transaction.TransactionStatus;


import model.MemDAO;
import model.MemDTO;

public class ServicImp implements Service{
	
	private MemDAO memDAO;

	
	
	public ServicImp() {
		// TODO Auto-generated constructor stub
	}
	
	public void setMemDAO(MemDAO memDAO) {
		this.memDAO = memDAO;
	}
	@Override
	public void insetProcess() {
		
		memDAO.insertMethod(new MemDTO(49, "최팔잉" , 50, "경기"));
		memDAO.insertMethod(new MemDTO(50, "유팔잉" , 20, "대전"));
	
		
	}
}
