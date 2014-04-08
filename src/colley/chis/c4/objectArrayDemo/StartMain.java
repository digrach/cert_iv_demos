package colley.chis.c4.objectArrayDemo;

public class StartMain {

	public static void main(String[] args) {

		System.out.println("2 identical arrays of Widget are created using 2 different techniques.\n");

		initialiseArrayExample1();
		initialiseArrayExample2();

	}

	public static void initialiseArrayExample1() {
		System.out.println("The first technique is suitable for a small number of new objects./n");

		// Instantiate the array of type Widget.
		Widget widgetArray[] = new Widget[5];

		// Widgets are instantiated directly into the array
		widgetArray[0] = new Widget(1);
		widgetArray[1] = new Widget(2);
		widgetArray[2] = new Widget(3);
		widgetArray[3] = new Widget(4);
		widgetArray[4] = new Widget(5);

		System.out.println("Print from example 1");
		printWidgetArray(widgetArray);

	}

	public static void initialiseArrayExample2() {

		System.out.println("The second technique is suitable for existing objects./n");

		// Instantiate individual widget objects.
		Widget w1 = new Widget(1);
		Widget w2 = new Widget(2);
		Widget w3 = new Widget(3);
		Widget w4 = new Widget(4);
		Widget w5 = new Widget(5);

		// Instantiate the array of type Widget.
		Widget widgetArray[] = new Widget[5];

		// place each widget into the array.
		widgetArray[0] = w1;
		widgetArray[1] = w2;
		widgetArray[2] = w3;
		widgetArray[3] = w4;
		widgetArray[4] = w5;

		System.out.println("Print from example 2");
		printWidgetArray(widgetArray);

	}

	public static void printWidgetArray(Widget[] widgetArray) {

		for (int x = 0; x < widgetArray.length; x++) {
			System.out.println(widgetArray[x].getId());
		}

	}

}
