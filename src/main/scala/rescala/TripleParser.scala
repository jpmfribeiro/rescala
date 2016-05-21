package rescala

import java.io.File

/**
  * Created by jpedro on 21.05.16.
  */
object TripleParser {

  // Parses a text file containing for each line a triple as in: SUBJECT[delim]PREDICATE[delim]OBJECT
  // [delim] represents the delimiter used and specified as @delim.
  def parse(filePath: String, delim: String = "\t"): Array[(String, String, String)] = {
    require(filePath.nonEmpty, "File path cannot be empty.")
    require(new File(filePath).exists(), "File '" + filePath + "' does not exist.")

    val tripleLines = io.Source.fromFile(filePath).getLines().toArray
    val triples = tripleLines.map(l => {
      val splitted = l.split(delim)
      assume(splitted.size == 3, "Line '" + l + "' does not contain a triple. Check the delimiter used.")

      (splitted(0), splitted(1), splitted(2))
    })

    return triples
  }

}
