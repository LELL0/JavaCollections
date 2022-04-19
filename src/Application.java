import java.io.IOException;

public class Application {

	static MyLinkedList myLinkedList = new MyLinkedList();
	static MyArrayList myArrayList = new MyArrayList();
	static MyHashSet myHashSet = new MyHashSet();
	static MyArrayDeque myArrayDeque = new MyArrayDeque();

	public static void main(String[] args) throws IOException, InterruptedException {
		String fileName = "names10^5.txt";

		System.out.println("\n linkedList insert time:" + myLinkedList.insertTime(fileName) + "ms\n");
		System.out.println("\n ArrayList insert time:" + myArrayList.insertTime(fileName) + "ms\n");
		System.out.println("\n HashSet insert time:" + myHashSet.insertTime(fileName) + "ms\n");
		System.out.println("\n ArrayDeque insert time:" + myArrayDeque.insertTime(fileName) + "ms\n");

		System.out.println("\n==================================================================================\n");

		System.out.println("\n linkedList iteration time:" + myLinkedList.displayTime() + "ms\n");
		System.out.println("\n ArrayList iteration time:" + myArrayList.displayTime() + "ms\n");
		System.out.println("\n HashSet iteration time:" + myHashSet.displayTime() + "ms\n");
		System.out.println("\n ArrayDeque iteration time:" + myArrayDeque.displayTime() + "ms\n");

		System.out.println("\n==================================================================================\n");

		System.out.println("\n linkedList deletion time:" + myLinkedList.deleteTime() + "ms\n");
		System.out.println("\n ArrayList deletion time:" + myArrayList.deleteTime() + "ms\n");
		System.out.println("\n HashSet deletion time:" + myHashSet.deleteTime() + "ms\n");
		System.out.println("\n ArrayDeque deletion time:" + myArrayDeque.deleteTime() + "ms\n");

	}

}
