package JavaChallenge;

import java.util.Scanner;

import JavaChallenge.myLinkedList3.Node;

//顺序链
//1.使用数组来模拟战
//2.定义一个top 来表示栈顶，初始化为 -1；
//3.入栈，当有数据加到栈时，top++;stack[top] = data;
//4.出栈，intvalue= stack[top] = data;
public class stack8 {
	public static void main(String[] args) {
//		//测试ArrayStack
//		//创建一个ArrayStack对象 -> 表示栈
//		ArrayStack stack = new ArrayStack(9);
//		String key = "";
//		boolean loop = true; //控制是否退出菜单
//		Scanner scanner = new Scanner(System.in);
//		
//		while(loop) {
//			System.out.println("show: 表示显示栈");
//			System.out.println("exit: 退出程序");
//			System.out.println("push: 入栈");
//			System.out.println("pop: 出栈");
//			System.out.println("peek: 栈顶");
//			System.out.println("search: 查找");
//			System.out.println("请输入你的选择");
//			key = scanner.next();
//			switch(key) {
//			case "show":
//				stack.traverse();
//				break;
//			case "search":
//				System.out.println("请输入一个数");
//				int currValue = scanner.nextInt();
//				stack.search(currValue);
//				break;
//			case "push":
//				System.out.println("请输入一个数");
//				int value = scanner.nextInt();
//				stack.push(value);
//				break;
//			case "pop":
//				try {
//					int res = stack.pop();
//					System.out.println("出栈的数据" + res);
//				} catch(Exception e) {
//					System.out.println(e.getMessage());
//				}
//				break;
//			case "peek":
//				try {
//					int res = stack.peek();
//					System.out.println("top的值" + res);
//				} catch(Exception e) {
//					System.out.println(e.getMessage());
//				}
//				break;
//			case "exit":
//				scanner.close();
//				loop = false;
//				break;
//			default:
//				break;
//			}
//		}
//		System.out.println("程序退出"); 
		
		linkStack linkStack = new linkStack();
		linkStack.push(2);
		linkStack.push(4);
		linkStack.push(6);
//		linkStack.traverse();
//		System.out.println(linkStack.top);
		System.out.println("查找 2 距离栈顶的距离" + linkStack.search(2));
		System.out.println("*******************");
		System.out.println("当前栈的长度为： " + linkStack.size());
		System.out.println("当前栈是否为空： " + linkStack.isEmpty());
		System.out.println("当前栈的栈顶元素为： " + linkStack.peek());
		System.out.println("第一次出栈时的栈顶元素： " + linkStack.pop());
		System.out.println("*********************************************************");
		System.out.println("出栈后的栈顶元素： " + linkStack.pop());
		System.out.println("第二次出栈时的栈顶元素" + linkStack.pop() );
		System.out.println("第三次出栈时的栈顶元素" + linkStack.pop());
		System.out.println("第四次出栈时的栈顶元素" + linkStack.pop());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
	}
}

//定义一个类 ArrayStack 表示栈
class ArrayStack{
	//属性
	private int maxSize; //栈的大小；
	private int[] stack; //数组， 数组模拟战，数据就放在这个数组中；
	private int top = -1; //top表示栈顶， 初始化为 -1；
	 
	//构造器
	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		stack = new int[this.maxSize];
	}
	
	//栈满
	public boolean isFull() {
		return top == maxSize -1;
	}
	
	//栈空
	public boolean isEmpty() {
		return top == -1;
	}
	
	//入栈 push
	public void push(int value) {
		if(isFull()) {
			System.out.println("栈满");
			return;
		}
		top++;
		stack[top] = value;
	}
	
	//peek
	public int peek() {
		if(isEmpty()) {
			//跑出异常
			throw new RuntimeException("栈空，没有数据");
		}
		int value = stack[top];
		return value;
	}
	
	
	//出栈 pop 将栈顶的数据返回
	public int pop() {
		if(isEmpty()) {
			//跑出异常
			throw new RuntimeException("栈空，没有数据");
		}
		int value = stack[top];
		top--;
		return value;
	}
	
	//遍历栈 traverse 显示栈的请，便利时，需要从栈顶开始显示数据
	public void traverse() {
		if(isEmpty()) {
			System.out.println("栈空，没有数据");
			return;
		}
		//需要从栈顶开始显示数据
		for(int i = top; i >= 0; i--) {
			System.out.println("序号" + i + "value" + stack[i]);
		}
	}
	
	//查找 search（）查找“元素o”在栈中的位置：由栈底向栈顶方向数
    public int search(int o) {
        for(int i = top; i >= 0; i--) {
        	if(o == stack[i]) {
            	System.out.println(top + 1 - i);
                return top + 1 - i;
        	}
        }
        System.out.println("没有此数");
        return -1;
    }
    
}



//定义一个类 linkStack 表示栈
class linkStack{
	//属性
	Node top; //栈顶元素
	private int size; //当前栈的大小
	 
	//构造器
	private class Node{
		int data;
		Node next;
		public Node() {}
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	
	//构建空链栈
	public linkStack() {
		top = null;
	}
	
	//以int类型创建链式栈
	public linkStack(int data) {
		top = new Node(data, null);
		size++;
	}
	
	
	//判断链栈是否为空栈 isEmpty（）；
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
	//返回链栈的长度size()
	public int size() {
		return size;
	}
	
	//入栈 push
	public void push(int data) {
		top = new Node(data, top);
		size++;
	}
	
	//出栈 pop
	public int pop() {
		if(isEmpty()) {
			System.out.println("空栈");
			return -1;
		}
		Node temp = top;
		//更新头结点
		top = top.next;
		//释放原栈顶元素的next引用，删除指针指向
		temp.next = null;
		size--;
		return temp.data;
	}
	
	//查看栈顶 peek()
	public int peek() {
		if(top != null) {
			return top.data;
		}
		System.out.println("空栈");
		return -1;
	}
	
	
	//遍历栈 traverse()
	public void traverse() {
		while(top != null) {
			System.out.println( top.data + "\t");
			top = top.next;
		}
	}
	
	//清空栈
	public void clear() {
		top = null;
		size = 0;
	}
	
	//查找 search（）
    public int search(int o) {
    	int index = 0;
    	Node n = top;
    	while(n != null) {
    		if(o == n.data) {
            	System.out.println(index + 1);
                return index + 1;
    		}
    		index++;
    		n = n.next;
    	}
        System.out.println("没有此数");
        return -1;
    }

	
}
	
	