
package katalog;

/**
 *
 * @author PawelB
 */
class Patternplik extends Patternfolder{
  public Patternplik(String name,String type){
  super(name,type);
  }  
  @Override
    public void getInfo(){
    System.out.println(type+": "+name);
    } 
}
