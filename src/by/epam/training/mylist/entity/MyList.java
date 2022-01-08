package by.epam.training.mylist.entity;

import java.util.Comparator;
import java.util.Arrays;

public class MyList<T> implements MyListInterface<T>{

	private Object[] myList = new Object[0];
	private int index = 0;
	
	public MyList() {}

	@Override
	public void add(T obj) {
		if(index >= myList.length) {
			Object[] myListNew = myList;
			myList = new Object[myListNew.length + 1];
			System.arraycopy(myListNew, 0, myList, 0, myListNew.length);
		}
		myList[index] = obj;
		index++;
	}

	@Override
	public void add(int index, T obj) {
		if(index >= myList.length) {
			Object[] myListNew = myList;
            myList = new Object[myListNew.length + 1];
            System.arraycopy(myListNew, 0, myList, 0, index);
            int index2 = myListNew.length - index;
            System.arraycopy(myListNew, index, myList, index, index2);
		}
		myList[index] = obj;
		index++;
	}

	@Override
	public void remove() {
		Object[] myListNew = myList;
		myList = new Object[myListNew.length - 1];
		System.arraycopy(myListNew, 0, myList, 0, myListNew.length - 1);
		index--;	
	}

	@Override
	public void remove(int index) {
		if(index <= myList.length) {
			Object[] myListNew = myList;
	        myList = new Object[myListNew.length - 1];
	        System.arraycopy(myListNew, 0, myList, 0, index);
	        int index2 = myList.length - index - 1;
	        System.arraycopy(myListNew, index + 1, myList, index, index2 + 1);
		}
        index--;
		
	}

	@Override
	public void sort() {
		Arrays.sort(myList, 0, index);
		
	}

	@Override
	public void sort(Comparator<?> comparator) {
		Comparator<? super T> comp = (Comparator<? super T>) comparator; 
		   Arrays.sort((T[]) myList, 0, index, comp);
		
	}
	
	public void print() {
		
		for(Object o : myList) {
			System.out.println(o);
		}
		
	}

}
