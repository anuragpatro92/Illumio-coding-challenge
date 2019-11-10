package Illumio.codingChallenge;

// TODO: Auto-generated Javadoc
/**
 * The Interface IFirewall.
 */
public interface IFirewall {

	/**
	 * Accept packet.
	 *
	 * @param direction the direction
	 * @param protocol the protocol
	 * @param port the port
	 * @param ip_address the ip address
	 * @return the boolean
	 */
	public Boolean accept_packet(String direction, String protocol, Integer port, String ip_address);
}
