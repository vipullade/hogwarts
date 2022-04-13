package edu.tcu.cs.hogwartsartifactsonline.controller;

import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.service.ArtifactsService;
import org.springframework.web.bind.annotation.*;

import edu.tcu.cs.hogwartsartifactsonline.domain.Result;
import java.util.List;

@RestController
@RequestMapping("/artifacts")
public class ArtifactController {
    private ArtifactsService artifactsService;
    //spring will automatically inject a instance of artifactdao into this class.
    public ArtifactController(ArtifactsService artifactsService) {
        this.artifactsService = artifactsService;
    }

    @GetMapping
    public Result findAll(){
    List<Artifact> all = artifactsService.findAll();
        Result result = new Result(true, 200, "fine all success", all);
        return result;
    }
    @GetMapping("{artifactId}")
    public Result findById(@PathVariable String artifactId){
        return new Result(true, 200, "find one Success", artifactsService.findById(artifactId));

    }
    @PostMapping
    public Result save(@RequestBody Artifact newArtifact){
        artifactsService.save(newArtifact);
        return new Result(true, 200, "save success");
    }
    @PutMapping("/{artifactId}")
    public Result update(@PathVariable String artifactId, @RequestBody Artifact updatedArtifact ){
        artifactsService.update(artifactId, updatedArtifact);
        return new Result(true, 200, "upadate Success");
    }
    @DeleteMapping("/{artifactId}")
    public Result delete(@PathVariable String artifactId){
        artifactsService.delete(artifactId);
        return new Result(true, 200, "delete Success");
    }

}
