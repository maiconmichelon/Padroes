package iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>{

	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null)
			return false;
		return true;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}

	@Override
	public void remove() {
		if(position > 0 && items[position -1] != null){
			for(int i = position -1; i < items.length -1; i++)
				items[i] = items[i+1];
			items[items.length-1] = null;
		}
	}

}
