package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem>{

	private final ArrayList<MenuItem> itens;
	private int position;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> itens) {
		this.itens = itens;
	}
	
	@Override
	public boolean hasNext() {
		if(itens.size() == 0 || position >= itens.size())
			return false;
		return true;
	}

	@Override
	public MenuItem next() {
		return itens.get(position++);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
