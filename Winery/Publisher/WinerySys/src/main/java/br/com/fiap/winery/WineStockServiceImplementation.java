package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Paine Cabernet Sauvignon\nSierra Batuco\nPergola\nDom Bosco";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!\n\nTipo de uva: " + name + "\n Quantidade: " + quantity;
    }
}
