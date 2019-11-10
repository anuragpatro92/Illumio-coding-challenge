package Illumio.codingChallenge;

import static org.junit.Assert.assertEquals;



import org.junit.Before;
import org.junit.Test;

import Illumio.codingChallenge.FirewallProxy;

public class FirewallProxyTest {
	
	FirewallProxy firewall;
	
	
	@Before
	public void setUp() {
		
		firewall = new FirewallProxy("../codingChallenge/src/main/java/Illumio/codingChallenge/input.csv");

		
	}

	/**
	 * Test 1.
	 */
	@Test
	public void proxytest1() {

		assertEquals(true, firewall.accept_packet("outbound", "udp", 1005, "52.12.48.92"));
	}
	
	/**
	 * Test 2.
	 */
	@Test
	public void proxytest2() {
		assertEquals(false,firewall.accept_packet("inbound", "udp", 1005, "52.12.48.92"));
	}
	

	/**
	 * Test 3.
	 */
	@Test
	public void proxytest3() {
		assertEquals(true,firewall.accept_packet("inbound", "udp", 53, "192.168.1.1"));
		
	}
	
	/**
	 * Test 4.
	 */
	@Test
	public void proxytest4() {
		assertEquals(true,firewall.accept_packet("outbound", "tcp", 10001, "192.168.10.11"));

	}

}
