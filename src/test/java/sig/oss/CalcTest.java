public class CalcTest {
@Test 
public testAdd(){

 Calc c = new Calc();
 assertEquals( 30, c.add(10, 20));

}

@Test 
public testSub(){

Calc c = new Calc();
assertEquals( 10, c.sub(30,20));
}


@Test
public void testMultipleInc(){
 Calc c = new Calc();
 c.inc(25);
 c.inc(25);
 assertEquals( 50, c.getResult());
}

}
