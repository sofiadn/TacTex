/*
 * TacTex - a power trading agent that competed in the Power Trading Agent Competition (Power TAC) www.powertac.org
 * Copyright (c) 2013-2016 Daniel Urieli and Peter Stone {urieli,pstone}@cs.utexas.edu               
 *
 *
 * This file is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This file is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * This file incorporates work covered by the following copyright and  
 * permission notice:  
 *
 *     Copyright (c) 2014 by John Collins
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package edu.utexas.cs.tactex.servercustomers.common.interfaces;

/**
 * Implementers of this interface will be asked to record their state at the
 * end of a bootstrap session, for restoration at the beginning of the
 * corresponding sim session.
 * 
 * @author John Collins
 */
public interface BootstrapState
{
  /**
   * Saves state at the conclusion of a bootstrap session as configuration
   * items. State can then be restored at the beginning of
   * the sim session through the normal configuration process. The usual
   * way to save state is to call
   * ServerPropertiesService.saveBootstrapState(arg), where arg is either a
   * single configurable object (configured with configureMe() or
   * configureSingleton()), or a list of objects annotated with
   * @ConfigurableInstance.
   */
  public void saveBootstrapState();
}
