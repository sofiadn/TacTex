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
 */
/**
 * 
 */
package edu.utexas.cs.tactex.interfaces;

/**
 * @author urieli
 *
 */
public interface ContextManager {

  double getRevocationFee();

  double getSellerSurplusRatio();

  double getPPlusPrime();

  double getDefaultClearingPrice();

  double getDefaultSpotPrice();

  String getSettlementProcess();

  double getDefaultMargin();

  double getBankInterest();

  double getBalancingCost();

  double getPublicationFee();

  double getDistributionFee();
  
  double getPMinusPrime();
  
  int getTotalNumberOfCustomers();
  
}
