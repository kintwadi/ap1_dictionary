package api.dictionary.marlene.model;

import java.io.Serializable;

public class Word implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int id;
	    private String word;
	    private String overView;
	    private String grammar;
	    private String definition;
	    private String tip;
	    private String eg;
	    private String phoneticText;
	    private String phoneticAudio;
	    private String toEnglish;
	    private String present;
	    private String past;
	    private String future;
	    private String nominative;
	    private String accusative;
	    private String dative;
	    private String genitive;
	    private String level;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getWord() {
			return word;
		}
		public void setWord(String word) {
			this.word = word;
		}
		public String getOverView() {
			return overView;
		}
		public void setOverView(String overView) {
			this.overView = overView;
		}
		public String getGrammar() {
			return grammar;
		}
		public void setGrammar(String grammar) {
			this.grammar = grammar;
		}
		public String getDefinition() {
			return definition;
		}
		public void setDefinition(String definition) {
			this.definition = definition;
		}
		public String getTip() {
			return tip;
		}
		public void setTip(String tip) {
			this.tip = tip;
		}
		public String getEg() {
			return eg;
		}
		public void setEg(String eg) {
			this.eg = eg;
		}
		public String getPhoneticText() {
			return phoneticText;
		}
		public void setPhoneticText(String phoneticText) {
			this.phoneticText = phoneticText;
		}
		public String getPhoneticAudio() {
			return phoneticAudio;
		}
		public void setPhoneticAudio(String phoneticAudio) {
			this.phoneticAudio = phoneticAudio;
		}
		public String getToEnglish() {
			return toEnglish;
		}
		public void setToEnglish(String toEnglish) {
			this.toEnglish = toEnglish;
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
		public String getFuture() {
			return future;
		}
		public void setFuture(String future) {
			this.future = future;
		}
		public String getNominative() {
			return nominative;
		}
		public void setNominative(String nominative) {
			this.nominative = nominative;
		}
		public String getAccusative() {
			return accusative;
		}
		public void setAccusative(String accusative) {
			this.accusative = accusative;
		}
		public String getDative() {
			return dative;
		}
		public void setDative(String dative) {
			this.dative = dative;
		}
		public String getGenitive() {
			return genitive;
		}
		public void setGenitive(String genitive) {
			this.genitive = genitive;
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
			builder.append("Word [id=");
			builder.append(id);
			builder.append(", word=");
			builder.append(word);
			builder.append(", overView=");
			builder.append(overView);
			builder.append(", grammar=");
			builder.append(grammar);
			builder.append(", definition=");
			builder.append(definition);
			builder.append(", tip=");
			builder.append(tip);
			builder.append(", eg=");
			builder.append(eg);
			builder.append(", phoneticText=");
			builder.append(phoneticText);
			builder.append(", phoneticAudio=");
			builder.append(phoneticAudio);
			builder.append(", toEnglish=");
			builder.append(toEnglish);
			builder.append(", present=");
			builder.append(present);
			builder.append(", past=");
			builder.append(past);
			builder.append(", future=");
			builder.append(future);
			builder.append(", nominative=");
			builder.append(nominative);
			builder.append(", accusative=");
			builder.append(accusative);
			builder.append(", dative=");
			builder.append(dative);
			builder.append(", genitive=");
			builder.append(genitive);
			builder.append(", level=");
			builder.append(level);
			builder.append("]");
			return builder.toString();
		}
	    
    

	

}
