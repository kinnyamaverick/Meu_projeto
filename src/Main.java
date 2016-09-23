import br.com.ifspcaraguatatuba.dao.userDao;
import br.edu.ifspcaraguatatuba.model.Phone;
import br.edu.ifspcaraguatatuba.model.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user = new User();
		Phone phone = new Phone();
		userDao uDao = new userDao();
		user.setPhone(phone);
		
		uDao.persist(user);
		
		
		

	}

}
