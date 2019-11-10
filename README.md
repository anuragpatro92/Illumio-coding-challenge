# Illumino-coding-challenge
A coding challenge by lllumino

__Problem Statement__

Given a set of firewall rules, a network packet will be accepted by the firewall if and only if the
direction, protocol, port, and IP address match at least one of the input rules. If a rule contains
a port range, it will match all packets whose port falls within the range. If a rule contains an IP
address range, it will match all packets whose IP address falls within the range.

__Technologies and language__

* programming language - JAVA
* build Tool - Maven
* run command - `mvn clean install`, `mvn -Dtest=FirewallTest,FirewallProxyTest test` (any one)

__Design methodologies__

* Proxy Design Pattern has been used that does the work of lazy loading. The `Firewall.java` class loads the `input.csv` file as soon as it is initialized. Using a proxy pattern, `FirewallProxy.java` ensures that the file is loaded only when the first packet arrives, eliminating the need to keep the huge ruleset in memory.

* In order to store the the ruleset, a `HashSet` is used which internally implements a hashing technique. `Object` methods have been further overloaded which compare the incoming packet with the existing ruleset. This has been done to leverage HashSet methods to search. The time complexity of search mechanism is O(logN)


__Further improvements__

* Implement advance hashing techniques to reduce search complexity.
* Train a Machine Learning model to detect patterns in malicious packets.


__Team Interested__

I would like to work in `Platform Team`
