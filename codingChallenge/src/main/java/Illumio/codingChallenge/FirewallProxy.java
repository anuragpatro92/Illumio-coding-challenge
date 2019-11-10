package Illumio.codingChallenge;

// TODO: Auto-generated Javadoc
/**
 * The Class FirewallProxy.
 */
public class FirewallProxy implements IFirewall {

	/** The firewall. */
	Firewall firewall;
	
	/** The path. */
	String path;

	/**
	 * Instantiates a new firewall proxy.
	 *
	 * @param path the path
	 */
	public FirewallProxy(String path) {

		this.path = path;
	}

	/**
	 * Accept packet.
	 *
	 * @param direction the direction
	 * @param protocol the protocol
	 * @param port the port
	 * @param ip_address the ip address
	 * @return the boolean
	 */
	public Boolean accept_packet(String direction, String protocol, Integer port, String ip_address) {

		if (firewall == null) {
			firewall = new Firewall(path);
		}
		
		return firewall.accept_packet(direction, protocol, port, ip_address);
	}

}
