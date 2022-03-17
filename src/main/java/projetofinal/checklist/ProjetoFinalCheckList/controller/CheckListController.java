package projetofinal.checklist.ProjetoFinalCheckList.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckList;
import projetofinal.checklist.ProjetoFinalCheckList.service.CheckListService;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/checklists")

public class CheckListController {
    private final CheckListService checkListService;

    @Autowired
    public CheckListController(final CheckListService checkListService) {
        this.checkListService = checkListService;
    }

    @GetMapping
    public ResponseEntity<List<CheckList>> listaTodosCheckLists() {
        return new ResponseEntity<>(checkListService.listaTodosCheckLists(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CheckList> getCheckListId(@PathVariable final int id) {
        return new ResponseEntity<>(checkListService.getCheckListId(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CheckList> cadastrarCheckList(@RequestBody final CheckList checkList) {
        return new ResponseEntity<>(checkListService.cadastrarCheckList(checkList), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/remove/{id}")
    public ResponseEntity<Void> remove(@PathVariable final int id) {
        checkListService.removeCheckList(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
