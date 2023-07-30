import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.File;
import java.io.IOException;

public class PdfErsteller {
    public static void main(String[] args) {
        String outputPath = "C:\\Users\\Tayfun\\Desktop\\"; // Der Dateipfad des Zielverzeichnisses
        String fileName = "MeinePDF.pdf"; // Der Dateiname der PDF-Datei

        try {
            // Erstellen eines neuen PDF-Dokuments
            PDDocument document = new PDDocument();

            // Hinzufügen einer leeren Seite
            PDPage blankPage = new PDPage();
            document.addPage(blankPage);

            // Vollständiger Pfad zur PDF-Datei
            String fullPath = outputPath + fileName;

            // Speichern des PDF-Dokuments
            document.save(fullPath);

            // Schließen des Dokuments
            document.close();

            System.out.println("PDF wurde erfolgreich erstellt und gespeichert: " + fullPath);
        } catch (IOException e) {
            System.err.println("Fehler beim Erstellen oder Speichern der PDF-Datei: " + e.getMessage());
        }
    }
}
