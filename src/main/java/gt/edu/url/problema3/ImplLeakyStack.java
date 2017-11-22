package gt.edu.url.problema3;

public class ImplLeakyStack implements LeakyStack{

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		CircularLinkedList<Animal> animalHistory = new CircularLinkedList<Animal>();
		Object History = animalHistory.isEmpty(Animal);
		if (History == null) {
			return true;
		}else {
			return false;
		}
		
		return false;
	}

	@Override
	public Object saveHistory(Object Animal) {
		CircularLinkedList<Animal> animalHistory = new CircularLinkedList<Animal>();
		Object History = animalHistory.addLast(Animal);;
		return History;
	}

	@Override
	public Object actual() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object undo() {
		// TODO Auto-generated method stub
		return null;
	}

}
