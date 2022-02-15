package projetofinal.checklist.ProjetoFinalCheckList.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckList;
import projetofinal.checklist.ProjetoFinalCheckList.service.CheckListService;

import java.util.List;

@ComponentScan
@Log4j2
@Controller
@Mapper
@RestController
@RequiredArgsConstructor
@RequestMapping("/checklists")

public class CheckListController {
    private final CheckListService checkListService;

    //http://localhost:8080/checklists

    @GetMapping
    public ResponseEntity<List<CheckList>> listaTodosCheckLists() {
        return new ResponseEntity<>(checkListService.listaTodosCheckLists(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CheckList> getCheckListId(@PathVariable int id) {
        return new ResponseEntity<>(checkListService.getCheckListId(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CheckList> responderCheckList(@RequestBody CheckList checkList) {
        return new ResponseEntity<>(checkListService.responderCheckList(checkList), HttpStatus.CREATED);
    }

}
