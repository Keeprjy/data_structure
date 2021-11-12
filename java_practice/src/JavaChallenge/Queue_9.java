package JavaChallenge;


public class Queue_9 {
	public static void main(String[] argc)
    {
        Queue q = new Queue(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.pop();
        System.out.println("首-"+q.front()+" 尾"+q.back()+" 队列元素总数"+q.size());
        q.push(4);
        q.push(5);
        q.push(6);
        q.pop();
        q.pop();
        q.push(7);
        System.out.println("首-"+q.front()+" 尾"+q.back()+" 队列元素总数"+q.size());
	    LinkedQueue lQueue=new LinkedQueue();
	    lQueue.add(1);
	    lQueue.add(2);
	    lQueue.add(3);
	    lQueue.add(4);
	    System.out.println("返回队列的头结点的数值:"+lQueue.elementFront());
	    System.out.println("返回队列的尾节点的数值:"+lQueue.elementRear());
	    System.out.println(lQueue.length());
    }

}
//定义一个类 ArrayQueue 表示队
class Queue{
	   private int[] d = null;// 队列空间
	    private int head = 0;// 队列头索引
	    private int tail = 0;// 队列尾索引
	    private int len = 0;// 队列最大长度

	    public Queue(int len) {
	        this.len = len;
	        d = new int[len];
	    }

	    //入队函数
	    public void push(int x) {
	        if (isFull()) {
	            System.out.println("队列已满，入队失败");
	        } else {
	            d[tail] = x;
	            tail = (tail + 1) % len;
	        }
	    }

	    //出队函数
	    public void pop() {
	        if (isEmpty()) {
	            System.out.println("队列为空，出对失败");
	        } else {
	            head = (head + 1) % len;
	        }
	    }

	    //查看队首元素
	    public int front() {
	        return d[head];
	    }

	    //查看队尾元素
	    public int back() {
	        return d[(tail + len - 1) % len];
	    }

	    //查看队列元素总数
	    public int size() {
	        return (tail + len - head) % len-1;
	    }

	    //判断队列是否为空
	    public boolean isEmpty() {
	        //头尾索引相等表示队列满
	        if (tail == head)
	            return true;
	        return false;
	    }

	    //判断队列是否为满
	    public boolean isFull() {
	        //尾索引的下一个为为索引时表示队列满，即将队列容量空出一个作为约定
	        if ((tail + 1) % len == head)
	            return true;
	        return false;
	    }
  
}

class LinkedQueue{
	//自定义链队列--采用非静态内部类来表示链队列的数据节点
	private class Node{
		//表示链队列的数据节点 
		private int data;
		//指向下一个节点的引用
		private Node next;
		public Node(){ 
		}
		public Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
	}
	//定义链队列的对首和对尾的引用
	private Node front;
	private Node rear;
	//定义链栈的大小
	private int size;
	//创建一个空的链对列
	public LinkedQueue(){
		front=null;
		rear=null;
	}
	//以确定的元素来创建一个链对列,只有一个节点的
	public LinkedQueue(int element){
		front=new Node(element,null);
		//指向同一个元素
		rear=front;
		size++;
	}
	//返回链队列的大小
	public int length(){
		return size;
	}
	//返回链队列得对首的元素,不删除对首的元素
	public int elementFront(){
		if(!empty()){
		    return front.data;
		}else{
		    return 0;  
		}
	}
	//访问队列的最后一个元素
	public int elementRear(){
		if(!empty()){
		    return rear.data;  
		}else{
			return 0; 
		}  
	}
	//返回当前的链对队列是否为空
	public boolean empty(){
		return size==0;
	}
	//清空一个链队列
	public void clear(){
		front=null;
		rear=null;
		size=0;
	}
	//插入链队列一个节点--对尾
	public void add(int element){
		//如果链对列为空,就新建一个节点
		if(front==null){
			rear=new Node(element,null);
			front=rear;
		}else{
			//动态创建新节点
			Node newRear=new Node(element,null);
			rear.next=newRear;
			rear=newRear; 
		}
		size++;
	}
	//删除链队列一个节点,返回删除后的节点
	public int remove(){
	     Node oldFront=front;
	     front=front.next;
	     oldFront.next=null;
	     size--;
	     return oldFront.data;
	}
}
