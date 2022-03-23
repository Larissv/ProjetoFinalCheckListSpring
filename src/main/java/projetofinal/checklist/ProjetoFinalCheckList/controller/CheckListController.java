package projetofinal.checklist.ProjetoFinalCheckList.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListGetDto;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListPostDto;
import projetofinal.checklist.ProjetoFinalCheckList.mapper.CheckListMapper;
import projetofinal.checklist.ProjetoFinalCheckList.service.CheckListService;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/checklists")
public class CheckListController {

    private final CheckListMapper checkListMapper;
    private final CheckListService checkListService;

    @Autowired
    public CheckListController(CheckListMapper checkListMapper, CheckListService checkListService) {
        this.checkListMapper = checkListMapper;
        this.checkListService = checkListService;
    }

    @GetMapping
    public ResponseEntity<List<CheckListGetDto>> listAll() {
        return new ResponseEntity<>(checkListMapper.listAllDto(checkListService.findAll()), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CheckListGetDto> getCheckListId(@PathVariable(value = "id") Integer id) {
        return new ResponseEntity<>(checkListMapper.checkListGetDto(checkListService.findById(id).get()),
                                    HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CheckListGetDto> cadastrar(@RequestBody CheckListPostDto dto) {
        checkListService.save(checkListMapper.checkListPostDto(dto));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/remove/{id}")
    public ResponseEntity<?> remove(@PathVariable Integer id) {
        checkListService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
        //        return checkListService.findById(id).map(record -> {
        //            checkListService.deleteById(id);
        //            return ResponseEntity.ok().build();
        //        }).orElse(ResponseEntity.notFound().build());
    }
}
