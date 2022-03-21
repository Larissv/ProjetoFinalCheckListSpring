package projetofinal.checklist.ProjetoFinalCheckList.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;
import projetofinal.checklist.ProjetoFinalCheckList.service.CheckListService;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/checklists")
public class CheckListController {

    CheckListService checkListService;

    public CheckListController(final CheckListService checkListService) {this.checkListService = checkListService;}

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CheckListEntity> listAll() {
        return this.checkListService.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getCheckListId(@PathVariable(value = "id") Integer id){
        return checkListService.findById(id).map(record ->
                                                         ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CheckListEntity cadastrar(@RequestBody CheckListEntity checkList){
        return checkListService.save(checkList);
    }

    @DeleteMapping(path = "/remove/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> remove(@PathVariable Integer id) {
        return checkListService.findById(id).map(record -> {
            checkListService.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
