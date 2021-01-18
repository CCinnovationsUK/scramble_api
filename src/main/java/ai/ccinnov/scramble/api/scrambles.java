package ai.ccinnov.scramble.api;

import java.util.ArrayList;
import java.util.List;

public class scrambles {
    private List<scrambleRecord> scrambleList;

    public List<scrambleRecord> getScrambleList(){ //This just sort of cleans up the private scrambleList
        if(scrambleList == null){
            scrambleList=new ArrayList<>();
        }
        return scrambleList;
    }
    public void setScrambleList(List<scrambleRecord> scrambleList){
        this.scrambleList=scrambleList;
    }
}
