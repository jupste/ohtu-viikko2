/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa;

/**
 *
 * @author jussiste
 */
public interface VarastoInterface {

    Tuote haeTuote(int id);

    void otaVarastosta(Tuote t);
    Kirjanpito getKirjanpito();
    void palautaVarastoon(Tuote t);

    int saldo(int id);
    
}
