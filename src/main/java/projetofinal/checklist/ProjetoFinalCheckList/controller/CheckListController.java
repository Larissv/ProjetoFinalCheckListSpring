package projetofinal.checklist.ProjetoFinalCheckList.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListPostDto;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListRetornoDto;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;
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
    public ResponseEntity<List<CheckListRetornoDto>> listAll() {
        return new ResponseEntity<>(checkListMapper.listAllDto(checkListService.findAll()), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CheckListRetornoDto> getCheckListId(@PathVariable(value = "id") Integer id) {
        return new ResponseEntity<>(checkListMapper.checkListRetornoDto(checkListService.findById(id).get()),
                                    HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CheckListPostDto> cadastrar(@RequestBody CheckListPostDto dto) {
        CheckListEntity checkListEntity = this.checkListMapper.checkListPostDto(dto);
        checkListService.save(checkListEntity);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/remove/{id}")
    public ResponseEntity<?> remove(@Validated @PathVariable(value = "id") Integer id) {
        return checkListService.findById(id).map(record -> {
            checkListService.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Erro! Entidade nao encontrada!"));
    }
}
