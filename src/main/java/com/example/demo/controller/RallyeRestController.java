package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.model.EpreuveSpeciale;
import com.example.demo.model.Equipage;
import com.example.demo.model.Participant;
import com.example.demo.model.Rallye;
import com.example.demo.model.TempsEpreuve;
import com.example.demo.repository.EpreuveRepository;
import com.example.demo.repository.EquipageRepository;
import com.example.demo.repository.ParticipantRepository;
import com.example.demo.repository.RallyeRepository;
import com.example.demo.repository.TempsRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rallyes")
public class RallyeRestController {

    private final RallyeRepository rallyeRepository;
    private final EpreuveRepository epreuveRepository;
    private final TempsRepository tempsRepository;
    private final ParticipantRepository participantRepository;
    private final EquipageRepository equipageRepository;

    public RallyeRestController(RallyeRepository rallyeRepository,
                               EpreuveRepository epreuveRepository,
                               TempsRepository tempsRepository,
                               ParticipantRepository participantRepository,
                               EquipageRepository equipageRepository) {
        this.rallyeRepository = rallyeRepository;
        this.epreuveRepository = epreuveRepository;
        this.tempsRepository = tempsRepository;
        this.participantRepository = participantRepository;
        this.equipageRepository = equipageRepository;
    }

    // GET /rallyes
    @GetMapping("")
    public List<Rallye> allRallyes() {
        return rallyeRepository.findAll();
    }

    // GET /rallyes/{rallye_id}/speciales
    @GetMapping("/{rallyeId}/speciales")
    public List<EpreuveSpeciale> getSpeciales(@PathVariable Integer rallyeId) {
        return epreuveRepository.findByIdRallye(rallyeId);
    }

    // GET /rallyes/{rallye_id}/speciales/{speciale_id}/temps
    @GetMapping("/{rallyeId}/speciales/{specialeId}/temps")
    public List<TempsEpreuve> getTempsForSpeciale(@PathVariable Integer rallyeId,
                                                  @PathVariable Integer specialeId) {
        return tempsRepository.findBySpeciale(specialeId);
    }

    // GET /rallyes/{rallye_id}/pilotes
    @GetMapping("/{rallyeId}/pilotes")
    public List<Participant> getPilotes(@PathVariable Integer rallyeId) {
        return participantRepository.findPilotesByRallyeId(rallyeId);
    }

    // GET /rallyes/{rallye_id}/speciales/{speciale_id}/pilotes/{pilote_id}/temps
    @GetMapping("/{rallyeId}/speciales/{specialeId}/pilotes/{piloteId}/temps")
    public List<TempsEpreuve> getTempsForPilotOnSpeciale(@PathVariable Integer rallyeId,
                                                        @PathVariable Integer specialeId,
                                                        @PathVariable Integer piloteId) {
        // find equipages for pilot within this rallye
        List<Equipage> equipages = equipageRepository.findByPiloteIdAndRallye(piloteId, rallyeId);
        List<TempsEpreuve> res = equipages.stream()
                .flatMap(e -> tempsRepository.findBySpecialeAndEquipage(specialeId, e.getIdEquipage()).stream())
                .collect(Collectors.toList());
        return res;
    }

    // GET /rallyes/{rallye_id}/pilotes/{pilote_id}/temps
    @GetMapping("/{rallyeId}/pilotes/{piloteId}/temps")
    public List<TempsEpreuve> getTempsForPilot(@PathVariable Integer rallyeId,
                                              @PathVariable Integer piloteId) {
        List<Equipage> equipages = equipageRepository.findByPiloteIdAndRallye(piloteId, rallyeId);
        List<Integer> equipageIds = equipages.stream().map(Equipage::getIdEquipage).collect(Collectors.toList());
        if (equipageIds.isEmpty()) return List.of();
        return tempsRepository.findByEquipageIds(equipageIds);
    }
}
