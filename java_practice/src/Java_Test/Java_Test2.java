package Java_Test;

import java.util.ArrayList;

import JavaChallenge.myArraylist1;
import JavaChallenge.myArraylist2;

public class Java_Test2 {
	public static void main(String[] args) {
		myArraylist2 List = new myArraylist2();
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
		List.add(5);
		List.add(6);
		List.add(2,11);
		//size
		System.out.println("size = " + List.size());
		//遍历
		for(int i = 0; i < List.size(); i++) {
			System.out.println("Index = " + i  + " value = "+ List.get(i));
		}
		System.out.println("index3 = " + List.get(3));
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
		for(int i = 0; i < List.size(); i++) {
			System.out.println("Index = " + i  + " value = "+ List.get(i));
		}
		
		int lastPosition1 = List.lastIndexOf(7);
		System.out.println("最后一个数字是7的index = " + lastPosition1);
		
		//clear
		List.clear();
		for(Integer i : List.toArray()) {
			System.out.print("遍历数组里的所有元素 = " + i);
		}
		//isEmpty
		boolean result = List.isEmpty();
		System.out.println(result);
		
		//toArray
		for(Integer i : List.toArray()) {
			System.out.println("遍历数组里的所有元素 = " + i);
		}
	}

}
