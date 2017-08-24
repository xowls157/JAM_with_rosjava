package com.github.rosjava_pkg_skku.jam_with_rosjava;

import org.apache.commons.logging.Log;
import org.ros.message.MessageListener;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;
import org.ros.node.topic.Subscriber;

public class NodeCommunicator {
	public static Publisher<std_msgs.String> _publisher;
	public static Subscriber<std_msgs.String> _subscriber;
	public static std_msgs.String _str;
	public NodeCommunicator(ConnectedNode connectedNode){
		
		try {
			_publisher = connectedNode.newPublisher("chatter", std_msgs.String._TYPE);
			_str = _publisher.newMessage();
			
			Thread.sleep(1000);
			
			//adding subscriber to receiving message.
		    final Log log = connectedNode.getLog();
		    _subscriber 
		    = connectedNode.newSubscriber("chatter", std_msgs.String._TYPE);
		    
		    //receive message asynchronously.
		    _subscriber.addMessageListener(new MessageListener<std_msgs.String>() {
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