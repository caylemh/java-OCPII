
package ch7_GenericsCollections.generics;


public class CacheString {
  
    private String message;
  
    public void add(String message){
        this.message = message;
    }
  
    public String get(){
        return this.message;
    }  
  
}
