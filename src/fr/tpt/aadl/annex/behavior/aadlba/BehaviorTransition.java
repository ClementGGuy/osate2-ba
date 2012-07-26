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
 * A representation of the model object '<em><b>Behavior Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getSourceState <em>Source State</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getDestinationState <em>Destination State</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getActionBlock <em>Action Block</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getBehaviorTransition()
 * @model
 * @generated
 */
public interface BehaviorTransition extends BehaviorNamedElement
{
  /**
	 * Returns the value of the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Source State</em>' reference.
	 * @see #setSourceState(BehaviorState)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getBehaviorTransition_SourceState()
	 * @model required="true"
	 * @generated
	 */
  BehaviorState getSourceState();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getSourceState <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source State</em>' reference.
	 * @see #getSourceState()
	 * @generated
	 */
  void setSourceState(BehaviorState value);

  /**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(BehaviorCondition)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getBehaviorTransition_Condition()
	 * @model
	 * @generated
	 */
  BehaviorCondition getCondition();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
  void setCondition(BehaviorCondition value);

  /**
	 * Returns the value of the '<em><b>Destination State</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination State</em>' reference.
	 * @see #setDestinationState(BehaviorState)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getBehaviorTransition_DestinationState()
	 * @model required="true"
	 * @generated
	 */
  BehaviorState getDestinationState();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getDestinationState <em>Destination State</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination State</em>' reference.
	 * @see #getDestinationState()
	 * @generated
	 */
  void setDestinationState(BehaviorState value);

  /**
	 * Returns the value of the '<em><b>Action Block</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Block</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Block</em>' reference.
	 * @see #setActionBlock(BehaviorActionBlock)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getBehaviorTransition_ActionBlock()
	 * @model
	 * @generated
	 */
  BehaviorActionBlock getActionBlock();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getActionBlock <em>Action Block</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Block</em>' reference.
	 * @see #getActionBlock()
	 * @generated
	 */
  void setActionBlock(BehaviorActionBlock value);

  /**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(long)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getBehaviorTransition_Priority()
	 * @model default="-1" unique="false" dataType="org.osate.aadl2.Integer"
	 * @generated
	 */
  long getPriority();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
  void setPriority(long value);

} // BehaviorTransition
