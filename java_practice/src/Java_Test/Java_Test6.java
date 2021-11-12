package Java_Test;

import JavaChallenge.mydoublyLinkedList6;

public class Java_Test6 {
	public static void main(String[] args) {
		mydoublyLinkedList6 list = new mydoublyLinkedList6();
		list.add(1);
		list.add(2);
		list.add(3);
		list.addFirst(11);
		list.add(4);
		list.addFirst(10);
		list.addLast(6);
		list.add(5);
		list.add(5,77);
		list.add(6,5);
		list.print();
		list.ASCprint();
		System.out.println("链表长度" + list.size());
		System.out.println("index = 3的数是 " + list.get(3));
		System.out.println("index = 0的数是 " + list.get(0));
		System.out.println("index = 8的数是 " + list.get(8));
		System.out.println("indexFirst " + list.getFirst());
		System.out.println("indexLast " + list.getLast());
		System.out.println("indexof5 " + list.indexOf(5));
		System.out.println("lastIndexof3 " + list.lastIndexOf(3));
		
		//offer 添加
		list.offer(9);
		System.out.println("//offer " + list.getLast());
		list.print();
		
		//offerFirst
		list.offerFirst(1);
		System.out.println("//offerFirst " + list.getFirst());
		list.print();
		
		//offerLast/peek 检索，但是不删除
		int peek1 = list.peek();
		System.out.println("peek返回值 = " + peek1);
		System.out.println("//peek " + list.peek());
		//peekFirst
		int peek2 = list.peekFirst();
		System.out.println("peekFirst返回值 = " + peek2);
		System.out.println("//peekFirst " + list.peekFirst());
		//peekLast
		int peek3 = list.peekLast();
		System.out.println("peekLast返回值 = " + peek3);
		System.out.println("//peekLast " + list.peekLast());
		list.print();
		
		//poll 检索并且删除第一个
		int poll1 = list.poll();
		System.out.println("poll返回值" + poll1);
		System.out.println("//poll " + list.getFirst());
		list.print();

		
		//pollFirst
		int poll2 = list.pollFirst();
		System.out.println("pollFirst返回值" + poll2);
		System.out.println("//pollFirst " + list.getFirst());
		list.print();
		//pollLast;
		int poll3 = list.pollLast();
		System.out.println("pollLast返回值" + poll3);
		System.out.println("//pollLast " + list.getLast());
		list.print();
		list.ASCprint();

		
		//pop
		System.out.println();
		int pop = list.pop();
		System.out.println("//pop返回值 " + pop);
		
		//push 放到第一个
		list.push(17);
		System.out.println("// push " + list.getFirst());
		list.print();
		System.out.println();
		
		//remove()
		list.remove();
		System.out.println();
		list.print();
		
		//removeFirst
		int RF = list.removeFirst();
		System.out.println("去掉的第一个数是 " + RF);
		
		//removeLast
		System.out.println("removeLast");
		int c = list.removeLast();
		System.out.println("去掉的最后一个数是 " + c);
		System.out.println(list.head.pre.value);
		list.print();
		
		//remove by index;
		System.out.println("remove by index");
		int d = list.remove(8);
		System.out.println("去掉的第8位是 = " + d);
		list.addFirst(5);
		System.out.println(list.head.pre.value);
		list.print();
		
		//removeFirstOccurence
		boolean rfo = list.removeFirstOccurence(5);
		System.out.println(rfo);
		System.out.println(list.head.pre.value);
		list.print();
		
		
		//removeLastOccurence
		System.out.println();
		list.add(1);
		list.print();
		boolean rlo = list.removeLastOccurrence(11);
		boolean rlo1 = list.removeLastOccurrence(11);
		System.out.println(rlo);
		System.out.println(rlo1);
		System.out.println(list.head.pre.value);
		list.print();


		//toArray
		for(Integer i : list.toArray()) {
		System.out.println("遍历数组里的所有元素 = " + i);
		}
//		list.clear();
//		list.offerLast(14);
//		System.out.println("//offerLast " + list.getLast());
//		list.print();
		
	
	}
}
