package com.github.rosjava_pkg_skku.jam_with_rosjava;

import org.apache.commons.logging.Log;
import org.ros.message.MessageListener;
import org.ros.namespace.GraphName;
import org.ros.node.ConnectedNode;
import org.ros.node.Node;
import org.ros.node.NodeMain;
import org.ros.node.topic.Subscriber;

import uos.ai.jam.Interpreter;
import uos.ai.jam.JAM;

public class JamNode implements NodeMain {

	@Override
	public void onError(Node arg0, Throwable arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onShutdown(Node arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onShutdownComplete(Node arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ConnectedNode arg0) {
		// TODO adding Listener, Talker class.  
		
		//adding subscriber and publisher to communicate.
		new NodeCommunicator(arg0);
		
		Interpreter i = JAM.parse("/home/tj/rosjava/rosjava_ws_skku/tutorial/tutorial_StockRoom/simul");
		i.run();
	}

	@Override
	public GraphName getDefaultNodeName() {
		// TODO Auto-generated method stub
		return GraphName.of("rosjava/JAM");
	}

}
