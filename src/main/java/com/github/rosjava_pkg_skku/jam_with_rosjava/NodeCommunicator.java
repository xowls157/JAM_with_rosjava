package com.github.rosjava_pkg_skku.jam_with_rosjava;

import org.apache.commons.logging.Log;
import org.ros.message.MessageListener;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;
import org.ros.node.topic.Subscriber;
import geometry_msgs.Twist;

public class NodeCommunicator {
	public static Publisher<std_msgs.String> _MsgPub;
	public static Publisher<geometry_msgs.Twist> _TwistPub;
	public static Subscriber<std_msgs.String> _MsgSub;
	public static ConnectedNode _connectedNode;
	public static std_msgs.String _str;
	public static Twist _twist;
	
	public NodeCommunicator(ConnectedNode connectedNode){
		_connectedNode = connectedNode;
		
		try {
			_MsgPub = _connectedNode.newPublisher("chatter", std_msgs.String._TYPE);
			_TwistPub = _connectedNode.newPublisher("/turtle1/cmd_vel", geometry_msgs.Twist._TYPE);
			
			_str = _MsgPub.newMessage();
			_twist = _TwistPub.newMessage();
			Thread.sleep(1000);
			
			//adding subscriber to receiving message.
		    final Log log = connectedNode.getLog();
		    _MsgSub 
		    = connectedNode.newSubscriber("chatter", std_msgs.String._TYPE);
		    
		    //receive message asynchronously.
		    _MsgSub.addMessageListener(new MessageListener<std_msgs.String>() {
		        @Override
		        public void onNewMessage(std_msgs.String message) {
		          log.info("I heard: \"" + message.getData() + "\"");
		        }
		      });
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}