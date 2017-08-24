//  -*- Mode: Java -*-
//////////////////////////////////////////////////////////////////////////////
//  
//  $Id: PlanAtomicConstruct.java,v 1.1 2006/07/22 07:03:12 semix2 Exp $
//  $Source: /home/CVS/semix2/jam-060722/uos/ai/jam/PlanAtomicConstruct.java,v $
//  
//  File              : PlanAtomicConstruct.java
//  Original author(s): Jaeho Lee <jaeho@uos.ac.kr>
//                    : Marcus J. Huber <marcush@irs.home.com>
//  Created On        : Tue Sep 30 14:21:42 1997
//  Last Modified By  : Jaeho Lee <jaeho@david>
//  Last Modified On  : Mon Sep  6 17:54:01 2004
//  Update Count      : 17
//  
//  Copyright (C) 1997-2004 Jaeho Lee and Marcus J. Huber.
//  
//////////////////////////////////////////////////////////////////////////////
//
//  JAM agent architecture
//
//  Copyright (C) 1997-2004 Jaeho Lee and Marcus J. Huber.
//  
//  Permission is granted to copy and redistribute this software so long
//  as no fee is charged, and so long as the copyright notice above, this
//  grant of permission, and the disclaimer below appear in all copies
//  made.
//  
//  This software is provided as is, without representation as to its
//  fitness for any purpose, and without warranty of any kind, either
//  express or implied, including without limitation the implied
//  warranties of merchantability and fitness for a particular purpose.
//  Jaeho Lee and Marcus J. Huber shall not be liable for any damages,
//  including special, indirect, incidental, or consequential damages,
//  with respect to any claim arising out of or in connection with the
//  use of the software, even if they have been or are hereafter advised
//  of the possibility of such damages.
// 
//////////////////////////////////////////////////////////////////////////////

package uos.ai.jam.plan.constructor;

import java.io.Serializable;
import java.util.Vector;


/**
 * 
 * Represents a non-interruptable sequence of actions within plans
 * 
 * @author Jaeho Lee
 * @author Marc Huber
 * @version 1.1
 * 
 */

public class PlanAtomicConstruct extends PlanConstruct implements Serializable {
	private static final long serialVersionUID = -711881524159644975L;
	
	//
	// Members
	//
	protected PlanSequenceConstruct _constructs; // The actions in the construct

	//
	// Constructors
	//

	/**
	 * 
	 * 
	 */
	public PlanAtomicConstruct(PlanConstruct be) {
		_constructs = new PlanSequenceConstruct(be);
		_constructType = PLAN_ATOMIC;
	}

	//
	// Member functions
	//
	public int getNumConstructs() {
		return _constructs.getNumConstructs();
	}

	public PlanSequenceConstruct getSequence() {
		return _constructs;
	}

	public Vector<PlanConstruct> getConstructs() {
		return _constructs.getConstructs();
	}

	public PlanConstruct getConstruct(int n) {
		return _constructs.getConstruct(n);
	}

	public void insertConstruct(PlanConstruct be) {
		_constructs.insertConstruct(be);
	}

	/**
	 * 
	 * 
	 */
	public PlanRuntimeState newRuntimeState() {
		return new PlanRuntimeAtomicState(this);
	}

}
