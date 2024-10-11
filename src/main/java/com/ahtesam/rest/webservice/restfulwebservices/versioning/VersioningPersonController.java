package com.ahtesam.rest.webservice.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Ahtesam Muhammad");
	}
     
    @GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("Ahtesam", "Muhhammad"));
	}

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParameters() {
        return new PersonV1("Bob Marley");
    }
    
    
    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParameters() {
        return new PersonV2(new Name("Bob", "Marley"));
    }
}
