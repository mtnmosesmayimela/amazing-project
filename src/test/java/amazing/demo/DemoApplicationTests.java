package amazing.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
        
        @Test
        public void testMain() {
          try {
            DemoApplication.main(new String[0]);
          } catch (Exception e) {
            fail("No exceptions should occur on startup.");
          }
        }
        
        @Test
        public void testMessage()
        {
            DemoApplication instance= new DemoApplication();
            String result=instance.message();
            String expected="{\"Message\":\"hello devOps1!\"}";           
             assertEquals(expected, result);
        }
}
