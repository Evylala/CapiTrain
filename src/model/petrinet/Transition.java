package model.petrinet;

import java.util.ArrayList;

public class Transition extends NamedElement {
	private ArrayList<Place> prep;
	private ArrayList<Place> postp;
	private Net net;
	
	public Transition(String name, String id) {
		super(name, id);
	}

	public ArrayList<Place> getPrep() {
		return prep;
	}

	public void setPrep(ArrayList<Place> prep) {
		this.prep = prep;
	}

	public ArrayList<Place> getPostp() {
		return postp;
	}

	public void setPostp(ArrayList<Place> postp) {
		this.postp = postp;
	}

	public Net getNet() {
		return net;
	}

	public void setNet(Net net) {
		this.net = net;
	}
	
}
