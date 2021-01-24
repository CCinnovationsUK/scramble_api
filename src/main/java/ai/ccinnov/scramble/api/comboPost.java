package ai.ccinnov.scramble.api;

public class comboPost {
    private String alias;
    private String inbox;

    comboPost(){}//Init class

    void setCombo(String alias,String inbox){
        this.alias = alias;
        this.inbox = inbox;
    }

//    boolean send(){
//        //Send the record to the db in another class
//        try{
//            //SQLITE ADD RECORD
//            System.out.println("Temporary Placeholder for Send to SQL Database Function");
//            return true;
//        }catch (Exception e){return false;}
//    }

    //Getters and Setters
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getInbox() {
        return inbox;
    }

    public void setInbox(String inbox) {
        this.inbox = inbox;
    }





}
