package Final_Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAndList {

	public List<String> ListMethod()
	{
		List<String> ar2=new ArrayList<String>();
		ar2.add("A");
		ar2.add("B");
		return ar2;
	}

	public Set<Object> SetMethod()
	{
		Set<Object> s=new HashSet<Object>();
		s.add("B");
		s.add("C");
		s.add("H");
		s.add("B");
		s.add("C");
		return s;
		
	}
	
}
