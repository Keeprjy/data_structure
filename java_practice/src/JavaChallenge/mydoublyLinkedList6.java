package JavaChallenge;
/*
 * 1.遍历与单链表相同，只是可以从前往后查，也可以从后往前查
 * 2.添加，默认添加到双向链表的最后
 * 		2.1先找到双向链表的最后节点
 * 		2.2temp.next = newNode
 * 		2.3newHeroNode.pre = temp;
 * 3.修改思路和单链表相同
 * 4.删除
 * 		4.1可以直接找到需要删除的节点
 * 		4.2直接找到要删除的节点temp
 * 		4.3temp.pre.next = temp.next
 * 		4.4temp.next.pre = temp.prev
 */

import JavaChallenge.myCircularLinkedList4.Node;

public class mydoublyLinkedList6 {
	//定义Node

	public class Node {
		public int value;
		public Node next;
		public Node pre;
		
		//构造器
		public Node(int i, Node prev, Node nt){
			value = i;
			next = nt;
			pre = prev;
		}
		
		public Node(int i){
			this(i,null,null);
		}
		public Node(){
			this(0,null,null);
		}
		//更改元素数值
		public void setData(int i){
			value = i;
		}
		//读取元素数值
		public int getValue(){
			return value;
		}
		//更改元素的指向
		public void setNext(Node nt){
			next = nt;
		}
		//读取元素的指向
		public Node getNext(){
			return next;
		}
	}
	//初始化字节头，头结点不用动，不存放数据
	public Node head;
	//返回头结点
	public Node getHead() {
		return head;
	}
	//构造器
	public mydoublyLinkedList6() {
		Node dummy = new Node(-1);
		dummy.next = dummy;
		dummy.pre = dummy;
		head = dummy;
	}
	
	//size()
	public int size() {
		int length = 0;
		Node temp = head.next;
		while(temp != head) {
			length++;
			temp = temp.next;
		}
		return length;
	}
	
	//isEmpty()
	public boolean isEmpty() {
		if(head == head.pre) {
			return true;
		}else {
			return false;
		}
	}
	
	//print
	public void ASCprint() {
		Node temp = head.next;
		int i = 0;
		while(temp != head) {
			System.out.println("index = " + i + "  temp.value = " + temp.value);
			i++;
			temp = temp.next;
		}
	}
	//print
	public void print() {
		Node temp = head.pre;
		int i = size() - 1;
		while(temp != head && i >= 0) {
			System.out.println("index = " + i + "  temp.value = " + temp.value);
			i--;
			temp = temp.pre;
		}
	}
	
	//add
	public void add(int value) {
		Node tl = new Node();
		tl.value = value;
		if(head == head.pre) {
			head.next = tl;
			tl.pre = head;
			tl.next = head;
			head.pre = tl;
		} else {
			Node temp = head.next;
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = tl;
			tl.pre = temp;
			head.pre = tl;
			tl.next = head;	
		}
	}
	
	//addFirst
	public void addFirst(int value) {
		Node hd = new Node();
		hd.value = value;
		if(head == head.pre) {
			head.next = hd;
			hd.next = head;
			hd.pre = head;
			head.pre = hd;
		} else {
			hd.next = head.next;
			head.next.pre = hd;
			head.next = hd;
			hd.pre = head;
		}
	}
		
	//addLast
	public void addLast(int value) {
		Node tl = new Node();
		tl.value = value;
		Node temp = head.next;
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = tl;
		tl.pre = temp;
		tl.next = head;	
		head.pre = tl;
	}
	
