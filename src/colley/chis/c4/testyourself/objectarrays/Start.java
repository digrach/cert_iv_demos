package colley.chis.c4.testyourself.objectarrays;

public class Start {

	public static void main(String[] args) {

		Gizmo gizmoArray[] = new Gizmo[5];
		gizmoArray[0] = new Gizmo("Gizmo 1");
		gizmoArray[1] = new Gizmo("Gizmo 2");
		gizmoArray[2] = new Gizmo("Gizmo 3");

		Gizmo g1 = new Gizmo("Gizmo 4");
		Gizmo g2 = new Gizmo("Gizmo 5");

		gizmoArray[3] = g1;
		gizmoArray[4] = g2;

		for (int x = 0; x < gizmoArray.length; x++ ) {
			System.out.println(gizmoArray[x].getName());
		}


	}

}
