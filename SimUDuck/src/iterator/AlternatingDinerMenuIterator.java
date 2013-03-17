package iterator;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem>{

	private MenuItem[] itens;
	private int position;

	public AlternatingDinerMenuIterator(MenuItem[] itens) {
		this.itens = itens;
		position = Calendar.DAY_OF_WEEK % 2;
	}

	@Override
	public boolean hasNext() {
		if(position >= itens.length || itens[position] == null)
			return false;
		else
			return true;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = itens[position];
		position += 2;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Não é possivel a remoção");
	}
	
}
