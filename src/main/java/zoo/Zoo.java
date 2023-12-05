package zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
    @Autowired
    @Qualifier(value = "cow")
	private Animal animal;
    
    public void zooSound() {
    	animal.sound();
    }
    
    
}
