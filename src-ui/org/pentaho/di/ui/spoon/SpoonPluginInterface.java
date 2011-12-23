/*
 * Copyright (c) 2010 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the GNU Lesser General Public License, Version 2.1. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.gnu.org/licenses/lgpl-2.1.txt. The Original Code is Pentaho 
 * Data Integration.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the GNU Lesser Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 */
package org.pentaho.di.ui.spoon;

import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.XulException;

public interface SpoonPluginInterface {
  
  
  public void applyToContainer(String category, XulDomContainer container) throws XulException ;
  
  /**
   * Provides an optional SpoonLifecycleListener to be notified of Spoon startup and shutdown.
   * 
   * @return optional SpoonLifecycleListener
   */
  public SpoonLifecycleListener getLifecycleListener();
  
  /**
   * Provides an optional SpoonPerspective.
   * 
   * @return optional SpoonPerspective
   */
  public SpoonPerspective getPerspective();
}
