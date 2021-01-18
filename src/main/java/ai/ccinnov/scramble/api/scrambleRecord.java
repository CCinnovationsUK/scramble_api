package ai.ccinnov.scramble.api;

public class scrambleRecord {
    public scrambleRecord(){}

    public scrambleRecord(
            String alias,
            String inbox){
        super();
        this.alias = alias;
        this.inbox = inbox;
        //this.id = id;
    }

    private String alias;
    private String inbox;

    //private Integer id;

    @Override
    public String toString(){
        return "scrambleRecord [alias="
                +alias+", inbox ="
                +inbox+"]";
    }

    //Autogen Getters & Setters
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
