package by.epam.training.mylist.entity;

import java.util.Comparator;

public interface MyListInterface <T>{
	
	void add(T obj);
	void add(int index, T obj);
	void remove();
	void remove(int index);
	void sort();
	void sort(Comparator<?> comparator);
	//void sort(Comparator<? super T> comparator);

}
