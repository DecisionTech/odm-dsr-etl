//      -----------------------------------------------------------------------
//      Licensed Materials - Property of IBM
//      IBM Decision Server
//      (c) Copyright IBM Corporation 1987, 2019. All Rights Reserved.
//      RuleApp: DeployForETLClient
//      Date: May 8, 2019, 12:35:08 PM
//      Generated by: Decision Server 8.10.0.0
//
//      N O T I C E
//
//      Changes to this file will be lost if the code is regenerated.
//      Note to U.S. Government Users Restricted Rights: 
//      Use, duplication or disclosure restricted by GSA ADP Schedule 
//      Contract with IBM Corp.
//     -----------------------------------------------------------------------

package javaetlclientforembeddedres;

import com.demo.Patient;

import javaetlclientforembeddedres.invocation.MedicalSupportRulesetExecution;

/**
 * Entry point of the application
 */
public class ApplyRulesToETLTransaction {

	/**
	 * Execution starts here...
	 */
	public static void main(String[] args) throws Exception {

		MedicalSupportRulesetExecution MedicalSupportRuleset = new MedicalSupportRulesetExecution();
		// TODO insert your code to initialize 'patient'
		MedicalSupportRuleset.setPatient(ApplyRulesToETLTransaction.getSampleTransaction());

		// This method invokes the ruleset 'MedicalSupportRuleset'
		MedicalSupportRuleset.run();

		// TODO insert your code to handle the response
		System.out.println(MedicalSupportRuleset.getPatient());
		System.out.println("######");
		System.out.println("Patient messages: ");
		for (Object string : MedicalSupportRuleset.getPatient().getMessages()) {
			System.out.println("     - " + string);
			
		}
		System.out.println("######");
	}
	
	public static Patient getSampleTransaction() {
		Patient patient = new com.demo.Patient();
		patient.setAge(20);
		patient.setEncounterDX("Acute Sinusitis");
		patient.setName("John Doe");
		patient.setPatientID("123");
		patient.setWeight(175);
		patient.addMessage("hello");;
		return patient;
	}

}
