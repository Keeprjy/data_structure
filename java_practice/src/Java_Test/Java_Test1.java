package Java_Test;

import java.util.ArrayList;

import JavaChallenge.myArraylist1;

public class Java_Test1 {
	public static void main(String[] args) {
		myArraylist1 List = new myArraylist1();
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		List.add(7);
		List.add(8);
		List.add(9);
		List.add(7);
		List.add(8);
		List.add(9);
		List.add(7);
		List.add(2,11);
		//size
		System.out.println("size = " + List.size());
		System.out.println("index3 = " + List.get(3));
		//toArray
		for(Integer i : List.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
		//set
		List.set(0, 100);
		//遍历
		for(int i = 0; i < List.size(); i++) {
			System.out.println("Index = " + i  + " value = "+ List.get(i));
		}
		//indexOf
		int position = List.indexOf(7);
		System.out.println("第一个数字是7的index = " + position);
		
		
		//lastIndexOf
		int lastPosition = List.lastIndexOf(7);
		System.out.println("最后一个数字是7的index = " + lastPosition);
		
		
		//remove last of 7
		List.remove(List.lastIndexOf(7));
		
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
	}
}
