package katalog;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author PawelB
 */
public class Folder extends Patternfolder {

    private final static Path FPath = Paths.get("data");
    private static Path newFPath;

    public Folder(String name, String type) {
        super(name, type);
    }

    public void dodaj(Patternfolder x) {
        fold.add(x);
        save(x);
     //   saveplik(x);
    }

    protected void save(Patternfolder x) {
        if (x.type.equals("Folder")) {
            File folder = new File(String.valueOf(FPath));
            if (!Files.exists(FPath)) {
                folder.mkdirs();
            }
            newFPath = Paths.get(FPath + "/" + x.name);
            folder = new File(String.valueOf(newFPath));
            folder.mkdirs();
        }
         if(x.type.equals("Plik")){
            File plik=new File(String.valueOf(newFPath));
        Path newFPath = Paths.get(FPath + "/" + x.name);
            plik = new File(String.valueOf(newFPath));
            plik.mkdirs();
        
    }
    }
    
//    protected void saveplik(Patternfolder x){
//    if(x.type.equals("Plik")){
//    File plik=new File(String.valueOf(FPath));
//    
//    }
//    
//    }

    protected ArrayList<Patternfolder> fold = new ArrayList();

    @Override
    public void getInfo() {
        System.out.println(type + ": " + name + ":");
        for (Patternfolder x : fold) {
            x.getInfo();
        }
    }

}
