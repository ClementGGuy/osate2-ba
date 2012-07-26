/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the Eclipse Public License as published by Eclipse, either
 * version 1.0 of the License, or (at your option) any later version. This
 * program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse Public License for
 * more details. You should have received a copy of the Eclipse Public License
 * along with this program. If not, see
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
package fr.tpt.aadl.annex.behavior.aadlba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Send Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.PortSendAction#getPort <em>Port</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.PortSendAction#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getPortSendAction()
 * @model
 * @generated
 */
public interface PortSendAction extends CommunicationAction
{
  /**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(ActualPortHolder)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getPortSendAction_Port()
	 * @model containment="true" required="true"
	 * @generated
	 */
  ActualPortHolder getPort();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.PortSendAction#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
  void setPort(ActualPortHolder value);

  /**
	 * Returns the value of the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Expression</em>' containment reference.
	 * @see #setValueExpression(ValueExpression)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getPortSendAction_ValueExpression()
	 * @model containment="true"
	 * @generated
	 */
  ValueExpression getValueExpression();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.PortSendAction#getValueExpression <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' containment reference.
	 * @see #getValueExpression()
	 * @generated
	 */
  void setValueExpression(ValueExpression value);

} // PortSendAction
