package PICO_Container_TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.Guice;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
public class PICO_Container_Module {
	
	    private final POM x;

	    // Constructor injection
	    public PICO_Container_Module(POM ref) {
	        this.x = ref;
	    }

	    @Test
	    public void S1() {
	        x.add(5, 2);
	        System.out.println(x.getResult());
	    }

	    @Test
	    public void S2() {
	        int ans1 = x.getResult();
	        System.out.println("ans 1 --> " + ans1);
	    }

	    public static void main(String[] args) {
	        // Initialize PicoContainer
	        MutablePicoContainer pico = new DefaultPicoContainer();

	        // Register the POM class
	        pico.addComponent(POM.class);

	        // Register the Runner_02 class with its dependencies
	        pico.addComponent(Runner_02.class);

	        // Get the Runner_02 instance
	        Runner_02 runner = pico.getComponent(Runner_02.class);

	        // Run the tests manually
//	        runner.S1();
//	        runner.S2();
	    }
	}



