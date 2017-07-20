package StringBuilder;

public class MyArrayList {
	  /**
     * The value is used for Object storage.
     */
    Object[] value;

    /**
     * The count is the number of Object used.
     */
    int size;
    public MyArrayList(){
    	value=new Object[16];
    }
    public MyArrayList(int size){
    	value=new Object[size];
    }
    public void add(Object obj){
    	value[size]=obj;
    	size++;
    }
    public Object get(int index){
    	
    	if(index<0||index>size-1){
    		try{
    			throw new Exception();
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}
		return value[index];
    }
    
    public static void main(String[] args){
    	MyArrayList list = new MyArrayList();
    	list.add("Echo");
    	list.add(new People("严佳音"));
    	People peo=(People)list.get(1);
    	System.out.println(peo.getName());
    	System.out.println(list.get(0));
    }
}
