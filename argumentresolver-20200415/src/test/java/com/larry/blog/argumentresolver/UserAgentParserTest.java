package com.larry.blog.argumentresolver;

import org.junit.jupiter.api.Test;
import ua_parser.Client;
import ua_parser.Parser;

import java.io.IOException;

public class UserAgentParserTest {

    @Test
    void parseTest() throws IOException {
        String uaString = "Mozilla/5.0 (iPhone; CPU iPhone OS 5_1_1 like Mac OS X) AppleWebKit/534.46 (KHTML, like Gecko) Version/5.1 Mobile/9B206 Safari/7534.48.3";

        Parser uaParser = new Parser();
        Client c = uaParser.parse(uaString);

        System.out.println(c.userAgent.family); // => "Mobile Safari"
        System.out.println(c.userAgent.major);  // => "5"
        System.out.println(c.userAgent.minor);  // => "1"

        System.out.println(c.os.family);        // => "iOS"
        System.out.println(c.os.major);         // => "5"
        System.out.println(c.os.minor);         // => "1"

        System.out.println(c.device.family);    // => "iPhone"
    }
}
