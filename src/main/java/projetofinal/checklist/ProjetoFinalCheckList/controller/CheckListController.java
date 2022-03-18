package projetofinal.checklist.ProjetoFinalCheckList.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckListEntity;
import projetofinal.checklist.ProjetoFinalCheckList.service.CheckListService;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/checklists")
public class CheckListController {

    @Autowired
    CheckListService checkListService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CheckListEntity> listAll() {
        return this.checkListService.findAll();
    }

//    public ResponseEntity<List<CheckList>> listaTodosCheckLists() {
//        return new ResponseEntity<>(checkListService.listaTodosCheckLists(), HttpStatus.OK);
//    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getCheckListId(@PathVariable(value = "id") Integer id){
        return checkListService.findById(id).map(record ->
                                                         ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
//    public ResponseEntity<CheckList> getCheckListId(@PathVariable final int id) {
//        return new ResponseEntity<>(checkListService.findById(id));
//    }
//
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CheckListEntity cadastrar(@RequestBody CheckListEntity checkList){
        return checkListService.save(checkList);
    }
//    public ResponseEntity<CheckList> cadastrarCheckList(@RequestBody final CheckList checkList) {
//        return new ResponseEntity<>(checkListService.save(checkList), HttpStatus.OK);
//    }
//
    @DeleteMapping(path = "/remove/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> remove(@PathVariable Integer id) {
        return checkListService.findById(id).map(record -> {
            checkListService.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
//    public ResponseEntity<Void> remove(@PathVariable final int id) {
//        checkListService.removeCheckList(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
