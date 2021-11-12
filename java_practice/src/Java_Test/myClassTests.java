package JavaChallenge;


import java.util.ArrayList;
import java.util.LinkedList;


public class myClassTests {

	public static void main(String[] args) {
		myArraylist1 List = new myArraylist1();
		//末尾插入
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		List.add(7);
		List.add(8);
		List.add(5);
		List.add(7);
		List.add(8);
		List.add(5);
		//自选位置插入
		List.add(2,11);
		//size
		System.out.println("size = " + List.size());
		System.out.println("index3 = " + List.get(3));
		//toArray
		for(Integer i : List.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
		//遍历
		for(int i = 0; i < List.size(); i++) {
			System.out.println("遍历 = " + List.get(i));
		}
		//indexOf
		int position = List.indexOf(7);
		System.out.println("第一个数字是7的index = " + position);
		
		//lastIndexOf
		int lastPosition = List.lastIndexOf(7);
		System.out.println("最后一个数字是7的index = " + lastPosition);
		
        //remove
        List.remove(3);
		for(Integer i : List.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}

		
		//clear
		List.clear();
		for(Integer i : List.toArray()) {
			System.out.print("遍历数组里的所有元素 = " + i);
		}
		//isEmpty
		boolean result = List.isEmpty();
		System.out.println(result);
		
		ArrayList<Integer> TestList = new ArrayList<Integer>();
		TestList.add(3);
		TestList.add(4);
		TestList.add(5);
		TestList.add(6);
		TestList.add(7);
		TestList.add(8);
		TestList.add(9);
		TestList.add(7);
		TestList.add(2,11);
		//size
		System.out.println("size = " + TestList.size());
		System.out.println("index3 = " + TestList.get(3));
		
		for(Object i : TestList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
		//indexOf
		int Testposition = List.indexOf(7);
		System.out.println("第一个数字是7的index = " + position);
		
		//lastIndexOf
		int TestLastPosition = List.lastIndexOf(7);
		System.out.println("最后一个数字是7的index = " + lastPosition);
		
        //remove
        TestList.remove(3);
		for(Object i : TestList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}

		
		//clear
		List.clear();
		for(Integer i : List.toArray()) {
			System.out.print("遍历数组里的所有元素 = " + i);
		}
		//isEmpty
		boolean TestResult = List.isEmpty();
		System.out.println(result);
		
		//myLinkedList
		myLinkedList3 linkList = new myLinkedList3();
		//add
		linkList.add(3);
		linkList.add(4);
		linkList.add(5);
		linkList.add(6);
		linkList.add(7);
		linkList.add(6);
		linkList.add(6);
		//add2
		linkList.add(3,11);
		//addFirst
		linkList.addFirst(2);
		//addLast
		linkList.addLast(10);
		//get
		System.out.println(linkList.get(3));
		//getFirst
		System.out.println(linkList.getFirst());
		//getLast;
		System.out.println(linkList.getLast());
		
		//Indexof
		int lposition = linkList.indexOf(6);
		System.out.println("第一个数字是7的index = " + lposition);
		//lastIndexOf
		int llposition = linkList.lastIndexOf(6);
		System.out.println("最后一个数字是6的index" + llposition);
		
		//offer
		linkList.offer(13);
		System.out.println(linkList.get(10));
		
		//offerFirst
		linkList.offerFirst(1);
		System.out.println(linkList.get(0));
		
		//offerLast
		linkList.offerLast(14);
		System.out.println(linkList.getLast());
		
		//peek
		System.out.println(linkList.peek());
		//peekFirst
		System.out.println(linkList.peekFirst());
		//peekLast
		System.out.println(linkList.peekLast());
		
		//poll
		System.out.println(linkList.poll());
		//pollFirst
		System.out.println(linkList.pollFirst());
		//pollLast;
		System.out.println(linkList.pollLast());
		//pop
		System.out.println(linkList.pop());
		//push
		linkList.push(17);
		System.out.println(linkList.getFirst());
		
		for(Object i : linkList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
		System.out.println();
		//remove
		linkList.remove(0);
		for(Object i : linkList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}		
		
		//removeFirst
		linkList.removeFirst();
		System.out.println(linkList.getFirst());
		
		//removeFirstOccurence
		linkList.removeFirstOccurrence(6);
		for(Object i : linkList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
		
		//removeLast
		linkList.removeLast();
		System.out.println(linkList.getLast());
		
		//removeLastOccurence
		linkList.removeLastOccurrence(6);
		for(Object i : linkList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
		//clear
		linkList.clear();
		for(Object i : linkList.toArray()) {
			System.out.print("遍历数组里的所有元素 = " + i);
		}

		LinkedList<Integer> TestLinkList = new LinkedList<Integer>();
		//add
		TestLinkList.add(3);
		TestLinkList.add(4);
		TestLinkList.add(5);
		TestLinkList.add(6);
		TestLinkList.add(7);
		TestLinkList.add(6);
		TestLinkList.add(6);
		//add2
		TestLinkList.add(3,11);
		//addFirst
		TestLinkList.addFirst(2);
		//addLast
		TestLinkList.addLast(10);
		//get
		System.out.println(TestLinkList.get(3));
		//getFirst
		System.out.println(TestLinkList.getFirst());
		//getLast;
		System.out.println(TestLinkList.getLast());
		
		//Indexof
		int tlposition = TestLinkList.indexOf(6);
		System.out.println("第一个数字是7的index = " + lposition);
		//lastIndexOf
		int ttllposition = TestLinkList.lastIndexOf(6);
		System.out.println("最后一个数字是6的index" + llposition);
		
		//offer
		TestLinkList.offer(13);
		System.out.println(TestLinkList.get(10));
		
		//offerFirst
		TestLinkList.offerFirst(1);
		System.out.println(TestLinkList.get(0));
		
		//offerLast
		TestLinkList.offerLast(14);
		System.out.println(TestLinkList.getLast());
		
		//peek
		System.out.println(TestLinkList.peek());
		//peekFirst
		System.out.println(TestLinkList.peekFirst());
		//peekLast
		System.out.println(TestLinkList.peekLast());
		
		//poll
		System.out.println(TestLinkList.poll());
		//pollFirst
		System.out.println(TestLinkList.pollFirst());
		//pollLast;
		System.out.println(TestLinkList.pollLast());
		//pop
		System.out.println(TestLinkList.pop());
		//push
		TestLinkList.push(17);
		System.out.println(TestLinkList.getFirst());
		
		for(Object i : TestLinkList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
		System.out.println();
		//remove
		TestLinkList.remove(0);
		for(Object i : TestLinkList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}		
		
		//removeFirst
		TestLinkList.removeFirst();
		System.out.println(TestLinkList.getFirst());
		
		//removeFirstOccurence
		TestLinkList.removeFirstOccurrence(6);
		for(Object i : TestLinkList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
		
		//removeLast
		TestLinkList.removeLast();
		System.out.println(TestLinkList.getLast());
		
		//removeLastOccurence
		TestLinkList.removeLastOccurrence(6);
		for(Object i : TestLinkList.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
		//clear
		TestLinkList.clear();
		for(Object i : TestLinkList.toArray()) {
			System.out.print("遍历数组里的所有元素 = " + i);
				}

		
		
	}

}
