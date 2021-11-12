package JavaChallenge;


public class myLinkedList3 {	
	public class Node{
		int value;
		Node next;
		public Node() {
			value = 0;
			next = null;
		}
		Node(int value){
			this.value = value;
			this.next = null;
		}
		
	}
	
	private Node head;//头结点
	private int length;//链表长度
	
	public myLinkedList3() {
		head = null;
		length = 0;
	}
	
	//length()
    public int length() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
	
	//add
    public void add(int o) 
    {
    	Node n = new Node(o);
    	if(head == null) 
    	{
    		head = n;
    	} else 
    	{
    		Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = n;
		}
	    length++;   	
    }
	
	//addLast
	public void addLast(int value)
	{
    	Node n = new Node();
    	if(head == null) 
    	{
    		n.value = value;
    		head = n;
    	} else 
    	{
    		n.value = value;
    		Node temp = head;
    		while(temp.next != null) 
    		{
    			temp = temp.next;
    		}
    		temp.next = n;
    	}
    	length++;
	}
	
	
	//addFirst
	public void addFirst(int value) {
		Node n = new Node();
		n.value = value;
		n.next = head;
		head = n;
		length++;
	}
		
	//add in index
	public void add(int index, int value) {
		Node current = head;
		Node n = new Node();
		n.value = value;
		if(index <0 || index > length) {
			return;
		}else if(index == 0){
			n.next = head;
			head = n;
			length++;
		}else {
			for(int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			n.next = current.next;
			current.next = n;
			length++;
		}
	}
//    public void add(int index, int value) {
//
//
//        //首先需要判断指定位置是否合法，
//        if (index < 0 || index > length() + 1) {
//            System.out.println("插入位置不合法。");
//            return;
//        }
//
//        //临时节点，从头节点开始
//        Node temp = head;
//
//        //记录遍历的当前位置
//        int currentPos = 0;
//
//        //初始化要插入的节点
//        Node insertNode = new Node();
//        insertNode.value = value;
//        while (temp.next != null) {
//
//            //找到上一个节点的位置了
//            if ((index - 1) == currentPos) {
//
//                //temp表示的是上一个节点
//
//                //将原本由上一个节点的指向交由插入的节点来指向
//                insertNode.next = temp.next;
//
//                //将上一个节点的指针域指向要插入的节点
//                temp.next = insertNode;
//
//                return;
//
//            }
//
//            currentPos++;
//            temp = temp.next;
//        }
//
//    }
	
	//clear
	public void clear() {
		head = null;
		length = 0;
	}
	
	
	//检查索引是否合法
	private void RangeCheck(int index) {//检查索引是否合法
		if(index < 0 || index >= length) {
			throw new IndexOutOfBoundsException("IllegalArgument" + index);// 去掉异常的情况
		}
	}
	
	//get
	public int get(int index) {
		RangeCheck(index);
		Node current = head;
		if(index == 0) {
			return head.value;
		} else if(index > 0 && index < length) {
			for(int i = 0; i <= index -1; i++) {
				current = current.next;
			}
			return current.value;
		} else{
		return 0;
		}
	}

	//getFirst
	public int getFirst() {
		   Node h = head;
		   if (h == null) {
			   return 0;
		   }else {
			   return h.value;
		   }
	}
	
	//getLast
	public int getLast() {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.value;
	}
	
	//indexOf
//	public int indexOf(int o) {
//		int index = 0;
//		for (Node n = head; n != null; n = n.next) {
//			if (o == n.value) {
//				return index;
//		    }
//		    index++;
//		}
//		return -1;
//	}
	public int indexOf(int o) {
		int index = 0;
		Node n = head;
		while(n != null) {
			if(o == n.value) {
				return index;
			}
			index++;
			n = n.next;
		}
		return -1;
	}

	//lastIndexOf
//	public int lastIndexOf(int o) {
//		int index = 0;
//		int max = 0;
//		for (Node n = head; n != null; n = n.next) {
//			if (o == n.value) {
//				max = index;
//		    }
//		    index++;
//	    }
//		return max;
//	}
	public int lastIndexOf(int o) {
		int index = 0;
		int max = 0;
		Node n = head;
		while(n != null) {
			if(o == n.value) {
				max = index;
			}
			index++;
			n = n.next;
		}
		return max;
	}
	
	//offer
	public boolean offer(int e) {
		add(e);
		return true;
	}
	
	//offerFirst
	public boolean offerFirst(int e) {
        addFirst(e);
        return true;
    }
	
	//offerLast
	public boolean offerLast(int e) {
        addLast(e);
        return true;
    }
	
	
	//检查索引是否合法
	private void headCheck() {//检查索引是否合法
		if(head == null) {
			throw new IndexOutOfBoundsException("IllegalArgument" + head);// 去掉异常的情况
		}
	}
	//peek
	public int peek() {
		headCheck();
		Node h = head;
		return (h == null) ? 0 : h.value;
	}
	
	//peekFirst
	public int peekFirst() {
		headCheck();
		Node h = head;
		return (h == null) ? 0 : h.value;
	}
	
	//peekLast
	public int peekLast() {
		headCheck();
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		return (temp == null) ? 0 : temp.value;
	}
		
	//poll
	public int poll() {
		int a = getFirst();
		removeFirst();
		return a;
	}
	
	//pollFirst
	 public int pollFirst() {
		 int b = getFirst();
		 removeFirst();
		 return b;
	}
	
	//pollLast
	 public int pollLast() {
		int c = getLast();
		removeLast();
		return c;
	 }
	//pop
	 public int pop() {
		 int f = getFirst();
		 removeFirst();
		 return f;
	 }
	
	//push
	 public void push(int e) {
		 addFirst(e);
	 }
	 
	 //remove
	 public void remove() {
		 removeFirst();
		 return;
	 }
		
	//remove
	public void remove(int index) {
		RangeCheck(index);
		Node current = head;
		if(index == 0) {
			head = current.next;
			length--;
			return;
		} else {
			for(int i = 0; i < index - 1; i++) {
					current = current.next;
			}
			current.next = current.next.next;
			length--;
		}
	}
	 
	 //remove
//	 public void remove(int index) {
//	        Node current = head;	
//	        // 遍历链表直到index节点的前一节点
//	        if (index >= 0 && index < length) {
//	        	if (index == 0) {// 若删除的是头节点
//	        		head = current.next;
//	        		length--;
//	        		return;
//	        	} else {
//	        		for (int i = 0; i <= index; i++) {
//	        			if (i == index - 1) {
//	        				current.next = current.next.next;
//	        				length--;
//	        			} else {
//	        				current = current.next;
//	        			}
//	
//	        		}
//	        	}
//	
//	        }
//	 }
	 
	
	//removeFirst
//	 public int removeFirst() {
//		 int d = getFirst();
//		 removeFirst();
//		 return d;
//	 }
//	 public int removeFirst() {
//		 Node current = head;
//		 head = current.next;
//		 length--;
//		 return current.value;
//	 }
 
	//removeFirstOccurence
//	 public boolean removeFirstOccurrence(int o) {
//		 if(indexOf(o) < 0) {
//			 return false;
//		 } else {
//			 remove(indexOf(o));
//			 return true; 
//		 }
//	 }
	 public int removeFirst() {
		 Node current = head;
		 head = current.next;
		 length--;
		 return current.value;
	 }
	 
	//removeFirstOccurence
	public boolean removeFirstOccurrence(int o) {
		Node prev = head;
		if(head == null) {
			return false;
		}
		if(head.value == o) {
			head = prev.next;
			length--;
			return true;
		}
		Node current = prev.next;
		while(current != null && current.value != o) {
			current = current.next;
			prev = prev.next;
		}
		if(current == null) {
			return false;
		}
		prev.next = current.next;
		return true;
	}
	
	//removeLast
	 public int removeLast() {
		 Node prev = head;
		 if(head == null) {
			 return 0;
		 }
		 Node current = prev.next;
		 if(current == null) {
			 int a = head.value;
			 head = null;
			 return a;
		 }
		 while (current.next != null) {
			 current = current.next;
			 prev = prev.next;
		 }
		 int ab = current.value;
		 prev.next = null;
		 return ab;
		 
	 }

	//removeLastOccurence
	public boolean removeLastOccurrence(int o) {
		Node prev = head;
		if(head == null) {
			return false;
		}
		Node saveprev = null;
		if(head.value == o) {
			saveprev = prev;
		}
		Node current = prev.next;
		while(current != null) {
			if(current.value == o) {
				saveprev = prev;
			}
			System.out.println(prev.value);
			current = current.next;
			prev = prev.next;
		}
		if(saveprev == null) {
			return false;
		}
		saveprev.next = saveprev.next.next;
		return true;
	}
	
	//removeLastOccurence
//	 public boolean removeLastOccurrence(int o) {
//		 if(lastIndexOf(o) < 0) {
//			 return false;
//		 } else {
//			 remove(lastIndexOf(o));
//			 return true; 
//		 }
//	 }
	
	//isEmpety
	    public boolean isEmpty() {
	        return this.length() > 0 ? false : true;
	    }
	    
	//toArray
//	 public int[] toArray() {
//		 int[] result = new int[length];
//		 int i =0;
//		 for(Node x = head; x != null; x = x.next) {
//			 result[i++] = x.value;
//		 }
//		 return result;
//	 }
	 public int[] toArray() {
	 int[] result = new int[length];
	 int i = 0;
	 Node n = head;
	 while(n != null) {
		 result[i] = n.value;
		 i++;
		 n = n.next;
	 }
	 return result;
	 }
	 
	 //printList(）
	 public void printList() {
		 Node temp = head;
		 while(temp != null) {
			 System.out.println(temp.value);
			 temp = temp.next;
		 }
	 }
}
