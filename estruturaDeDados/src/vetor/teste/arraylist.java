package vetor.teste;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		
		System.out.println(existe);
		
		int pos = arrayList.indexOf("C");
		
		System.out.println(pos);
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(2);
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
	}
}
