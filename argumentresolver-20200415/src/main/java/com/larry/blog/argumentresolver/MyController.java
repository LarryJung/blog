package com.larry.blog.argumentresolver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua_parser.Client;

@RestController
@Slf4j
public class MyController {

    @GetMapping
    public ResponseEntity<Void> ipTest(@ParsedIp(defaultValue = "Hello ip") String ip,
                                       Client client) {
      log.info("ip address: {}", ip);
      log.info("client: {}", client.toString());
      return ResponseEntity.ok().build();
    }

}
