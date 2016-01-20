public class OrganigramHandler {
	
	public static String getChainOfCommand(Employee e) {
		String dienstweg = e.getName() + "[" + e.getRole() + "] ";
		if (e.getSuperior() == null) {
			return dienstweg;
		}
		return dienstweg + "-> " + getChainOfCommand(e.getSuperior());
	}
	
	public static String processHierachy(Employee e) {
		if (e.getSubordinates().size() == 0) {
			return "- " + e.getRole() + " [" + e.getName() + "] \n";
		}
		String result = "+ " + e.getRole() + " (" + e.getName() + ") \n";
		for (Employee emp : e.getSubordinates()) {
			result += processHierachy(emp);
		}
		return result;
	}

}
