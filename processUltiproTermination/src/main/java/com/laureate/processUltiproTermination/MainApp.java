package com.laureate.processUltiproTermination;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
        	public void configure() {
        		from("file:/Users/ffernandez/Documents/source/inbox").to("file:/Users/ffernandez/Documents/source/outbox");
        	}
        });
        context.start();
        Thread.sleep(1000);
        context.stop();
    }

}

