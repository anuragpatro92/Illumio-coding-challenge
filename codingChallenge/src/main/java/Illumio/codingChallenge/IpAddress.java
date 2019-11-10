package Illumio.codingChallenge;

import java.util.ArrayList;

import java.util.List;


/**
 * The Class IpAddress.
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class IpAddress {

	/** The start range. */
	List<Integer> startRange = new ArrayList();

	/** The end range. */
	List<Integer> endRange = new ArrayList();

	/**
	 * Instantiates a new ip address.
	 *
	 * @param ipAddress the ip address
	 */
	public IpAddress(String ipAddress) {

		String tempStartRange[];
		String tempEndRange[];
		if (ipAddress.contains("-")) {
			String[] spiltIps = ipAddress.split("-");
			tempStartRange = spiltIps[0].split("\\.");
			tempEndRange = spiltIps[1].split("\\.");

		} else {
			tempStartRange = tempEndRange = ipAddress.split("\\.");
		}

		for (int i = 0; i < 4; i++) {
			startRange.add(Integer.parseInt(tempStartRange[i]));
			endRange.add(Integer.parseInt(tempEndRange[i]));
		}
	}

	public int hashCode() {
		return 0;

	}

	/**
	 * Equal.
	 *
	 * @param ipAddress the ip address
	 * @return the boolean
	 */
	public boolean equals(Object obj) {

		if (!(obj instanceof IpAddress))
			return false;

		IpAddress ipAddress = (IpAddress) obj;
		for (int i = 0; i < 4; i++) {

			if (!(this.startRange.get(i) <= ipAddress.startRange.get(i))
					|| !(this.endRange.get(i) >= ipAddress.endRange.get(i))) {
				return false;
			}

		}

		return true;

	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "startRange :" + startRange + "EndRange :" + endRange;
	}
}
