package ch08;

public class MyManagerUse {

	public static void main(String[] args) {
		//getInstance 호출해서 처음호출이면 score 멤버변수에 10을 초기화
		MyManager mgrobj=MyManager.getInstance();//static 바로 new없이 싱글톤기법
		System.out.println(mgrobj);
		System.out.println("mgrobj.getScore() :" +mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() :"+mgrobj.getScore());
		
		//두번째 호출이기 때문에 기존 객체의 주소값을 리턴받아옴
		MyManager newMgr=MyManager.getInstance()	;
		System.out.println(newMgr);
		System.out.println("newMgr.getScore() :"+newMgr.getScore());

	}

}
