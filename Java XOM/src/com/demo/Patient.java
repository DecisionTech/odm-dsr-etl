package com.demo;

import java.util.ArrayList;

public class Patient {
	
	private String patientID = "";
	private int age = 0;
	private String name = "";
	private int weight = 0;
	private int AST = 0;
	private ArrayList<Medication> activeMedications = new ArrayList<Medication>();
	private Medication recommendedDrug = new Medication("ndc not set", "name not set");
	private String recommendedDose = "";
	private float creatineLevel = 0;
	private ArrayList<Medication> allergies = new ArrayList<Medication>();
	private ArrayList<String> ndcAllergies = new ArrayList<String>();
	private String encounterDX = "";
	private ArrayList<String> problems = new ArrayList<String>();
	private ArrayList<String> messages = new ArrayList<String>();
	
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAST() {
		return AST;
	}
	public void setAST(int aST) {
		AST = aST;
	}
	public ArrayList<Medication> getActiveMedications() {
		return activeMedications;
	}
	public void setActiveMedications(ArrayList<Medication> activeMedications) {
		this.activeMedications = activeMedications;
	}
	public Medication getRecommendedDrug() {
		return recommendedDrug;
	}
	public void setRecommendedDrug(Medication recommendedDrug) {
		this.recommendedDrug = recommendedDrug;
	}
	public String getRecommendedDose() {
		return recommendedDose;
	}
	public void setRecommendedDose(String recommendedDose) {
		this.recommendedDose = recommendedDose;
	}
	public float getCreatineLevel() {
		return creatineLevel;
	}
	public void setCreatineLevel(float creatineLevel) {
		this.creatineLevel = creatineLevel;
	}
	public ArrayList<Medication> getAllergies() {
		return allergies;
	}
	public boolean hasAllergyWith(Medication allergy){
		return ndcAllergies.contains(allergy.getNDC());
	}
	public void setAllergies(ArrayList<Medication> allergies) {
		for(int i = 0; i < allergies.size(); i++){
			ndcAllergies.add(((Medication)allergies.get(i)).getNDC());
		}
		this.allergies = allergies;
	}
	public String getEncounterDX() {
		return encounterDX;
	}
	public void setEncounterDX(String encounterDX) {
		this.encounterDX = encounterDX;
	}
	public ArrayList<String> getProblems() {
		return problems;
	}
	public void setProblems(ArrayList<String> problems) {
		this.problems = problems;
	}
	public void addProblem(String problem) {
		this.problems.add(problem);
	}

	public ArrayList<String> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}
	public void addMessage(String message) {
		this.messages.add(message);
	}
}
