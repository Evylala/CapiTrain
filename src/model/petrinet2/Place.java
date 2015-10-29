package model.petrinet2;

import java.util.ArrayList;

public class Place extends NamedElement {
	private ArrayList<Transition> postt;
	private ArrayList<Transition> pret;
	private Net net;
	
	public Place(String name, String id) {
		super(name, id);
	}

	public ArrayList<Transition> getPostt() {
		return postt;
	}

	public void setPostt(ArrayList<Transition> postt) {
		this.postt = postt;
	}

	public ArrayList<Transition> getPret() {
		return pret;
	}

	public void setPret(ArrayList<Transition> pret) {
		this.pret = pret;
	}

	public Net getNet() {
		return net;
	}

	public void setNet(Net net) {
		this.net = net;
	}
	
}
