package JavaChallenge;

import java.util.Arrays;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class myString7 {
	//属性
    private char[] value;
//    private int offset; //数组被使用的开始位置
    private int count;  //String中元素的个数
//    private int hash;   //Sring类型的hash值
	private int capacity;
    
 
    public myString7() {
        value = new char[0];
        count = 0;
        capacity = value.length;
        
    }
	public void myStirng7(int intSize) {
		if(intSize <0) {
			throw new IllegalArgumentException("IllegalArgument: " + intSize);
		}
		value = new char[intSize];
		count = 0;
		capacity = value.length;
	}
	
	//检查String开辟的空间是否足够，如果不足则进行扩容
	
	private void checkCapacity(int needCapacity) {
		if(needCapacity > value.length) { //空间不足，需要扩容
			char[] oldArray = value;
			int newCapacity = this.capacity*2 + 1;//扩容的空间；
			value = new char[newCapacity];
			value = Arrays.copyOf(oldArray, newCapacity);
		}
	}
	
	
	
    public myString7(String str) {
        this.value = str.toCharArray();
    }

    public myString7(char[] value) {
        this.value = value;
    }
    public myString7(byte[] bytes) {
         this.value = new char[bytes.length];
         for(int i = 0; i < bytes.length; i++) {
             this.value[i] = (char) bytes[i];
         }
    }
    public myString7(char value[], int offset, int count) {
        if(offset < 0) {
            throw new StringIndexOutOfBoundsException(offset);
        }
        if(count <= 0) {
            if(count < 0) {
                throw new StringIndexOutOfBoundsException(count);
            }
            if(offset <= value.length) {
                this.value = new char[0];
                return;
            }
        }
        if(offset > value.length-count) {
            throw new StringIndexOutOfBoundsException(offset);
        }
        this.value = Arrays.copyOfRange(value, offset, count);
    }


    //length
    public int length() {
        return value.length;
    }
    
    // isEmpty
    public boolean isEmpty() {
    	if(value.length == 0) {
    		return true;
    	}
    	return false;
    }

    //charAt
    public char charAt(int index) {
        if(index > this.value.length || index < 0) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return value[index];
    }
    
    
    //compareTo 
    public int compareTo(myString7 anotherString) {
        int len1 = value.length;
        int len2 = anotherString.value.length;
        int lim = Math.min(len1, len2);
        char v1[] = value;
        char v2[] = anotherString.value;

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }

    
    
    //CompareToIgnoreCase
    public int compareToIgnoreCase(myString7 anotherString) {
        int len1 = value.length;
        int len2 = anotherString.value.length;
        int lim = Math.min(len1, len2);
        char v1[] = value;
        char[] newString = new char[value.length];
        for(int i = 0; i < value.length; i++) {
            if(value[i] >= 'a' && value[i] <= 'z') {
                newString[i] = (char) (value[i] - 32);
            } else {
                newString[i] = value[i];
            }
        }
        char v2[] = anotherString.value;
        v2 = newString;


        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }
    
    



    //toString
    public String toString() {
        return new String(this.value);
    }

    //Index of
    public int indexOf(int ch) {
        return indexOf(0, ch);
    }
    public int indexOf(int ch, int fromIndex){
        for(int i = 0; i < value.length; i++) {
            if(value[i] == ch) {
                return i;
            }
        }
        return -1;
    }
    public int indexOf(myString7 str) {
        return indexOf(str, 0);
    }
    public int indexOf(myString7 str, int fromIndex){
        char[] source = value;
        char[] target = str.value;
        for(int i = fromIndex; i < source.length; i++) {
            if(source[i] == target[0]){
                int index = i;
                int sameLen = 1;
                for(int j = 1; j < target.length && (i+j) < source.length; j++) {
                    if(target[j] != source[i+j]) {
                        break;
                    }
                    sameLen++;
                }
                if(sameLen == target.length) {
                    return index;
                }
            }
        }
        return -1;
    }
    // lastIndexOf    
    public int lastIndexOf(int ch) {
    	return indexOf(value.length - 1, ch);
    }
    public int lastIndexOf(int ch, int fromIndex) {
    	for(int i = value.length;i >= 0; i--) {
    		if(value[i] == ch) {
    			return i;
    		}
    	}
    	return -1;
    }
    public int lastIndexOf(myString7 str) {
    	return indexOf(str,value.length);
    }
    public int lastIndexOf(myString7 str, int fromIndex) {
    	char[] source = value;
    	char[] target = str.value;
        for(int i = fromIndex; i >= 0; i--) {
            if(source[i] == target[length()]){
                int index = i;
                int sameLen = 1;
                for(int j = target.length; j > 0 && (i+j) < source.length; j--) {
                    if(target[j] != source[i+j]) {
                        break;
                    }
                    sameLen++;
                }
                if(sameLen == target.length) {
                    return index;
                }
            }
        }
        return -1;
    }
    
// concat
    public myString7 concat(myString7 str) {
        if(str.length() == 0) {
            return this;
        }
        int len = value.length;
        int otherLen = str.length();
        char[] buf = Arrays.copyOf(value, len + otherLen);  //定义一个新的char[]数组,长度为原数组+要拼接的数组长度，并将原来的数组内容复制到新的数组
        System.arraycopy(str.value, 0, buf, len, otherLen);
        return new myString7(buf);
    }
    //StartWith
    public boolean startsWith(myString7 prefix) {
        return this.startsWith(prefix, 0);
    }

    /*
     * 检测字符串是否以某子串开头
     * @param   prefix  子串
     * @param   toffset 字符串的起始位置
     * @return  {@code true} 如果字符串以该子串开头就返回true; {@code false} 否则返回false.
     * @since   1. 0
     * @author SpringChang
     */

    public boolean startsWith(myString7 prefix, int toffset){
        char[] target = prefix.value;
        char[] source = value;
        int sameLen = 0; //相同字符长度
        for(int i = 0; i < target.length && (toffset+i) < source.length; i++) {
            if(source[toffset+i] != target[i]) {
                break;
            }
            sameLen++;
        }
        if(sameLen == target.length) {
            return true;
        }
        return false;
    }
    
    // endsWith
    public boolean endsWith(myString7 suffix) {
    	return this.endsWith(suffix);
    }
    
    //toLowerCase
    public myString7 toLowerCase(){
        char[] newString = new char[value.length];
        for(int i = 0; i < value.length; i++) {
            if(value[i] >= 'A' && value[i] <= 'Z') {
                newString[i] = (char) (value[i] + 32);
            } else {
                newString[i] = value[i];
            }
        }

        return new myString7(newString);
    }

    //toUpperCase
    public myString7 toUpperCase(){
        char[] newString = new char[value.length];
        for(int i = 0; i < value.length; i++) {
            if(value[i] >= 'a' && value[i] <= 'z') {
                newString[i] = (char) (value[i] - 32);
            } else {
                newString[i] = value[i];
            }
        }

        return new myString7(newString);
    }

    //subString
    public myString7 substring(int beginIndex){
        if(beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        return beginIndex==0?this:new myString7(value, beginIndex, value.length-beginIndex);
    }
    public myString7 substring(int beginIndex, int endIndex){
        if(beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if(endIndex > value.length) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        return beginIndex==0?this:new myString7(value, beginIndex, endIndex);
    }

    //toCharArray
    public char[] toCharArray() {
        //return this.value; 不能直接这样返回
        char[] charArr = new char[value.length];
        System.arraycopy(value, 0, charArr, 0, value.length);
        return charArr;
    }
}