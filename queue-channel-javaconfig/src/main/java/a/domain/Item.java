package a.domain;

import java.io.Serializable;

public class Item implements Serializable {
	private static final long serialVersionUID = -8513299303773114981L;

	private String id;

	private String link;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	

}
