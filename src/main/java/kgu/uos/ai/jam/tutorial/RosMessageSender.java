package kgu.uos.ai.jam.tutorial;


import org.ros.node.topic.Publisher;
import geometry_msgs.Twist;
import com.github.rosjava_pkg_skku.jam_with_rosjava.NodeCommunicator;

public class RosMessageSender {
	
	public void sendActionMessage(int num) {
		Publisher<std_msgs.String> publisher = NodeCommunicator._publisher;
		Twist twist;
		
		try {
		
			if(num ==1 ) NodeCommunicator._str.setData("JAM's Massage : Move to location1");
			else if (num==2) NodeCommunicator._str.setData("JAM's Massage : Move arm");
			else if (num==3) NodeCommunicator._str.setData("JAM's Massage : Move arm picking up the object");
			else if (num==4) NodeCommunicator._str.setData("JAM's Massage : Move to location2");
			else if (num==5) NodeCommunicator._str.setData("JAM's Massage : Move arm putring down the object");
			else NodeCommunicator._str.setData("JAM's Massage : Unexpected instruction.");			
			
			System.out.println("message number : " + num);
			
	        publisher.publish(NodeCommunicator._str);

			/*
			if (num == 1) {
				String[] cmdArray01 = { "/home/ho/Desktop/stockrom_cell/1.py",
						"4", "10" };

				Process p = Runtime.getRuntime().exec(cmdArray01);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						p.getInputStream()));
				String line = null;

				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} else if (num == 2) {
				String[] cmdArray02 = { "/home/ho/Desktop/stockrom_cell/2.py",
						"4", "10" };

				Process p = Runtime.getRuntime().exec(cmdArray02);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						p.getInputStream()));
				String line = null;

				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} else if (num == 3) {
				String[] cmdArray03 = { "/home/ho/Desktop/stockrom_cell/3.py",
						"4", "10" };

				Process p = Runtime.getRuntime().exec(cmdArray03);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						p.getInputStream()));
				String line = null;

				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} else if (num == 4) {
				String[] cmdArray04 = { "/home/ho/Desktop/stockrom_cell/4.py",
						"4", "10" };

				Process p = Runtime.getRuntime().exec(cmdArray04);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						p.getInputStream()));
				String line = null;

				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} else if (num == 5) {
				String[] cmdArray05 = { "/home/ho/Desktop/stockrom_cell/5.py",
						"4", "10" };

				Process p = Runtime.getRuntime().exec(cmdArray05);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						p.getInputStream()));
				String line = null;

				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
			*/
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
