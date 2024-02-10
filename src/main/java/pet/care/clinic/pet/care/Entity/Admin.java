package pet.care.clinic.pet.care.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin {
 
	private String AdName;
	private int AdId;
	private String AdEmail;
	private String AdPassword;
	
	private AdminService AdminServices;

}
