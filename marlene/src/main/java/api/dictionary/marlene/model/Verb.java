package api.dictionary.marlene.model;

public class Verb {

	private String verb;
	private String present;
	private String past;
	private String perfect;
	private String future;
	private String level;
	
	public String getVerb() {
		return verb;
	}
	public void setVerb(String verb) {
		this.verb = verb;
	}
	public String getPresent() {
		return present;
	}
	public void setPresent(String present) {
		this.present = present;
	}
	public String getPast() {
		return past;
	}
	public void setPast(String past) {
		this.past = past;
	}
	public String getPerfect() {
		return perfect;
	}
	public void setPerfect(String perfect) {
		this.perfect = perfect;
	}
	public String getFuture() {
		return future;
	}
	public void setFuture(String future) {
		this.future = future;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Verb [verb=");
		builder.append(verb);
		builder.append(", present=");
		builder.append(present);
		builder.append(", past=");
		builder.append(past);
		builder.append(", perfect=");
		builder.append(perfect);
		builder.append(", future=");
		builder.append(future);
		builder.append(", level=");
		builder.append(level);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
