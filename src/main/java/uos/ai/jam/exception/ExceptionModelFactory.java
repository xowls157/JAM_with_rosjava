package uos.ai.jam.exception;

/**
 * Exception model�� �����ϱ� ���� factory ��ü
 * 
 * @author	Hyunju Shin <jetzt82@gmail.com>
 * @since	2.0
 * @update	2.0
 */
public interface ExceptionModelFactory {
	/**
	 * ExceptionModel tree���� �ֻ���(root) node�� �����ϴ� �޼ҵ�.
	 * ����� null�� ��ȯ�ؼ��� �� ��.
	 */
	public ExceptionTreeNode newExceptionModel();
	
	/**
	 * �־��� canonicalName exception node�� �����ϴ� �޼ҵ�.
	 * �ٸ� node���� link ������ ExceptionManager ���ο��� ó����.
	 */
	public ExceptionTreeNode newExceptionTreeNode(String canonicalName);
}
