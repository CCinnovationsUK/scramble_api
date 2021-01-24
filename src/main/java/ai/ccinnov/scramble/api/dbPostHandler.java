package ai.ccinnov.scramble.api;

public class dbPostHandler {
    boolean sendCombo(comboPost cp){
        //Send the record to database
        //Placeholder below:
        try{
            System.out.println("SendCombo placeholder");
            System.out.println("Alias: "+cp.getAlias()
                             +" Inbox: "+cp.getInbox());
            return true;
        }catch (Exception e){
            //DB Addition failed, send up the tree
            return false;
        }
    }
}
