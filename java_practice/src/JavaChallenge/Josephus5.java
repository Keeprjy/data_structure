package JavaChallenge;


import java.util.*;
 
public class Josephus5 {
	
//arrayList
	public static int Josephus(int n, int m){
		if(n == 0 || m == 0)
			return -1;
		if(n == 1 && m == 1)
			return 1;
		List<Integer> alist = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {//把数放入ArrayList
			alist.add(i);
		}
		//初值设为-1，
		int index = -1;
		while(alist.size() > 1){
			index = (index+m) % alist.size();
			alist.remove(index);
			//从上一个位置开始计数
			index--;
		}
		return alist.get(0);
		
	}
	
	// array
//    public static void josephus(int n, int m) {
//        int[] nums = new int[n + 1];
//        int count = 1;
//        int flag = n;
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = i;
//        }
//        while(flag > 0) {
//        	for(int i = 1; i <= n; i++) {
//        		if(nums[i] == 0) {
//        			continue;
//        		}
//        		if(count == m) {
//        			System.out.printf(i + " ");
//        			nums[i] = 0;
//        			flag -= 1;
//        			count = 1;
//        		} else {
//        			count++;
//        		}
//        	}
//        }
//    }
		public static void josephus(int n, int m) {
			boolean[] nums = new boolean[n + 1];
			int count = 1;
			int flag = n;
			while(flag > 0) {
				for(int i = 1; i <= n; i++) {
					if(nums[i] == true) {
						continue;
					}
					if(count == m) {
						System.out.printf(i + " ");
						nums[i] = true;
						flag -= 1;
						count = 1;
					} else {
						count++;
					}
				}
			}
		}
    

	public static void main(String[] args) {
		//ArrayList<>
		int totalNum = 8;
		System.out.print("请输入总人数：" + totalNum);
		int cycleNum = 3;
		System.out.print("请输入报数大小：" + cycleNum);
		int a = Josephus(totalNum, cycleNum);
		System.out.println("最后一个人的序号：" + a);
		
		//Array
		josephus(8,3);
		System.out.println();

		//liskedList
		CreateLinkList cL = new CreateLinkList();
		cL.addNode(8);//加入7个节点
		cL.showNode();
		//测试出圈是否正确
		cL.countNode(1,3,8);
				
	}
}
//思路
//1.需要创建一个辅助指针，helper.实现应该指向环形链表的最后的节点。（last）补充，报数前，先让first和helper移动k-1次
//2.当数数时，让first和helper指针同时的移动m-1次
//3.这时可以将first删除。first = first.next; helper.next = first.原来first指向的节点就没有任何引用，被回收、



//创建一个类，表示一个节点
class Node{
	private int no; 
	private Node next; //指向下一个节点,默认null;
	public Node(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}

class CreateLinkList {
	//创建一个first节点，当前还没有编号
	private Node first =  null;
	//添加节点，构建成一个环形链表
	public void addNode(int nums) {
		//nums 做一个数据校验
		if(nums < 1) {
			System.out.println("nums的数值不正确");
			return;
		}
		Node current = null;//辅助指针，帮助构建环形链表
		//使用for循环来创建环形链表
		for(int i = 1; i <= nums; i++) {
			//根据编号创建节点
			Node node = new Node(i);
			//如果是第一个Node
			if(i == 1) {
				first = node;
				first.setNext(first);//构成环
				current = first;//让current指向头节点
			} else {
				current.setNext(node);
				node.setNext(first);
				current = node;
			}
		}
	}
	//遍历当前的环形链表
	public void showNode() {
		//判断链表是否为空
		if(first == null) {
			System.out.println("链表为空");
			return;
		}
		//因为first不可以移动，因此我们仍然使用一个辅助指针完成遍历
		Node current = first;
		while(true) {
			System.out.println("节点的编号" + current.getNo());
			if(current.getNext() == first) {//说明遍历完毕
				break;
			}
			current = current.getNext();//current 后移
		}
	}
	
	//根据用户输入，计算出出圈的顺序
	/*
	 * startNo 表示从哪里开始
	 * countNum 表示数几下
	 * nums 表示最初多少个数在圈上
	 */
	public void countNode(int startNo, int countNum, int nums) {
		//先对数据进行校验
		if(first == null || startNo < 1 || startNo > nums) {
			System.out.println("输入有误，请重新输入");
			return;
		}
		//创建要给辅助指针，帮助完成出圈
		Node helper = first;
		//需要创建一个辅助指针变量helper，事先应该指向环形链表的最后这个节点
		while(true) {
			if(helper.getNext() == first) {
				break;
			}
			helper = helper.getNext();
		}
		//开始杀人前，先让first和helper移动k-1次
		for(int j = 0; j < startNo - 1; j++) {
			first = first.getNext();
			helper = helper.getNext();
		}
		//当杀人时，让first和helper指针同时的移动m-1次，然后出圈
		//这里是一个循环操作，直到圈中只有一个节点
		while(true) {//说明圈中只有一人
			if(helper == first) {
				break;
			}
			//让helper和first指针同时移动countNum - 1
			for(int j = 0; j < countNum - 1; j++) {
				first = first.getNext();
				helper = helper.getNext();
			}
			//这时first指向的节点，就是要出圈的人
			System.out.println("出圈" + first.getNo());
			//这时将first指向的数字出圈
			first = first.getNext();
			helper.setNext(first);
			
		}
		System.out.println("最后留在圈中的数字" + first.getNo());
		
	}
}

