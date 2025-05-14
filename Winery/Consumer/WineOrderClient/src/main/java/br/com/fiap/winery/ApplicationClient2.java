package br.com.fiap.winery;

import jakarta.xml.namespace.QName;
import jakarta.xml.ws.Service;
import java.net.URL;

public class ApplicationClient2 {
    public static void main( String[] args ) throws Exception {
        URL url2 = new URL("http://localhost:8085/WineStockService?wsdl");

        QName qName2 = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");

        Service service2 = Service.create(url2, qName2);

        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);

        String warn = wineWarningService.sendWarn();
        System.out.println(warn);
    }
}
