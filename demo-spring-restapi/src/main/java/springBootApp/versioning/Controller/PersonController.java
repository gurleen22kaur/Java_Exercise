package springBootApp.versioning.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springBootApp.versioning.Name;
import springBootApp.versioning.PersonV1;
import springBootApp.versioning.PersonV2;

@RestController
public class PersonController {

    //URI Versioning
    @GetMapping("/person/V1")
    PersonV1 getPersonV1() {
        return new PersonV1("Peter Parker");
    }

    @GetMapping("/person/V2")
    PersonV2 getPersonV2() {
        return new PersonV2(new Name("Peter","Parker"));
    }

    //Parameter Versioning
    @GetMapping(value = "/person/param",params = "version=1")
    PersonV1 getPersonParam1() {
        return new PersonV1("Peter Parker");
    }

    @GetMapping(value = "/person/param",params = "version=2")
    PersonV2 getPersonParam2() {
        return new PersonV2(new Name("Peter","Parker"));
    }

    //Header versioning
    @GetMapping(value = "/person/produces",produces = "application/app-v1+json")
    PersonV1 getPersonProducer1() {
        return new PersonV1("Peter Parker");
    }

    @GetMapping(value = "/person/produces",produces = "application/app-v2+json")
    PersonV2 getPersonProducer2() {
        return new PersonV2(new Name("Peter","Parker"));
    }




}

