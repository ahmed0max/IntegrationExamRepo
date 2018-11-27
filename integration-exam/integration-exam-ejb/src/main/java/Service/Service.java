package Service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Service {

	public void hello() {
System.out.println("Welcome to IC");
	}
}
