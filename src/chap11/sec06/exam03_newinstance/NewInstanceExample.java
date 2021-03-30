package chap11.sec06.exam03_newinstance;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
//			Class clazz = Class.forName("chap11.sec06.exam03_newinstance.SendAction");
			Class clazz = Class.forName(args[0]);
			Action action = (Action) clazz.newInstance();
			System.out.println(action);
			action.execute();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
