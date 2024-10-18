package Org.howard.edu.lsp.midterm.question3;
import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
	private Map<String, Integer> candidates;
	
	public VotingMachine() {
		candidates = new HashMap<>();
	}
	public void addCandidate(String name) {
		candidates.put(name, 0);
	}
	
	public void castVote(String name) {
		if(candidates.containsKey(name)) {
			candidates.put(name, candidates.get(name) +1);
		}else {
			System.out.println("Candidate not found:" + name);
		}
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
			sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[]args) {
		VotingMachine vm = new VotingMachine();
		vm.addCandidate("Alsobrooks");
		vm.castVote("Alsobrooks");
		vm.addCandidate("Hogan");
		System.out.println(vm.toString());
	}
}
