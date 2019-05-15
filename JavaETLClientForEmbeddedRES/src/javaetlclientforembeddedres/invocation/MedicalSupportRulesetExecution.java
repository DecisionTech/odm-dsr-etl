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

package javaetlclientforembeddedres.invocation;

import ilog.rules.res.session.IlrSessionRequest;
import ilog.rules.res.session.IlrSessionResponse;

/**
 * Wrapper class to facilitate the invocation of ruleset 'MedicalSupportRuleset'
 */
public class MedicalSupportRulesetExecution extends RulesetExecution {

	private com.demo.Patient patient;

	/**
	 * Returns the patient
	 */
	public com.demo.Patient getPatient() {
		return patient;
	}

	/**
	 * Sets the patient
	 */
	public void setPatient(com.demo.Patient patient) {
		this.patient = patient;
	}

	/**
	 * Path to the latest ruleset 'MedicalSupportRuleset' in the repository
	 */
	protected String getRulesetPath() {
		return "/DeployForETLClient/1.0/MedicalSupportRuleset";
	}

	/**
	 * Initialize the request session with values for input parameters
	 */
	protected void initRequest(IlrSessionRequest request) {
		request.setInputParameter("patient", this.patient);
	}

	/**
	 * Retrieves values in the response of output parameters
	 */
	protected void handleResponse(IlrSessionResponse response) {
		this.patient = (com.demo.Patient) response.getOutputParameters().get("patient");
	}

}