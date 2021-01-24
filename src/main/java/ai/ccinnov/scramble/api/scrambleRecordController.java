package ai.ccinnov.scramble.api;

import ai.ccinnov.scramble.api.scrambleRecord;
import ai.ccinnov.scramble.api.scrambles;
import ai.ccinnov.scramble.api.scrambleRecordDAO;

import java.net.URI;
import org.springframework.beans
        .factory.annotation.Autowired;
import org.springframework.http
        .ResponseEntity;
import org.springframework.web.bind
        .annotation.GetMapping;
import org.springframework.web.bind
        .annotation.PostMapping;
import org.springframework.web.bind
        .annotation.RequestBody;
import org.springframework.web.bind
        .annotation.RequestMapping;
import org.springframework.web.bind
        .annotation.RestController;
import org.springframework.web.servlet
        .support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path="/scrambles")

public class scrambleRecordController {
    @Autowired
    private scrambleRecordDAO _scrambleRecordDAO;
    private dbPostHandler handler = new dbPostHandler();

    //GET req
    @GetMapping(path = "/",produces = "application/json")
    public scrambles getScrambles(){
        return _scrambleRecordDAO.getAllScrambles();
    }

    //POST req
    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Object> addScrambleRecord(@RequestBody scrambleRecord record){

//        Integer id = _scrambleRecordDAO.getAllScrambles().getScrambleList().size();
//        record.setId(id);

        _scrambleRecordDAO.addScrambleRecord(record);
        comboPost cp = new comboPost();
        cp.setCombo(record.getAlias(),record.getInbox());
        handler.sendCombo(cp);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/").buildAndExpand().toUri();

        return ResponseEntity.created(location).build();
    }
}
