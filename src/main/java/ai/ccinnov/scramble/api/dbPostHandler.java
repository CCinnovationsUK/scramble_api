package ai.ccinnov.scramble.api;

public class dbPostHandler {
    private static dbInterface _dbInterface = new dbInterface();
    static {
        _dbInterface.initDbConnection();
    }
    boolean sendCombo(comboPost cp){
        //Send the record to database
        //Placeholder below:
        try{
//            System.out.println("SendCombo placeholder");
//            System.out.println("Alias: "+cp.getAlias()
//                             +" Inbox: "+cp.getInbox());
            _dbInterface.postCombo(cp);
            return true;
        }catch (Exception e){
            //DB Addition failed, send up the tree
            return false;
        }
    }
}
