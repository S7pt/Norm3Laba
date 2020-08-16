package ua.lviv.it.zoo.writer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import org.junit.jupiter.api.Test;

import ua.lviv.it.zoo.manager.BaseZooManagerTest;
import ua.lviv.it.zoo.model.AbstractSwimmingCreature;

class CreatureWriterTest extends BaseZooManagerTest {

  @Test
  void testWriteToFile() throws IOException {
    try (Writer fileWriter = new FileWriter("Creatures.csv")) {
      CreatureWriter writer = new CreatureWriter();
      createCreature();
      writer.setCsvWriter(fileWriter);
      writer.writeToFile(creatures);
      fileWriter.flush();
    }
  }

  @Test
  void testProperTextFormatting() throws IOException {
    try (Writer csvWriter = new StringWriter()) {
      CreatureWriter writer = new CreatureWriter();
      writer.setCsvWriter(csvWriter);
      createCreature();
      writer.writeToFile(creatures);
      String expectedText = "";
      for (AbstractSwimmingCreature creature : creatures) {
        expectedText += creature.getHeaders() + creature.toCsv() + "\r\n";
      }

      assertEquals(expectedText, csvWriter.toString());
      CreatureWriter.readFromFile("Creatures.csv");
    }
  }
}
