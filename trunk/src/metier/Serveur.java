package metier;

public class Serveur {
	
	private int id;
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Serveur(int id, String url) {
		this.id=id;
		this.url = url;
	}

	public Serveur() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return url;
	}
	
}
