package withoutbean;

import org.springframework.stereotype.Component;

@Component
public class Charger {
public void used() {
	System.out.println("it is used to charge");
}
}
