package Java_Test;

import JavaChallenge.myCircularLinkedList4;

public class Java_Test4 {
	public static void main(String[] args) {
		myCircularLinkedList4 list = new myCircularLinkedList4();
		list.add(1);
		list.add(2);
		list.add(3);
		list.addlast(11);
		list.add(4);
		list.add(5);
		list.addFirst(5);
		list.addFirst(6);
		list.addFirst(8);
		list.add(0,7);
		System.out.println("链表长度" + list.size());
		list.print();
		System.out.println("index = 3的数是 " + list.get(3));
		System.out.println("index = 0的数是 " + list.get(0));
		System.out.println("index = 9的数是 " + list.get(9));
		System.out.println("indexFirst " + list.getFirst());
		System.out.println("indexLast " + list.getLast());
		System.out.println("indexof5 " + list.indexOf(5));
		System.out.println("lastIndexof5 " + list.lastIndexOf(5));
		
		//offer 添加
		list.offer(9);
		System.out.println("//offer " + list.getLast());
		list.print();
		
		//offerFirst
		list.offerFirst(1);
		System.out.println("//offerFirst " + list.getFirst());
		list.print();
		
		//offerLast
		list.offerLast(14);
		System.out.println("//offerLast " + list.getLast());
		list.print();
		
		//peek 检索，但是不删除
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
		//pollLast;
		int poll3 = list.pollLast();
		System.out.println("pollLast返回值" + poll3);
		System.out.println("//pollLast " + list.getLast());
		list.print();
		
		//pop
		System.out.println();
		int pop = list.pop();
		System.out.println("//pop返回值 " + pop);
		//push 放到第一个
		list.push(17);
		System.out.println("// push " + list.getFirst());
		list.print();
		System.out.println();

		//removeFirst
		int RF = list.removeFirst();
		System.out.println("去掉的第一个数是 " + RF);
		//remove()
		list.remove();
		list.print();
		//remove by index;
		System.out.println("remove by index");
		int d = list.remove(0);
		System.out.println("去掉的第0位是 = " + d);
		list.print();
		//removeLast
		System.out.println("removeLast");
		int c = list.removeLast();
		System.out.println("去掉的最后一个数是 " + c);
		list.print();
		System.out.println("********************************************************");
		
		//removeFirstOccurence
		boolean rfo = list.removeFirstOccurence(13);
		System.out.println(rfo);
		list.print();
		//removeLastOccurence
		System.out.println();
		list.add(1);
		list.print();
		boolean rlo = list.removeLastOccurrence(1);
		boolean rlo1 = list.removeLastOccurrence(1);
		System.out.println(rlo);
		System.out.println(rlo1);
		list.print();
		
		//toArray
		for(Integer i : list.toArray()) {
		System.out.println("遍历数组里的所有元素 = " + i);
		}
	}
}

