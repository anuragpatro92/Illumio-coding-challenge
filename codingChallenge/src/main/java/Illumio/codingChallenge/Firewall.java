package Illumio.codingChallenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Hello world!.
 */
public class Firewall implements IFirewall {

	/** The rules. */
	Set<Rule> rules;

	/**
	 * Instantiates a new firewall.
	 *
	 * @param filepath the filepath
	 */
	Firewall(String filepath) {
		rules = new HashSet<Rule>();
		readFile(filepath);

	}

	/**
	 * Read file.
	 *
	 * @param filepath the filepath
	 */
	@SuppressWarnings("resource")
	private void readFile(String filepath) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String line = "";
			while ((line = reader.readLine()) != null) {
				String linRules[] = line.split(",");
				Rule rule = new Rule(linRules[0], linRules[1], linRules[2], linRules[3]);
				rules.add(rule);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/**
	 * Accept packet.
	 *
	 * @param direction  the direction
	 * @param protocol   the protocol
	 * @param port       the port
	 * @param ip_address the ip address
	 * @return the boolean
	 */
	public Boolean accept_packet(String direction, String protocol, Integer port, String ip_address) {

		Rule packetInfo = new Rule(direction, protocol, port.toString(), ip_address);
		return rules.contains(packetInfo);
	}

}
