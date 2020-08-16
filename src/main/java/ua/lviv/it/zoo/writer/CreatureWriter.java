package ua.lviv.it.zoo.writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import ua.lviv.it.zoo.model.AbstractSwimmingCreature;

public class CreatureWriter {
  private Writer csvWriter=new StringWriter();

  public void setCsvWriter(Writer csvWriter) {
    this.csvWriter = csvWriter;
  }

  public void writeToFile(List<AbstractSwimmingCreature> creatures) throws IOException {
    for (AbstractSwimmingCreature creature : creatures) {
      csvWriter.write(creature.getHeaders());
      csvWriter.write(creature.toCsv());
      csvWriter.write("\r\n");
    }
    csvWriter.flush();
  }

  public static void readFromFile(String file) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
      String readText = "";
      while ((readText = reader.readLine()) != null) {
        System.out.println(readText);
      }
    }
  }
}
