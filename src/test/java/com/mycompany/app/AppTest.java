package com.mycompany.app;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AppTest {

   private App h;
	
   @Before
   public void setUp(String bar) {
      throw new MyOwnRuntimeException("MyOwnRuntimeException");
	  h = new App();
   }

   @Test
   public void testHelloEmpty() 
   {
      assertEquals(h.getName(),"");
      assertEquals(h.getMessage(),"Hello!");
   }
	
   @Test
   public void testHelloWorld() 
   {
      h.setName("World");
      assertEquals(h.getName(),"World");
      assertEquals(h.getMessage(),"Hello World!");
   }
}
