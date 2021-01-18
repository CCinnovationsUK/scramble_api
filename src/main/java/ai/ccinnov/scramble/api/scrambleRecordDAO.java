package ai.ccinnov.scramble.api;

import org.springframework.stereotype.Repository;

@Repository
public class scrambleRecordDAO {
    private static scrambles list = new scrambles();

    static {
        list.getScrambleList().add(
                new scrambleRecord(
                        "oFkgHye12LLswKKDT@example.com",
                        "cameronbrown@yahoo.com"
                )
        );
    }

    public scrambles getAllScrambles(){return list;}

    public void addScrambleRecord(scrambleRecord record){
        list.getScrambleList().add(record);
    }
}
