package Interface;

public class Compare {
	public static void main(String args[]) {
		System.out.println(findLargest(3,2));
	}

	public static Object findLargest(Object object1, Object object2) {
		Relatable obj1 = (Relatable) object1;
		Relatable obj2 = (Relatable) object2;
		if ((obj1).isLargerThan(obj2) > 0)
			return object1;
		else
			return object2;
	}

	public static Object findSmallest(Object object1, Object object2) {
		Relatable obj1 = (Relatable) object1;
		Relatable obj2 = (Relatable) object2;
		if ((obj1).isLargerThan(obj2) < 0)
			return object1;
		else
			return object2;
	}

	public static boolean isEqual(Object object1, Object object2) {
		Relatable obj1 = (Relatable) object1;
		Relatable obj2 = (Relatable) object2;
		if ((obj1).isLargerThan(obj2) == 0)
			return true;
		else
			return false;
	}
}
