package Illumio.codingChallenge;
// TODO: Auto-generated Javadoc
/**
 * The Class Rule.
 */
public class Rule {

	/** The direction. */
	String direction;

	/** The min port. */
	Integer minPort;

	/** The max port. */
	Integer maxPort;

	/** The protocol. */
	String protocol;

	/** The ip address. */
	IpAddress ipAddress;

	/**
	 * Instantiates a new rule.
	 *
	 * @param direction the direction
	 * @param protocol  the protocol
	 * @param port      the port
	 * @param ip        the ip
	 */
	Rule(String direction, String protocol, String port, String ip) {

		this.direction = direction;
		this.protocol = protocol;
		ipAddress = new IpAddress(ip);

		if (port.contains("-")) {

			String[] combinedPort = port.split("-");
			this.minPort = Integer.parseInt(combinedPort[0]);
			this.maxPort = Integer.parseInt(combinedPort[1]);

		} else {
			this.minPort = Integer.parseInt(port);
			this.maxPort = Integer.parseInt(port);
		}

	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {

		return "direction :" + this.direction + "\nprotocol :" + this.protocol + "\nportrange :" + this.minPort + "-"
				+ this.maxPort + "\nIpAddress :" + ipAddress + "\n";

	}

	/**
	 * To string.
	 *
	 * @return the integer
	 */
	@Override
	public int hashCode() {

		if (this.direction.equals("inbound") && this.protocol.equals("udp")) {
			return 1;
		} else if (this.direction.equals("inbound") && this.protocol.equals("tcp"))
			return 2;
		else if (this.direction.equals("outbound") && this.protocol.equals("udp"))
			return 3;
		else if (this.direction.equals("outbound") && this.protocol.equals("tcp"))
			return 4;
		else
			return 5;

	}

	/**
	 * Equals.
	 *
	 * @param r1 the r 1
	 * @return the boolean
	 */

	public boolean equals(Object obj) {

		if (!(obj instanceof Rule))
			return false;

		Rule r1 = (Rule) obj;
		return r1.direction.equals(this.direction) && r1.protocol.equals(this.protocol) && r1.minPort <= this.minPort
				&& r1.maxPort >= this.maxPort && r1.ipAddress.equals(this.ipAddress);

	}

}
