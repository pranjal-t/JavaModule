package test.example; 

import example.DemoClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/** 
* DemoClass Tester. 
* 
* @author <Authors name> 
* @since <pre>Jul 26, 2022</pre> 
* @version 1.0 
*/ 
public class DemoClassTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: extracted(int[] a) 
* 
*/ 
@Test
public void testExtracted() throws Exception { 
//TODO: Test goes here...

    int a[] = {2,3,4,1,1};
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(4);
    DemoClass demoClass = new DemoClass();

    List<Integer> val = DemoClass.extracted(a);

    Assert.assertEquals(val, list);

} 


} 
