package JavaChallenge;

import java.util.Arrays;

public class myArraylist2 {
	private int[] array;
	private int count;
	private int capacity;
	public myArraylist2() {
	    array = new int[10];
	    count = 0;
	    capacity = array.length;
	}
	
	public myArraylist2(int intSize) {
		if(intSize <0) {
			throw new IllegalArgumentException("IllegalArgument: " + intSize);
		}
		array = new int[intSize];
		count = 0;
		capacity = array.length;
	}
	
	//检查ArrayList开辟的空间是否足够，如果不足则进行扩容
	
	private void checkCapacity(int needCapacity) {
		if(needCapacity > array.length) { //空间不足，需要扩容
			int[] oldArray = array;
			int newCapacity = this.capacity*2 + 1;//扩容的空间；
			array = new int[newCapacity];
			array = Arrays.copyOf(oldArray, newCapacity);
		}
	}
	
	//检查索引是否合法
	private void RangeCheck(int index) {//检查索引是否合法
		if(index < 0 || index >= capacity) {
			throw new IndexOutOfBoundsException("IllegalArgument" + index);// 去掉异常的情况
		}
	}
	
	
	//add末尾条件加元素
	public void add(int e) {
		checkCapacity(capacity + 1);//插入一个元素，至少需要size + 1大小的空间
		array[count] = e;
		count++;
	}
	
	//add在index出插入元素int
	
	public void add(int index, int element) {
		RangeCheck(index);
		checkCapacity(count + 1);//扩容
		System.arraycopy(array, index, array, index + 1,count - index);
		array[index] = element;
		count++;
		
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
        if (numMoved > 0) {
            System.arraycopy(array, index+1, array, index,numMoved);
        }
        array[--count] = 0;//让垃圾回收器回收
    }
	//size
	public int size() {
		return this.count;
	}
	
	//toArray
	public int[] toArray() {
		return Arrays.copyOf(array, count);
	}
	
	
}
