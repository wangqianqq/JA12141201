package bean;

import java.util.Comparator;
/*
 * 按String的长度排序
 * */

public class ComparatorByLength implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String a1=(String)o1;
		String a2=(String)o2;
		int res=a1.length()-a2.length();
		return res;
	}

}
