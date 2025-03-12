package iterator;

public class GenericContainer<T> implements GeneContainer<T> {
	
	private T[] array;
	
	public GenericContainer(T[] array) {
		this.array = array;
	}
	
	@Override
	public GenericIterator getGenericIterator() {
		return new GenericIterator();
	}

	private class GenericIterator implements GenericIteratorInterface<T> {
		
		int index; // default 0 // strArray 에서 현재 들여다 보는 객체

		@Override
		public boolean hasNext() {
			if (index < array.length)
				return true;
			return false;
		}

		@Override
		public T Next() {
			if (this.hasNext())
				return array[index++];
			return null;
		}

		
		
	}

	
}
