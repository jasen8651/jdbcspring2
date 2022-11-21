package part01;

import org.apache.ibatis.transaction.Transaction;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import model.MemDAO;
import model.MemDTO;

public class ServicImp implements Service{
	
	private MemDAO memDAO;
	private TransactionTemplate transactionTemplate;
	
	
	public ServicImp() {
		// TODO Auto-generated constructor stub
	}
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	public void setMemDAO(MemDAO memDAO) {
		this.memDAO = memDAO;
	}
	@Override
	public void insetProcess() {
		String resuit = transactionTemplate.execute(new TransactionCallback<String>() {
			@Override
			public String doInTransaction(TransactionStatus status) {
				try {
					memDAO.insertMethod(new MemDTO(44, "최팔잉" , 50, "경기"));
					memDAO.insertMethod(new MemDTO(45, "유팔잉" , 20, "대전"));
					return "ok";	
				}catch (Exception ex) {
					status.setRollbackOnly();
					return ex.toString();
				}
			}
			
		});
		System.out.println("resuit:"+ resuit);
		
	}
}
