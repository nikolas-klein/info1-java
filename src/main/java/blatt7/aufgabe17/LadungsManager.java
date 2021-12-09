package blatt7.aufgabe17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LadungsManager {

	public long getAnzahlSchwereProdukte(List<Ladung> ladung) {
		return ladung.stream().filter(kg -> (kg.getGewichtInKG()/1000) >= 100).count();
	}
	
	public boolean passtAufSchiff(Schiff schiff, List<Ladung> ladung) {
		int weightKG = ladung.stream().mapToInt(Ladung::getGewichtInKG).sum();
		double volumeCM3 = ladung.stream().mapToDouble(Ladung::getVolumenCM3).sum();

		return weightKG <= (schiff.getMaxGewichtInT() * 1000)
				&& (volumeCM3 / 1000000) <= schiff.getMaxM3Volumen();
	}
}
