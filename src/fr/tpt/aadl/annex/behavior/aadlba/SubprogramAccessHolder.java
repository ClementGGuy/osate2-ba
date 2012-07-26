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

import org.osate.aadl2.SubprogramAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Access Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getSubprogramAccessHolder()
 * @model
 * @generated
 */
public interface SubprogramAccessHolder extends DispatchTriggerCondition, CalledSubprogramHolder
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model subprogramAccessRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='element = subprogramAccess ;'"
	 * @generated
	 */
  void setSubprogramAccess(SubprogramAccess subprogramAccess);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (SubprogramAccess) element;'"
	 * @generated
	 */
  SubprogramAccess getSubprogramAccess();

} // SubprogramAccessHolder
