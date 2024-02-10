package pet.care.clinic.pet.care.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
	private int CliId;
	private String CliName;
	private int CliContact;
	private String CliAddress;

	private ClientService ClientServices;
}
