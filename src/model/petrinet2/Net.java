package model.petrinet2;

import java.util.ArrayList;

public class Net {
	private ArrayList<Transition> transitions;
	private ArrayList<Place> places;
	
	public Net() {
	}
	
	public ArrayList<Transition> getTransitions() {
		return transitions;
	}
	public void setTransitions(ArrayList<Transition> transitions) {
		this.transitions = transitions;
	}
	public ArrayList<Place> getPlaces() {
		return places;
	}
	public void setPlaces(ArrayList<Place> places) {
		this.places = places;
	}
}
