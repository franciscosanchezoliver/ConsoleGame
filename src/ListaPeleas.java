
import java.util.ArrayList;

public class ListaPeleas {

	ArrayList<Pelea> listaPeleas;

	public ListaPeleas() {
		listaPeleas = new ArrayList<>();
	}

	public boolean hayPeleas() {
		return this.listaPeleas.size() > 0;
	}

	public void addPelea(Pelea pelea) {
		this.listaPeleas.add(pelea);
	}

	/**
	 * elimina la primera pelea
	 */
	public void removePelea() {
		this.listaPeleas.remove(0);
	}

	public Pelea getPelea(int i) {
		return this.listaPeleas.get(i);
	}

	public int size() {
		return this.listaPeleas.size();
	}

	public ArrayList<Pelea> getListaPeleas() {
		return listaPeleas;
	}
	
	


}