	//add follow index
	public void add(int index, int value) {
		if(index < 0) {
			return;
		}
		Node mid = new Node();
		mid.value = value;
		Node current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
	 		if(current == head) {
	 			return;
	 		}
		}
		mid.next = current.next;
		current.next.pre = mid;
		current.next = mid;
		mid.pre = current;
	}

	
	//clear
	public void clear() {
		head.pre = head;
		head.next = head;
		System.out.println(head.value);
	}
	
	//get
	public int get(int index) {
		if(index < 0) {
			return 0;
		}
		Node current = head;
		if(head == head.pre) {
			return 0;
		} else {
			for(int i = 0; i <= index; i++) {
				current = current.next;
		 		if(current == head) {
		 			return 0;
		 		}
			}
			return current.value;
		}
	}
	
	//getFirst 
	public int getFirst() {
	   if (head == head.pre) {
		   return 0;
	   }else {
		   return head.next.value;
	   }
	}
	
	//getLast
	public int getLast() {
		if(head == head.pre) {
			return 0;
		} else {
			return head.pre.value;
		}
	}
	
	//indexOf
	public int indexOf(int o) {
		int index = 0;
		Node n = head.next;
		while(n != head) {
			if(o == n.value) {
				return index;
			}
			index++;
			n = n.next;
		}
		return -1;
	}
	
	
	//lastIndexOf
	public int lastIndexOf(int o) {
		int index = size()-1;
		Node n = head.pre;
		System.out.println("尾结点的值" + head.pre.value);
		while(n != head) {
			if(o == n.value) {
				return index;
			}
			index--;
			n = n.pre;
		}
		return -1;
	}
 	
	//offer
	public boolean offer(int value) {
		Node tl = new Node();
		tl.value = value;
		if(head == head.pre) {
			head.next = tl;
			tl.pre = head;
			tl.next = head;
			head.pre = tl;
		} else {
			Node temp = head.next;
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = tl;
			tl.pre = temp;
			tl.next = head;	
			head.pre = tl;
		}
		return true;
	}
	
	
	//offerFirst
	public boolean offerFirst(int value) {
		Node hd = new Node();
		hd.value = value;
		if(head == head.pre) {
			head.next = hd;
			hd.next = head;
			hd.pre = head;
			head.pre = hd;
		} else {
			hd.next = head.next;
			head.next.pre = hd;
			head.next = hd;
			hd.pre = head;
		}
        return true;
    }
	
	
	//offerLast
	public boolean offerLast(int value) {
		Node tl = new Node();
		tl.value = value;
		Node temp = head.next;
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = tl;
		tl.pre = temp;
		tl.next = head;	
		head.pre = tl;
        return true;
    }
	
	//peek
	public int peek() {
		if(head == head.pre) {
			return 0;
		}
		Node h = head.next;
		return h.value;
	}
	
	//peekFirst
	public int peekFirst() {
		if(head == head.pre) {
			return 0;
		}
		Node h = head.next;
		return h.value;
	}
	
	//peekLast
	public int peekLast() {
		if(head == head.pre) {
			return 0;
		}
		Node l = head.next;
		while(l.next != head) {
			l = l.next;
		}
		return l.value;
	}
	
	//poll
	public int poll() {
	 	if(head == head.pre) {
			return 0;
		} else if(head != head.next && head.next == head.pre) {
			int c = head.next.value;
			head.next = head;
			head.pre = head;
			return c; 
		} else {
			 int i = head.next.value;
			 head.next = head.next.next;
			 head.next.pre = head;
			 return i;		 
		}
	}
	
	//pollFirst
	 public int pollFirst() {
	 	if(head == head.pre) {
			return 0;
		} else if(head != head.next && head.next == head.pre) {
			int c = head.next.value;
			head.next = head;
			head.pre = head;
			return c; 
		} else {
			 int i = head.next.value;
			 head.next = head.next.next;
			 head.next.pre = head;
			 return i;	 
		}
	}
	
	//pollLast
	 public int pollLast() {
		if(head == head.pre) {
			return 0;
		} else if(head != head.next && head.next == head.pre) {
			int c = head.next.value;
			head.next = head;
			head.pre = head;
			return c; 
		} else {
			Node n = head;
			int c = head.pre.value;
			while(n.next != head) {
				n = n.next;
			}
			n.pre.next = head;
			head.pre = n.pre;
			return c;
		} 
	 }
	//pop
	 public int pop() {
	 	if(head == head.pre) {
			return 0;
		} else if(head != head.next && head.next == head.pre) {
			int c = head.next.value;
			head.next = head;
			head.pre = head;
			return c; 
		} else {
			 int i = head.next.value;
			 head.next = head.next.next;
			 head.next.pre = head;
			 return i;	 
		}
	 }
	
	//push
	 public void push(int value) {
		Node hd = new Node();
		hd.value = value;
		if(head == head.pre) {
			head.next = hd;
			hd.next = head;
			hd.pre = head;
			head.pre = hd;
		} else {
			hd.next = head.next;
			head.next.pre = hd;
			head.next = hd;
			hd.pre = head;
		}
	 }
	
	 //remove
	 public void remove() {
	 	if(head == head.pre) {
			return;
		} else if(head != head.next && head.next == head.pre) {
			head.next = head;
			head.pre = head;
			return; 
		} else {
			 Node current = head;
			 head.next = current.next.next;
			 current.next.next.pre = head.next;
			 return;		 
		}
	 }
	 
	 //remove by index
	 public int remove(int index) {
		 if(head == head.pre) {
			 System.out.println("这是个空表");
			 return 0;
		 } else if(head != head.next && head.next == head.pre) {
			 if(index == 0) {
				 int c = head.next.value;
				 head.next = head;
				 head.pre = head;
				 return c;
			 } else {
				 return 0;
			 }
		 } else{
			 Node current = head;
			 int i = 0;
			 while(i < index) {
				 current = current.next;
				 i++;
				 if(current.next == head) {
					 return 0;
				 }
			 }
			 if(current.next == head.pre) {
				 int b = head.pre.value;
				 current.next = head;
				 head.pre = current;
				 return b;
			 }else {
				 int c = current.next.value;
				 current.next = current.next.next;
				 current.next.next.pre = current;
				 return c;
			 }
		 }
	 }
	 
	 
	 
	 
 	
	 //removeFirst
	 public int removeFirst() {
		 	if(head == head.pre) {
				return 0;
			} else if(head != head.next && head.next == head.pre) {
				int c = head.next.value;
				head.next = head;
				head.pre = head;
				return c; 
			} else {
				 Node current = head;
				 int i = current.next.value;
				 head.next = current.next.next;
				 current.next.next.pre = head.next;
				 return i;		 
			}
	 }
	 
	 //removeLast
		public int removeLast() {
			if(head == head.pre) {
				return 0;
			} else if(head != head.next && head.next == head.pre) {
				int c = head.next.value;
				head.next = head;
				head.pre = head;
				return c; 
			} else {
				Node n = head;
				int c = head.pre.value;
				while(n.next != head) {
					n = n.next;
				}
				n.pre.next = head;
				head.pre = n.pre;
				return c;
			} 
		}
		
		 //removeFirstOccurence
		 public boolean removeFirstOccurence(int value) {
			 if(head == head.pre) {
				 return false;
			 } else {
				 Node prev = head;
				 Node current = prev.next;
				 while(current != head && current.value != value) {
					 current = current.next;
					 prev = prev.next;
				 }
				 if(current == head) {
					return false;
				 } 
				 else if(current.next == head) {
					 prev.next = prev.next.next;
					 prev.next.pre = prev;
					 System.out.println(head.pre.value);
					 return true;
				 } 
				 else {
					 prev.next = current.next;
					 current.next.pre = prev;
					 System.out.println(head.pre.value);
					 return true;
				 }
			 }
		 }
		 
		//removeLastOccurence
		public boolean removeLastOccurrence(int value) {
			if(head == head.pre) {
				return false;
			} 
			Node saveprev = null;
			Node prev = head;
			Node current = prev.next;
			while(current != head) {
				if(current.value == value) {
					saveprev = prev;
				}
				current = current.next;
				prev = prev.next;
			}
//			System.out.println("saveprev.value " + saveprev.value);
			if(saveprev == null) {
				return false;
			}else if(saveprev.next == head.pre) {
				 saveprev.next = saveprev.next.next;
				 saveprev.next.pre = saveprev;
				 System.out.println(head.pre.value);
				 return true;
			 } else {
				saveprev.next = saveprev.next.next;
				saveprev.next.pre = saveprev;
				return true;
			 }
		}
		
		//toArray
		 public int[] toArray() {
			 int[] result = new int[size()];
			 int i = 0;
			 Node n = head.next;
			 while(n != head) {
				 result[i] = n.value;
				 i++;
				 n = n.next;
			 }
			 return result;
		 }
			

 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	

 	
 	
 	
	
	
	
//	//遍历双向链表的方法
// 	public void print() {
// 		//判断链表是否为空
// 		if(head.next == null) {
// 			System.out.println("链表为空");
// 			return;
// 		}
// 		//因为投机诶单，不能动，因此我们需要一个辅助变量来遍历
// 		Node temp = head.next;
// 		while(temp != null) {
// 			System.out.println(temp);
// 			temp = temp.next;
// 		}
// 	}
// 	
// 	//add() 添加一个节点到双向链表的最后
// 	public void add(int value){
// 		Node temp = head;
// 		Node tail = new Node(0);
// 		while(temp.next != null) {
// 			temp = temp.next;
// 		}
// 		//当退出循环时，temp指向的是最后
// 		//形成一个双向链表
// 		temp.next = tail;
// 		tail.pre = temp;
// 		tail.value = value;
// 	}
}

















