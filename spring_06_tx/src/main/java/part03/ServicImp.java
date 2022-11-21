package part03;

import org.apache.ibatis.transaction.Transaction;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional(rollbackFor = java.lang.Exception.class)
	@Override
	public void insetProcess() {
		
		memDAO.insertMethod(new MemDTO(51, "최팔잉" , 50, "경기"));
		memDAO.insertMethod(new MemDTO(52, "유팔잉" , 20, "대전"));
	
		
	}
}
