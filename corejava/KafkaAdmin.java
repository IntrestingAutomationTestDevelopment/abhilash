package corejava;

public class KafkaAdmin {

	
	public static void producer() {
		System.out.println("Sending Messages to Kafka Topics");
	}
	public static void consumer() {
		System.out.println("Reads Messages From Kafka Topics");
	}
	public static void topics() {
		System.out.println("A category to which records/messages are sent by producers and consumed by consumers.");
	}
	public static void partition() {
		System.out.println("Each topic is divided into multiple partitions to allow parallelism.\r\n"
				+ "Partitions store messages in an append-only log.");
	}
	public static void offSet() {
		System.out.println("A unique ID assigned to each message in a partition, used to track messages.");
	}
	public static void kafkaServer() {
		System.out.println("A Kafka server that stores data and serves client requests.");
	}
	
	public static void zookeeper() {
		System.out.println("Manages cluster metadata and keeps track of brokers KRAFT"); 
	}
}
