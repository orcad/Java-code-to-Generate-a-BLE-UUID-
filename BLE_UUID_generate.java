
import java.util.UUID;

public class BLE_UUID_generate {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		String uuidAsString = uuid.toString();

		System.out.println("==============");
		System.out.println("Your UUID is: " + uuidAsString);
		System.out.println("==============");
	}

}
