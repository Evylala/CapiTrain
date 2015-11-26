package main;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.Net;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Transition;

public class test {

	public static void main(String[] args) {
		PetrinetFactory factory = PetrinetPackage.eINSTANCE.getPetrinetFactory();

		Net net = factory.createNet();

		Place place1 = factory.createPlace();
		place1.setName("place1");
		Place place2 = factory.createPlace();
		place2.setName("place2");
		Place place3 = factory.createPlace();
		place3.setName("place3");
		Place place4 = factory.createPlace();
		place4.setName("place4");

		Transition transition1 = factory.createTransition();
		transition1.setName("transition1");
		Transition transition2 = factory.createTransition();
		transition2.setName("transition2");
		
		place1.getPostt().add(transition1);
		transition1.getPrep().add(place1);
		transition1.getPostp().add(place2);
		transition1.getPostp().add(place3);
		place2.getPret().add(transition1);
		place3.getPret().add(transition1);
		place2.getPostt().add(transition2);
		place3.getPostt().add(transition2);
		transition2.getPrep().add(place2);
		transition2.getPrep().add(place3);
		transition2.getPostp().add(place4);
		place4.getPret().add(transition2);

		place1.setCnet(net);
		place2.setCnet(net);
		place3.setCnet(net);
		place4.setCnet(net);
		
		transition1.setCnet(net);
		transition2.setCnet(net);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("petrinet", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI("tests/input.petrinet"));

		resource.getContents().add(net);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
