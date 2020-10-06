package dictionary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WordController {
    @GetMapping("/word/get")
    public Word getWordDefinitionsByString(@RequestParam(value = "q", required = false) String query) {
        if (query == null) {
            return new Word(-1,query,"x");
        } else {
            return new Word(1,query,"x");
        }
    }
}