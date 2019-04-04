
package katalog;

/**
 *
 * @author PawelB
 */
abstract class Patternfolder {
    public Patternfolder(String name,String type){
    this.name=name;
    this.type=type;
    }
    public abstract void getInfo();
    protected String name;
    protected String type; 
}
