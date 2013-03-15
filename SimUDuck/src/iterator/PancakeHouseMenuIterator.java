package iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{

	private final ArrayList itens;
	private int position;
	
	public PancakeHouseMenuIterator(ArrayList itens) {
		this.itens = itens;
	}
	
	@Override
	public boolean hasNext() {
		if(itens.size() == 0 || position >= itens.size())
			return false;
		return true;
	}

	@Override
	public Object next() {
		return itens.get(position++);
	}

}
