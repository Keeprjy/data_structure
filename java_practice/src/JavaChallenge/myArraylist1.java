package JavaChallenge;

import java.util.Arrays;

public class myArraylist1 {
	private int[] array;
	public int count;//现在数组里面有多少数字 size
	private int capacity;//最多可以放多少数字 capacity
	public myArraylist1() {
	    array = new int[10];
	    count = 0;
	    capacity = array.length;
	}
	
	public myArraylist1(int intSize) {
		if(intSize <0) {
			throw new IllegalArgumentException("IllegalArgument: " + intSize);
		}
		array = new int[intSize];
		count++;
		capacity = array.length;
	}
	
	//检查ArrayList开辟的空间是否足够，如果不足则进行扩容
	
//	private void checkCapacity(int needCapacity) {
//		if(needCapacity > array.length) { //空间不足，需要扩容
//			int[] oldArray = array;
//			int newSize = this.capacity*2 + 1;//扩容的空间；
//			array = new int[capacity];
//			array = Arrays.copyOf(oldArray, newSize);
//		}
//	}
	
	//检查索引是否合法
	private void RangeCheck(int index) {//检查索引是否合法
		if(index < 0 || index >= capacity) {
			throw new IndexOutOfBoundsException("IllegalArgument" + index);// 去掉异常的情况
		}
	}
	
	
	//add末尾条件加元素
	public boolean add(int e) {
		if(count >= capacity) {
			return false;
		} else {
			//数组里的第几个数的值 array[count] = e 
			this.array[count] = e;
			count++;
			return true;
			
		}
	}
	
	//add在index出插入元素int
	
	public void add(int index, int element) {
		RangeCheck(index);
		if(count >= capacity) {
			System.arraycopy(array, index, array, index + 1,capacity - index -1 );
		} else {
			System.arraycopy(array, index, array, index + 1,count - index);
		}
		array[index] = element;
	}
	
	//clear
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            array[i] = 0;
        }
        count = 0;
    }
    
    //get
    public int get(int index) {
    	if(index < 0 || index >= count) {
    		return 0;
    	} else {
    		return array[index];
    	} 
    }
    
    // isEmpety
    public boolean isEmpty() {
    	if(count == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    // indexof
    public int indexOf(int o) {
    	for (int i = 0; i < count; i++) {
    		if (o == array[i]) {
    			return i;
    			}
        }
        return -1;
    }
    
    // lastindexof
    public int lastIndexOf(int o) {
        for (int i = count-1; i >= 0; i--) {
            if (o == (array[i]))
                return i;
        }
        return -1;
    }
    
    //set
    public int set(int index, int obj) {
    	RangeCheck(index);
    	int oldint = array[index];
    	array[index] = obj;
    	return oldint;
    }
	
	//remove
    public int remove(int index) {//删除index处的元素
        RangeCheck(index);
        int oldInt = array[index];
        int moveNum = count-index-1;
        if(moveNum>0){
            System.arraycopy(array, index+1, array, index, moveNum);
        }   
        array[--count] = 0;//让垃圾回收器回收
        return oldInt;//返回旧值
    }

	// remove 2
    public boolean remove1(int o) {
        for (int i = 0; i < count; i++) {
            if (o == array[i]) {
                fastRemove(i);
                return true;
            }
        }
        return false;
    }
    private void fastRemove(int index) {
        int numMoved = count - index - 1;
            System.arraycopy(array, index+1, array, index,numMoved);
        array[--count] = 0;//让垃圾回收器回收
    }
	//size
	public int size() {
		return this.count;
	}
	
	//toArray
	public int[] toArray() {
		return Arrays.copyOf(array,count);
	}
	
	
}
	
	
	
	
	
	
	
	
	
	

//a.add(this指的就是a这个变量的数值) DAY 10 16
	
	
	
	
	
	
