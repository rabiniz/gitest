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


}
