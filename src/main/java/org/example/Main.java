import org.example.EroeNonIdoneoException;
import org.example.Reclutatore;

void main(){
    int difficoltaMissione = 75;
    Reclutatore reclutatore = new Reclutatore();
    System.out.println("=== INIZIO SESSIONE DI RECLUTAMENTO (Difficoltà missione: " + difficoltaMissione + ") ===\n");
    for (int i = 1; i <= 5; i++) {
        System.out.println("--- Tentativo " + i + " ---");
        try {
            reclutatore.valutaCandidato(difficoltaMissione);
        } catch (EroeNonIdoneoException e) {
            System.out.println("Scartato: " + e.getMessage());
            System.out.println("Passaggio al candidato successivo...\n");
        }
    }
    System.out.println("=== SESSIONE DI RECLUTAMENTO TERMINATA ===");
}