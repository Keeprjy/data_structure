package Java_Test;

import JavaChallenge.myLinkedList3;

public class Java_Test3 {

	public static void main(String[] args) {
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
		linkList.add(7,11);
		//addFirst
		linkList.addFirst(2);
		//addLast
		linkList.addLast(10);
		//get
		System.out.println("链表index3 = " + linkList.get(3));
		//getFirst
		System.out.println("链表的第一个数字 = " + linkList.getFirst());
		//getLast;
		System.out.println("链表的最后一个数字 = " + linkList.getLast());
		
		
		//遍历链表
//		
//		for(Integer i : linkList.toArray()) {
//			System.out.println("遍历数组里的所有元素 = " + i);
//		}
		linkList.printList();
		
		
		//Indexof
		int lposition = linkList.indexOf(7);
		System.out.println("第一个数字是7的index = " + lposition);
		//lastIndexOf
		int llposition = linkList.lastIndexOf(6);
		System.out.println("最后一个数字是6的index = " + llposition);
		
		//offer 添加
		linkList.offer(9);
		System.out.println("//offer " + linkList.getLast());
		
		//offerFirst
		linkList.offerFirst(1);
		System.out.println("//offerFirst " + linkList.getFirst());
		
		//offerLast
		linkList.offerLast(14);
		System.out.println("//offerLast " + linkList.getLast());

		for(int i = 0; i < linkList.length(); i++) {
			System.out.println("Index = " + i  + " value = " + linkList.get(i));
		}
		
		//peek 检索，但是不删除
		int peek1 = linkList.peek();
		System.out.println("peek返回值 = " + peek1);
		System.out.println("//peek " + linkList.peek());
		//peekFirst
		int peek2 = linkList.peekFirst();
		System.out.println("peekFirst返回值 = " + peek2);
		System.out.println("//peekFirst " + linkList.peekFirst());
		//peekLast
		int peek3 = linkList.peekLast();
		System.out.println("peekLast返回值 = " + peek3);
		System.out.println("//peekLast " + linkList.peekLast());
		
		for(int i = 0; i < linkList.length(); i++) {
			System.out.println("Index = " + i  + " value = " + linkList.get(i));
		}
		System.out.println();
		
		//poll 检索并且删除第一个
		int poll1 = linkList.poll();
		System.out.println("poll返回值" + poll1);
		System.out.println("//poll " + linkList.getFirst());

		
		//pollFirst
		int poll2 = linkList.pollFirst();
		System.out.println("pollFirst返回值" + poll2);
		System.out.println("//pollFirst " + linkList.getFirst());
		//pollLast;
		int poll3 = linkList.pollLast();
		System.out.println("pollLast返回值" + poll3);
		System.out.println("//pollLast " + linkList.getLast());
		
		for(int i = 0; i < linkList.length(); i++) {
			System.out.println("Index = " + i  + " value = " + linkList.get(i));
		}
		
		//pop
		System.out.println();
		int pop = linkList.pop();
		System.out.println("//pop返回值 " + pop);
		//push 放到第一个
		linkList.push(17);
		System.out.println("// push " + linkList.getFirst());
		
		for(int i = 0; i < linkList.length(); i++) {
			System.out.println("Index = " + i  + " value = " + linkList.get(i));
		}
		System.out.println();
		
		//remove
		linkList.remove();
		linkList.remove(3);
		for(int i = 0; i < linkList.length(); i++) {
			System.out.println("Index = " + i  + " value = " + linkList.get(i));
		}		
		
		//removeFirst
		int RF = linkList.removeFirst();
		System.out.println("去掉的第一个数是 " + RF);
		linkList.add(2,9);
		for(int i = 0; i < linkList.length(); i++) {
			System.out.println("Index = " + i  + " value = " + linkList.get(i));
		}
		System.out.println();
		

		
		//removeFirstOccurence
		boolean rfo = linkList.removeFirstOccurrence(1);
		System.out.println(rfo);
		for(int i = 0; i < linkList.length(); i++) {
			System.out.println("Index = " + i  + " value = " + linkList.get(i));
		}

		
		//removeLast
		int rl = linkList.removeLast();
		System.out.println("去掉的最后一个数是 " + rl);
		linkList.add(3,7);
		for(int i = 0; i < linkList.length(); i++) {
			System.out.println("Index = " + i  + " value = " + linkList.get(i));
		}
		System.out.println();

		
		//removeLastOccurence
		boolean rlo = linkList.removeLastOccurrence(6);
		System.out.println(rlo);
		for(int i = 0; i < linkList.length(); i++) {
			System.out.println("Index = " + i  + " value = " + linkList.get(i));
		}


		//clear
		linkList.clear();
		for(Object i : linkList.toArray()) {
			System.out.print("遍历数组里的所有元素 = " + i);
		}

//		LinkedList<Integer> TestLinkList = new LinkedList<Integer>();
//		TestLinkList.peek();
//		//System.out.println("peek返回值 = " + testpeek1);
//		//System.out.println("//peek " + TestLinkList.peek());
//		//add
//		TestLinkList.add(3);
//		TestLinkList.add(4);
//		TestLinkList.add(5);
//		TestLinkList.add(6);
//		TestLinkList.add(7);
//		TestLinkList.add(6);
//		TestLinkList.add(6);
//		//add2
//		TestLinkList.add(7,11);
//		//addFirst
//		TestLinkList.addFirst(2);
//		//addLast
//		TestLinkList.addLast(10);
//		//get
//		System.out.println(TestLinkList.get(3));
//		//getFirst
//		System.out.println(TestLinkList.getFirst());
//		//getLast;
//		System.out.println(TestLinkList.getLast());
//		
//		//Indexof
//		int tlposition = TestLinkList.indexOf(6);
//		System.out.println("第一个数字是7的index = " + lposition);
//		//lastIndexOf
//		int ttllposition = TestLinkList.lastIndexOf(6);
//		System.out.println("最后一个数字是6的index" + llposition);
//		
//		//offer
//		TestLinkList.offer(13);
//		System.out.println(TestLinkList.get(10));
//		
//		//offerFirst
//		TestLinkList.offerFirst(1);
//		System.out.println(TestLinkList.get(0));
//		
//		//offerLast
//		TestLinkList.offerLast(14);
//		System.out.println(TestLinkList.getLast());
//		
		//peek
//		int testpeek1 = TestLinkList.peek();
//		System.out.println("peek返回值 = " + testpeek1);
//		System.out.println("//peek " + TestLinkList.peek());
//		System.out.println(TestLinkList.peek());
//		//peekFirst
//		System.out.println(TestLinkList.peekFirst());
//		//peekLast
//		System.out.println(TestLinkList.peekLast());
//		
//		//poll
//		System.out.println(TestLinkList.poll());
//		//pollFirst
//		System.out.println(TestLinkList.pollFirst());
//		//pollLast;
//		System.out.println(TestLinkList.pollLast());
		//pop
//		int t = TestLinkList.pop();
//		System.out.println(t);
//		//push
//		TestLinkList.push(17);
//		System.out.println(TestLinkList.getFirst());
//		
//		for(Object i : TestLinkList.toArray()) {
//			System.out.println("遍历数组里的所有元素 = " + i);
//		}
//		System.out.println();
//		//remove
//		TestLinkList.remove(0);
//		for(Object i : TestLinkList.toArray()) {
//			System.out.println("遍历数组里的所有元素 = " + i);
//		}		
//		
//		//removeFirst
//		TestLinkList.removeFirst();
//		System.out.println(TestLinkList.getFirst());
//		
//		//removeFirstOccurence
//		TestLinkList.removeFirstOccurrence(6);
//		for(Object i : TestLinkList.toArray()) {
//			System.out.println("遍历数组里的所有元素 = " + i);
//		}

//		for(int i = 0; i < TestLinkList.size(); i++) {
//			System.out.println("Index = " + i  + " value = " + TestLinkList.get(i));
//		}
//		//removeFirst
//		int tRF = TestLinkList.removeFirst();
//		System.out.println("去掉的第一个数是 " + tRF);
//		
//		//removeFirstOccurence
//		boolean trfo = TestLinkList.removeFirstOccurrence(6);
//		System.out.println(rfo);
//		for(int i = 0; i < TestLinkList.size(); i++) {
//			System.out.println("Index = " + i  + " value = " + TestLinkList.get(i));
//		}
//		
//		//removeLast
//		TestLinkList.removeLast();
//		System.out.println(TestLinkList.getLast());
//		
//		//removeLastOccurence
//		TestLinkList.removeLastOccurrence(6);
//		for(Object i : TestLinkList.toArray()) {
//			System.out.println("遍历数组里的所有元素 = " + i);
//		}
//		//clear
//		TestLinkList.clear();
//		for(Object i : TestLinkList.toArray()) {
//			System.out.print("遍历数组里的所有元素 = " + i);
//				}

	}

}
