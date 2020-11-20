package csc131.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class GiftCardTest
{
 @Test
 public void getIssuingStore()
 {
	 double balance;
	 GiftCard card;
	 int issuingStore;

	 issuingStore = 1337;
	 balance = 100.00;
	 card = new GiftCard(issuingStore, balance);
	 assertEquals("getIssuingStore()",issuingStore, card.getIssuingStore());
	 
	 
 }
 @Test
 public void getBalance()
 {
	 double balance;
	 GiftCard card;
	 int issuingStore;
	 
	 issuingStore =1337;
	 balance = 100.00;
	 card = new GiftCard(issuingStore,balance);
	 
	 Assert.assertEquals("getBalance()",balance, card.getBalance(), 0.001);
 }
 
 @Test
 public void deduct
 {
	 GiftCard card;
	 int issuingStore;
	 String remainder;
	 double balance;
	 balance = 100.00;
	 card = new GiftCard(issuingStore, balance);
	 
	 Assert.assertEquals("getBalance()", balance, card.getBalance(),0.001);
 }
 

private void assertEquals(String string, int issuingStore, int issuingStore2) {
	// TODO Auto-generated method stub
	
}
}

class GiftCardTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
