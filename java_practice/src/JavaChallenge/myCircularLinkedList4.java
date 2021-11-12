package JavaChallenge;


public class myCircularLinkedList4 {

	public class Node {
		//元素类型为int的节点
		public int value;
		private Node next;
		//定义构造器
		public Node(int i, Node nt){
			value = i;
			next = nt;
		}
		public Node(int i){
			this(i,null);
		}
		public Node(){
			this(0,null);
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
	
	private Node head;
	public Node tail;
	//构造器
	public myCircularLinkedList4() {
		Node dummy = new Node(-1);
		dummy.next = dummy;
		head = dummy;
		tail = dummy;
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
	
	//isEmpty
	public boolean isEmpty() {
	return head == tail;
}

	//addFirst
	public void addFirst(int value) {
		Node hd = new Node();
		hd.value = value;
		if(head == tail) {
			hd.next = head;
			tail = hd;
			head.next = hd;
		} else {
			hd.next = head.next;
			head.next = hd;
		}
	}

	
	
	//print
	public void print() {
		Node temp = head.next;
		int i = 0;
		while(temp != head) {
			System.out.println("index = " + i + "  temp.value = " + temp.value);
			i++;
			temp = temp.next;
		}
	}
	
	
	//add
	public void add(int value) {
		Node tl = new Node();
		tl.value = value;
		if(head == tail) {
			head.next = tl;
			tail = tl;
			tl.next = head;
		}else {
			tail.setNext(tl);
			tl.setNext(head);
			tail = tl;
		}
	}
	
	//add follow index
	
	public void add(int index, int value) {
		int length = size();
		if(index < 0 || index > length) {
			return;
		}
		Node mid = new Node();
		mid.value = value;
		if(index == length) {
			tail.next = mid;
			mid.next = head;
			tail = mid;
			return;
		} else {
			Node current = head;
			for(int i = 0; i < index; i++) {
				current = current.next;
			}
			mid.next = current.next;
			current.next = mid;
		}
	}
	
	
	//addLast
	public void addlast(int value) {
		Node tl = new Node();
		tl.value = value;
		tail.setNext(tl);
		tl.setNext(head);
		tail = tl;
	}

	//clear
	public void clear() {
		head = tail =null;
	}
	
	//get
	public int get(int index) {
		int length = size();
		if(index < 0 && index > length -1) {
			return 0;
		}
		Node current = head;
		if(length == 0) {
			return 0;
		} else {
			for(int i = 0; i <= index; i++) {
				current = current.next;
			}
			return current.value;
		}
	}
	
	//getFirst 
	public int getFirst() {
	   if (head == tail) {
		   return 0;
	   }else {
		   return head.next.value;
	   }
	}
	
	//getLast
	public int getLast() {
		if(head == tail) {
			return 0;
		} else {
			return tail.value;
		}
	}
	
	
	//indexOf
	public int indexOf(int o) {
		int index = 0;
		Node n = head.next;
		while(n != tail.next) {
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
		int index = 0;
		int max = -1;
		Node n = head.next;
		while(n != tail.next) {
			if(o == n.value) {
				max = index;
			}
			index++;
			n = n.next;
		}
		return max;
	}
	
	
	//offer
	public boolean offer(int value) {
		Node tl = new Node();
		tl.value = value;
		if(head == tail) {
			head.next = tl;
			tail = tl;
			tl.next = head;
		}else {
			tail.setNext(tl);
			tl.setNext(head);
			tail = tl;
		}
		return true;
	}
	
	
	//offerFirst
	public boolean offerFirst(int value) {
		Node hd = new Node();
		hd.value = value;
		if(head == tail) {
			hd.next = head;
			tail = hd;
			head.next = hd;
		} else {
			hd.next = head.next;
			head.next = hd;
		}
        return true;
    }
	
	
	//offerLast
	public boolean offerLast(int value) {
		Node tl = new Node();
		tl.value = value;
		tail.setNext(tl);
		tl.setNext(head);
		tail = tl;
        return true;
    }
	

	//peek
	public int peek() {
		if(head == tail) {
			return 0;
		}
		Node h = head.next;
		return h.value;
	}
	
	//peekFirst
	public int peekFirst() {
		if(head == tail) {
			return 0;
		}
		Node h = head.next;
		return h.value;
	}
	
	//peekLast
	public int peekLast() {
		if(head == tail) {
			return 0;
		}
		Node l = tail;
		return l.value;
	}
		
	//poll
	public int poll() {
		if(head == tail) {
			return 0;
		} else if(head.next == tail) {
			int c = tail.value;
			head.next = head;
			tail = head;
			return c; 
		} else {
			 Node current = head;
			 int i = current.next.value;
			 head.next = current.next.next;
			 return i;		 
		}
	}
	
	//pollFirst
	 public int pollFirst() {
	 	if(head == tail) {
			return 0;
		} else if(head.next == tail) {
			int c = tail.value;
			head.next = head;
			tail = head;
			return c; 
		} else {
			 Node current = head;
			 int i = current.next.value;
			 head.next = current.next.next;
			 return i;		 
		}
	}
	
	//pollLast
	 public int pollLast() {
		if(head == tail) {
			return 0;
		} else if(head.next == tail) {
			int c = tail.value;
			head.next = head;
			tail = head;
			return c; 
		} else {
			Node n = head;
			int c = tail.value;
			while(n.next != tail) {
				n = n.next;
			}
			n.next = head;
			tail = n;
			return c;
		} 
	 }
	//pop
	 public int pop() {
	 	if(head == tail) {
			return 0;
		} else if(head.next == tail) {
			int c = tail.value;
			head.next = head;
			tail = head;
			return c; 
		} else {
			 Node current = head;
			 int i = current.next.value;
			 head.next = current.next.next;
			 return i;		 
		}
	 }
	
	//push
	 public void push(int value) {
		Node hd = new Node();
		hd.value = value;
		if(head == tail) {
			hd.next = head;
			tail = hd;
			head.next = hd;
		} else {
			hd.next = head.next;
			head.next = hd;
		}
	 }
	
	
	 //removeFirst
//	public int removeFirst() {
//		int length = size();
//		if(length > 1) {
//			 Node current = head;
//			 int i = current.next.value;
//			 head.next = current.next.next;
//			 return i;
//		} else if(length == 1) {
//			head = tail = null;
//			length--;
//			return 0;
//		} else {
//			System.out.println("这是个空表");
//			return 0;
//		}
//	}
	 public int removeFirst() {
		 	if(head == tail) {
				return 0;
			} else if(head.next == tail) {
				int c = tail.value;
				head.next = head;
				tail = head;
				return c; 
			} else {
				 Node current = head;
				 int i = current.next.value;
				 head.next = current.next.next;
				 return i;		 
			}
	 }
	 
	 //remove
	 public void remove() {
	 	if(head == tail) {
			return;
		} else if(head.next == tail) {
			head.next = head;
			tail = head;
			return; 
		} else {
			 Node current = head;
			 head.next = current.next.next;
			 return;		 
		}
	 }
	 
	 //remove
//	 public int remove(int index) {
//		 int length = size();
//		 if(length == 0) {
//			 System.out.println("这是个空表");
//			 return 0;
//		 } else if(length == 1) {
//			head = tail = null;
//			return 0;
//		 } else if(index == length - 1) {
//			 Node n = new Node();
//			 n = head;
//			 int c = tail.value;
//			 while(n.next != tail) {
//				 n = n.next;
//			 }
//			 n.next = head;
//			 tail = n;
//			 return c;
//		 } else{
//			 Node current = head;
//			 for(int i = 0; i < index; i++) {
//				 current = current.next;
//			 }
//			 int c = current.next.value;
//			 current.next = current.next.next;
//			 return c;
//		 }
//	 }
	 public int remove(int index) {
		 if(head == tail) {
			 System.out.println("这是个空表");
			 return 0;
		 } else if(head.next == tail) {
			 if(index == 0) {
				 int c = tail.value;
				 head.next = head;
				 tail = head;
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
			 if(current.next == tail) {
				 int b = tail.value;
				 current.next = head;
				 tail = current;
				 return b;
			 } else {
				 int c = current.next.value;
				 current.next = current.next.next;
				 return c;
			 }
		 }
	 }
	 
	 
	 //removeFirstOccurence
	 public boolean removeFirstOccurence(int value) {
		 if(head == tail) {
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
			 } else if(current.next == head) {
				 prev.next = prev.next.next;
				 tail = prev;
				 System.out.println(tail.value);
				 return true;
			 } else {
				 prev.next = current.next;
				 System.out.println(tail.value);
				 return true;
			 }
		 }
	 }
	 
	//removeLast
	
//	public int removeLast() {
//		int length = size();
//		if(length > 1) {
//			Node n = new Node();
//			n = head;
//			int c = tail.value;
//			while(n.next != tail) {
//				n = n.next;
//			}
//			n.next = head;
//			tail = n;
//			return c;
//		} else if(length == 1) {
//			head = tail = null;
//			return 0;
//		}else {
//			System.out.println("空链表");
//			return 0;
//		}
//	}
	public int removeLast() {
		if(head == tail) {
			return 0;
		} else if(head.next == tail) {
			int c = tail.value;
			head.next = head;
			tail = head;
			return c; 
		} else {
			Node n = head;
			int c = tail.value;
			while(n.next != tail) {
				n = n.next;
			}
			n.next = head;
			tail = n;
			return c;
		} 
	}
	//removeLastOccurence
	public boolean removeLastOccurrence(int value) {
		if(head == tail) {
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
		System.out.println("saveprev.value " + saveprev.value);
		if(saveprev == null) {
			return false;
		}else if(saveprev.next == tail) {
			 saveprev.next = saveprev.next.next;
			 tail = saveprev;
			 System.out.println(tail.value);
			 return true;
		 } else {
			saveprev.next = saveprev.next.next;
			System.out.println(tail.value);
			return true;
		 }
	}
	
	
	//toArray
	 public int[] toArray() {
		 int[] result = new int[size()];
		 int i = 0;
		 Node n = head.next;
		 while(n != tail.next) {
			 result[i] = n.value;
			 i++;
			 n = n.next;
		 }
		 return result;
	 }

	
}















