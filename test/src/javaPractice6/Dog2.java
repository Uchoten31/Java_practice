package javaPractice6;

public class Dog2 {

	 private String Name;
	 private int Age;
	 private String DogBreed;
	 

	  // コンストラクタ
	 public Dog2(String db) {
		 DogBreed = db;
	 }
	 
	    public void SetName( String nm )
	    {
	        Name = nm;
	    }

	    public void ShowProfile()
	    {
	    	System.out.println( "犬種は、" + DogBreed + "です。" );
	        System.out.println( "名前は、" + Name + "です。" );
	        System.out.println( "年齢は、" + Age + "歳です。" );
	    }
	    
	    public void SetAge( int age ) {
	    	Age = age; 
	    }
	    
	  
	    
	    
	}
